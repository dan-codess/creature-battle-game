public class PokeBall {
	public enum Type {
        POKEBALL, GREATBALL, ULTRABALL, MASTERBALL
    }

    private Type type;
    private double catchRate;

    public PokeBall(Type type, double catchRate) {
        this.type = type;
        this.catchRate = catchRate;
    }

    public boolean catchPokemon(Pokemon pokemon) {
        // Implement catch logic based on catchRate
        return Math.random() < this.catchRate;
    }

    public Type getType() {
        return type;
    }

    public double getCatchRate() {
        return catchRate;
    }
}



