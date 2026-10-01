import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PokemonGame {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Player player = new Player();
	        player.loadPokemonCollection("pokemon_collection.txt");
	        System.out.println("Press Enter to start game!");
	        scanner.nextLine();
	        System.out.println("Game Started!");
	        System.out.println("");

	        List<WildPokemon> allPokemons = PokemonList.getPredefinedPokemons();
	        List<WildPokemon> selectedWildPokemons = selectRandomWildPokemons(allPokemons);
	        
	        System.out.println("A rustling sound is heard...");
	        System.out.println("There's something moving in the grass!");
	        System.out.println("");
	        System.out.println("Three wild Pokémon appeared!");
	        // Let player choose one Pokemon to catch initially
	        System.out.println("Choose a Pokémon to catch:");
	        for (int i = 0; i < selectedWildPokemons.size(); i++) {
	            WildPokemon wp = selectedWildPokemons.get(i);
	            System.out.println((i + 1) + ". " + wp.getName() + " (HP: " + wp.getHp() + ", Type: " + wp.getDefenderType() + ", Move: " + wp.getMovesetType() +")");
	        }

	        int choice = scanner.nextInt() - 1;
	        scanner.nextLine();  // Consume the newline character
	        if (choice >= 0 && choice < selectedWildPokemons.size()) {
	            WildPokemon capturedPokemon = selectedWildPokemons.get(choice);
	            player.addPokemon(capturedPokemon.toPokemon());
	            System.out.println("\nYou caught " + capturedPokemon.getName() + "!");
	            displayPokemonDetails(capturedPokemon);
	            selectedWildPokemons.remove(choice); // Remove the chosen Pokemon from the wildPokemons list
	        } else {
	            WildPokemon capturedPokemon = selectedWildPokemons.get(0);
	            player.addPokemon(capturedPokemon.toPokemon()); // Default to first Pokemon if choice is invalid
	            System.out.println("You caught " + capturedPokemon.getName() + "!");
	            displayPokemonDetails(capturedPokemon);
	            selectedWildPokemons.remove(0); // Remove the first Pokemon from the wildPokemons list
	        }

	        // Let player choose two Pokemon from their collection for battle
	        System.out.println("Choose your first Pokémon for the battle:");
	        for (int i = 0; i < player.getPokemonCollection().size(); i++) {
	            Pokemon p = player.getPokemonCollection().get(i);
	            System.out.println((i + 1) + ". " + p.getName() + " (HP: " + p.getHp() + ", Type: " + p.getDefenderType() + ", Move: " + p.getMovesetType() +")");
	        }

	        List<Pokemon> selectedPokemons = new ArrayList<>();
	        choice = scanner.nextInt() - 1;
	        scanner.nextLine();  // Consume the newline character
	        if (choice >= 0 && choice < player.getPokemonCollection().size()) {
	            selectedPokemons.add(player.getPokemonCollection().get(choice));
	        } else {
	            System.out.println("Invalid choice.");
		        System.out.println("");
	        }
	        
	        System.out.println("");
	        System.out.println("Choose your second Pokémon for the battle (or press 0 to skip):");
	        for (int i = 0; i < player.getPokemonCollection().size(); i++) {
	            if (!selectedPokemons.contains(player.getPokemonCollection().get(i))) {
	                Pokemon p = player.getPokemonCollection().get(i);
		            System.out.println((i + 1) + ". " + p.getName() + " (HP: " + p.getHp() + ", Type: " + p.getDefenderType() + ", Move: " + p.getMovesetType() +")");
	            }
	        }

	        choice = scanner.nextInt() - 1;
	        scanner.nextLine();  // Consume the newline character
	        if (choice >= 0 && choice < player.getPokemonCollection().size() && !selectedPokemons.contains(player.getPokemonCollection().get(choice))) {
	            selectedPokemons.add(player.getPokemonCollection().get(choice));
	        } else if (choice != -1) {
	            System.out.println("Invalid choice.");
		        System.out.println("");
	        }

	        // Start a battle with the remaining wild Pokemon
	        if (!selectedWildPokemons.isEmpty() && !selectedPokemons.isEmpty()) {
	            Battle battle = new Battle(player, selectedWildPokemons, selectedPokemons, scanner);
	            battle.startBattle();
	        } else {
	            System.out.println("No wild Pokémon left to battle or no Pokémon selected for battle.");
	        }

	        player.savePokemonCollection("pokemon_collection.txt");

	        scanner.close();
	    }

	    private static List<WildPokemon> selectRandomWildPokemons(List<WildPokemon> allPokemons) {
	        List<WildPokemon> selectedWildPokemons = new ArrayList<>();
	        Random random = new Random();
	        List<WildPokemon> availablePokemons = new ArrayList<>(allPokemons); // Copy of allPokemons to modify

	        for (int i = 0; i < 3; i++) {
	            WildPokemon selectedPokemon = getRandomWildPokemon(availablePokemons, random);
	            selectedWildPokemons.add(selectedPokemon);
	            availablePokemons.remove(selectedPokemon); // Remove the selected Pokemon to avoid duplicates (preferably no duplicates to avoid confusion)
	        }

	        return selectedWildPokemons;
	    }

	    private static WildPokemon getRandomWildPokemon(List<WildPokemon> availablePokemons, Random random) {
	        double totalWeight = 0;
	        List<Double> cumulativeWeights = new ArrayList<>();

	        for (WildPokemon wp : availablePokemons) {
	            double weight = getSelectionWeight(wp.getHp());
	            totalWeight += weight;
	            cumulativeWeights.add(totalWeight);
	        }

	        double randomValue = random.nextDouble() * totalWeight;

	        for (int i = 0; i < cumulativeWeights.size(); i++) {
	            if (randomValue <= cumulativeWeights.get(i)) {
	                return availablePokemons.get(i);
	            }
	        }

	        // Default to the first Pokemon if something goes wrong (shouldn't happen)
	        return availablePokemons.get(0);
	    }

	    private static double getSelectionWeight(int hp) {
	        if (hp >= 0 && hp <= 50) {
	            return 0.70;
	        } else if (hp >= 51 && hp <= 70) {
	            return 0.15;
	        } else if (hp >= 71 && hp <= 90) {
	            return 0.10;
	        } else if (hp >= 91 && hp <= 150) {
	            return 0.05;
	        } else if (hp >= 151 && hp <= 255) {
	            return 0.01;
	        }
	        return 0; // For Pokemon outside the specified HP range (shouldn't have)
	    }

	    private static void displayPokemonDetails(WildPokemon pokemon) {
	        System.out.println("");
	        System.out.println("-----Stats-----");
	        System.out.println("Pokemon: " + pokemon.getName());
	        System.out.println("HP: " + pokemon.getHp());
	        System.out.println("Type: " + pokemon.getDefenderType());
	        System.out.println("Move: " + pokemon.getMovesetType());
	        System.out.println("---------------");
	        System.out.println("");
	    }

}
