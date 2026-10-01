import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battle {
	 private Player player;
	    private List<WildPokemon> wildPokemons;
	    private List<Pokemon> selectedPokemons;
	    private Scanner scanner;
	    private Random random = new Random();
	    private static boolean legendaryEncountered = false; // Static flag to track if a legendary Pokemon has appeared
	    private ScoreManager scoreManager;
	    private int turnsTaken;
	    private int wildPokemonsCaptured;
	    public Battle(Player player, List<WildPokemon> wildPokemons, List<Pokemon> selectedPokemons, Scanner scanner) {
	        this.player = player;
	        this.wildPokemons = wildPokemons;
	        this.selectedPokemons = selectedPokemons;
	        this.scanner = scanner;
	        this.scoreManager = new ScoreManager();
	        this.turnsTaken = 0;
	        this.wildPokemonsCaptured = 0;
	    }

	    public void startBattle() {
	        while (!allWildPokemonsDefeated() && selectedPokemons.stream().anyMatch(p -> !p.isDefeated())) {
	        	turnsTaken++; // Increment turn count at the start of each round
	            // Player's turn
	            for (Pokemon selectedPokemon : selectedPokemons) {
	                if (!selectedPokemon.isDefeated() && !allWildPokemonsDefeated()) {
	        	        System.out.println("");
	                    System.out.println("Choose a wild Pokémon for " + selectedPokemon.getName() + " to attack:");
	                    for (int i = 0; i < wildPokemons.size(); i++) {
	                        WildPokemon wp = wildPokemons.get(i);
	                        if (!wp.isDefeated()) {
	                            System.out.println((i + 1) + ". " + wp.getName() + " (HP: " + wp.getHp() + ", Type: " + wp.getDefenderType() + ", Move: " + wp.getMovesetType() + ")");
	                        }
	                    }

	                    int targetChoice = scanner.nextInt() - 1;
	                    if (targetChoice >= 0 && targetChoice < wildPokemons.size() && !wildPokemons.get(targetChoice).isDefeated()) {
	                        WildPokemon targetWildPokemon = wildPokemons.get(targetChoice);
	                        selectedPokemon.attack(targetWildPokemon);
	                        if (targetWildPokemon.isDefeated()) {
	                	        System.out.println("");
	                            System.out.println("Wild " + targetWildPokemon.getName() + " is defeated!");
	                            attemptCatch(targetWildPokemon);
	                        }
	                    } else {
	                        System.out.println("Invalid choice or wild Pokémon is defeated. Try again.");
	                    }
	                }
	            }

	            if (!allWildPokemonsDefeated()) {
	                // Wild Pokemon's turn
	                for (WildPokemon wp : wildPokemons) {
	                    if (!wp.isDefeated()) {
	            	        System.out.println("");
	                        System.out.println("Wild " + wp.getName() + " is attacking!");
	                        Pokemon opponentTarget = selectedPokemons.stream()
	                                .filter(p -> !p.isDefeated())
	                                .findAny()
	                                .orElse(null);

	                        if (opponentTarget != null) {
	                            wp.attack(opponentTarget);

	                        }
	                    }
	                }
	            }

	            // Display user Pokémon's HP after all wild Pokemon have attacked
	            displayUserPokemonsHp();
	        }

	        if (allWildPokemonsDefeated()) {
		        System.out.println("");
	            System.out.println("All wild Pokémon are defeated!");
	            triggerLegendaryEvent();
	        } else {
		        System.out.println("");
	            System.out.println("All your Pokémon are defeated!");
	        }
	        
	        calculateAndDisplayScore();
	        scoreManager.displayTopScores();

	        // Heal player's Pokemon after the battle
	        for (Pokemon p : selectedPokemons) {
	            p.getHp();
	            p.resetHp();
	        }

	        
	    }

	    private void displayUserPokemonsHp() {
	        System.out.println("");
	        System.out.println("-----Your Pokémon's HP-----");
	        for (Pokemon p : selectedPokemons) {
	            System.out.println(p.getName() + ": " + p.getHp() + " HP");
	        }
	        System.out.println("---------------------------");
	    }

	    private boolean allWildPokemonsDefeated() {
	        return wildPokemons.stream().allMatch(Pokemon::isDefeated);
	    }

	    private void attemptCatch(WildPokemon wildPokemon) {
	        System.out.println("");
	        System.out.println("Press Enter to give PokéBall.");
	        scanner.nextLine(); // Wait for user to press Enter
	        scanner.nextLine(); // Wait for user to press Enter again

	        PokeBall pokeBall = getRandomPokeBall();
	        System.out.println("You got a " + pokeBall.getType() + "!");

	        System.out.println("Press Enter to throw ball.");
	        scanner.nextLine(); // Wait for user to press Enter again

	        if (pokeBall.catchPokemon(wildPokemon)) {
	            System.out.println("You caught " + wildPokemon.getName() + "!");
	            wildPokemon.resetHp(); // Restore HP to original
	            player.addPokemon(wildPokemon);
	            wildPokemons.remove(wildPokemon); // Remove captured Pokemon from the wildPokemons list
	            displayPokemonDetails(wildPokemon); // Display captured Pokemon details
	            
	            // Check if the captured Pokemon is not legendary or mythical
	            if (!PokemonList.getLegendaryPokemons().contains(wildPokemon) && !PokemonList.getMythicalPokemons().contains(wildPokemon)) {
	                wildPokemonsCaptured++;
	            }
	        } else {
	            System.out.println("The wild " + wildPokemon.getName() + " escaped!");
	        }
	    }

	    private PokeBall getRandomPokeBall() {
	        double rand = Math.random() * 100;
	        if (rand < 56) {
	            return new PokeBall(PokeBall.Type.POKEBALL, 0.25);
	        } else if (rand < 81) {
	            return new PokeBall(PokeBall.Type.GREATBALL, 0.5);
	        } else if (rand < 99) {
	            return new PokeBall(PokeBall.Type.ULTRABALL, 0.75);
	        } else {
	            return new PokeBall(PokeBall.Type.MASTERBALL, 1.0);
	        }
	    }

	    private void triggerLegendaryEvent() {
	        if (!legendaryEncountered) {
	            double chance = random.nextDouble();
	            if (chance < 1.00) {
	                legendaryEncountered = true;
	    	        System.out.println("");
	    	        System.out.println("What's this??");
	                System.out.println("A Legendary/Mythical Pokémon heard your Pokémon's roar!");
	                System.out.println("A Legendary/Mythical Pokémon has appeared!");
	                List<WildPokemon> legendaryMythicalPokemons = new ArrayList<>();
	                legendaryMythicalPokemons.addAll(PokemonList.getLegendaryPokemons());
	                legendaryMythicalPokemons.addAll(PokemonList.getMythicalPokemons());

	                WildPokemon legendaryMythicalPokemon = legendaryMythicalPokemons.get(random.nextInt(legendaryMythicalPokemons.size()));

	                System.out.println("You encountered " + legendaryMythicalPokemon.getName() + "!");

	                System.out.print("Do you want to battle this Pokémon? (yes/no): ");
	                scanner.nextLine(); // Consume the newline
	                String playerChoice = scanner.nextLine().trim().toLowerCase();

	                if (playerChoice.equals("yes")) {
	                    // Reset player's Pokemon HP
	                    for (Pokemon p : selectedPokemons) {
	                        p.resetHp();
	                    }

	                    // Battle with the special Pokemon
	                    List<WildPokemon> eventBattle = new ArrayList<>();
	                    eventBattle.add(legendaryMythicalPokemon);
	                    Battle specialBattleInstance = new Battle(player, eventBattle, selectedPokemons, scanner);
	                    specialBattleInstance.startBattle();
	                } else {
	        	        System.out.println("");
	                    System.out.println("You decided not to battle the Legendary/Mythical Pokémon!");
	                    System.out.println("You ran away!");
	                }
	            } else {
	    	        System.out.println("");
	                System.out.println("No Legendary/Mythical appeared.");
	            }
	        } else {
		        System.out.println("");
	            System.out.println("No Legendary/Mythical appeared.");
	        }
	    }



	    private void calculateAndDisplayScore() {
	        int defeatedPokemons = player.getPokemonCollection().size();
	        int score = scoreManager.calculateScore(turnsTaken, wildPokemonsCaptured, defeatedPokemons);
	        System.out.println("");
	        System.out.println("----------------------------");
	        System.out.println("Your Battle Score: " + score);
	        scoreManager.saveScore(score);
	    }

	    private void displayPokemonDetails(WildPokemon pokemon) {
	        System.out.println("");
	        System.out.println("-----Stats-----");
	        System.out.println("Pokemon: " + pokemon.getName());
	        System.out.println("HP: " + pokemon.getHp());
	        System.out.println("Type: " + pokemon.getDefenderType());
	        System.out.println("Attacking Move: " + pokemon.getMovesetType());
	        System.out.println("---------------");
	    }
	}
