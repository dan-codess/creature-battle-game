
public class Pokemon {
	 private String name;
	    private int hp;
	    private int originalHp;
	    private String defenderType;
	    private String moveType;
	    private String movesetType;

	    public Pokemon(String name, int hp, String defenderType, String moveType, String movesetType) {
	        this.name = name;
	        this.hp = hp;
	        this.originalHp = hp; // Initialize original HP
	        this.defenderType = defenderType;
	        this.moveType = moveType;
	        this.movesetType = movesetType;
	    }

	    // Getters
	    public String getName() { return name; }
	    public int getHp() { return hp; }
	    public String getDefenderType() { return defenderType; }
	    public String getMoveType() { return moveType; }
	    public String getMovesetType() { return movesetType; }


	    // Attack method
	    public void attack(Pokemon opponent) {
	        System.out.println("");
	        int damage = calculateDamage(opponent);
	        opponent.takeDamage(damage);
	        System.out.println(this.name + " attacks " + opponent.getName() + " causing " + damage + " damage!");
	        
	        
	        double effectiveness = TypeEffectiveness.getEffectiveness(this.moveType, opponent.getDefenderType());
	        if (effectiveness == 2.0) {
	        	System.out.println("It's super effective!");
	        	
	        } else if (effectiveness == 0.5) {
	          System.out.println("It's not very effective!");
	        }

	    }

	    // Take damage method
	    public void takeDamage(int damage) {
	        this.hp -= damage;
	        if (this.hp < 0) {
	            this.hp = 0;
	        }
	    }

	    // Check if defeated
	    public boolean isDefeated() {
	        return this.hp == 0;
	    }

	    // Calculate damage method
	    private int calculateDamage(Pokemon opponent) {
	        // Basic damage calculation based on moveType and defenderType
	        int baseDamage = 10; // Placeholder value, refine based on your logic
	        double effectiveness = TypeEffectiveness.getEffectiveness(this.moveType, opponent.getDefenderType());
	        return (int)(baseDamage * effectiveness);
	        
	    }

	    // Reset HP to original value
	    public void resetHp() {
	        this.hp = this.originalHp;
	    }

	    // Convert to string for saving to file
	    public String toFileString() {
	        return name + "," + originalHp + "," + defenderType + "," + moveType + "," + movesetType;
	    }

	    // Create a Pokemon from a string read from file
	    public static Pokemon fromFileString(String fileString) {
	        String[] parts = fileString.split(",");
	        if (parts.length != 5) {
	            throw new IllegalArgumentException("Invalid Pokémon data: " + fileString);
	        }
	        return new Pokemon(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3], parts[4]);
	    }


}
