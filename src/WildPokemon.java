import java.io.Serializable;

public class WildPokemon extends Pokemon implements Serializable {
    private static final long serialVersionUID = 1L;

    // Constructor for WildPokemon class.
    public WildPokemon(String name, int hp, String defenderType, String moveType, String movesetType) {
        super(name, hp, defenderType, moveType, movesetType);
    }

    // Convert a WildPokemon instance back into a Pokemon instance.
    public Pokemon toPokemon() {
        return new Pokemon(this.getName(), this.getHp(), this.getDefenderType(), this.getMoveType(), this.getMovesetType());
    }
}
