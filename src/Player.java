import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Pokemon> pokemonCollection;

    public Player() {
        this.pokemonCollection = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonCollection.add(pokemon);
    }

    public List<Pokemon> getPokemonCollection() {
        return this.pokemonCollection;
    }

    public void savePokemonCollection(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Pokemon p : pokemonCollection) {
                writer.println(p.toFileString());
            }
            System.out.println("Pokémon collection saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving Pokémon collection: " + e.getMessage());
        }
    }

    public void loadPokemonCollection(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Pokemon p = Pokemon.fromFileString(line);
                    pokemonCollection.add(p);
                } catch (IllegalArgumentException e) {
                    System.out.println("Skipping invalid Pokémon data: " + line);
                }
            }
            System.out.println("Pokémon collection loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading Pokémon collection: " + e.getMessage());
        }
    }
}



