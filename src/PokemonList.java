import java.util.ArrayList;
import java.util.List;

public class PokemonList {
	public static List<WildPokemon> getPredefinedPokemons() {
        List<WildPokemon> allPokemons = new ArrayList<>();
        
        // Pokemon List
        // Generation 1 (Kanto)
        allPokemons.add(new WildPokemon("Bulbasaur", 45, "Grass", "Grass", "Vine Whip"));
        allPokemons.add(new WildPokemon("Charmander", 39, "Fire", "Fire", "Flamethrower"));
        allPokemons.add(new WildPokemon("Squirtle", 44, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Pikachu", 35, "Electric", "Electric", "Thunderbolt"));
        allPokemons.add(new WildPokemon("Eevee", 55, "Normal", "Normal", "Quick Attack"));
        allPokemons.add(new WildPokemon("Jigglypuff", 115, "Normal", "Normal", "Sing"));
        allPokemons.add(new WildPokemon("Meowth", 40, "Normal", "Normal", "Scratch"));
        allPokemons.add(new WildPokemon("Psyduck", 50, "Water", "Water", "Confusion"));
        allPokemons.add(new WildPokemon("Machop", 70, "Fighting", "Fighting", "Karate Chop"));
        allPokemons.add(new WildPokemon("Magnemite", 25, "Electric", "Electric", "Thunder Shock"));
        allPokemons.add(new WildPokemon("Snorlax", 160, "Normal", "Normal", "Body Slam"));
        allPokemons.add(new WildPokemon("Dratini", 41, "Dragon", "Dragon", "Dragon Rage"));
        allPokemons.add(new WildPokemon("Horsea", 30, "Water", "Water", "Bubble"));
        allPokemons.add(new WildPokemon("Gastly", 30, "Ghost", "Ghost", "Lick"));
        allPokemons.add(new WildPokemon("Staryu", 30, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Tangela", 65, "Grass", "Grass", "Bind"));
        allPokemons.add(new WildPokemon("Cubone", 50, "Ground", "Ground", "Bone Club"));
        allPokemons.add(new WildPokemon("Doduo", 35, "Normal", "Normal", "Fury Attack"));
        allPokemons.add(new WildPokemon("Grimer", 80, "Poison", "Poison", "Sludge"));
        allPokemons.add(new WildPokemon("Onix", 35, "Rock", "Ground", "Rock Throw"));
        
     // Generation 2 (Johto)
        allPokemons.add(new WildPokemon("Chikorita", 45, "Grass", "Grass", "Razor Leaf"));
        allPokemons.add(new WildPokemon("Cyndaquil", 39, "Fire", "Fire", "Flame Wheel"));
        allPokemons.add(new WildPokemon("Totodile", 50, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Togepi", 35, "Fairy", "Fairy", "Metronome"));
        allPokemons.add(new WildPokemon("Mareep", 55, "Electric", "Electric", "Thunder Shock"));
        allPokemons.add(new WildPokemon("Espeon", 65, "Psychic", "Psychic", "Psychic"));
        allPokemons.add(new WildPokemon("Umbreon", 95, "Dark", "Dark", "Faint Attack"));
        allPokemons.add(new WildPokemon("Wobbuffet", 190, "Psychic", "Psychic", "Counter"));
        allPokemons.add(new WildPokemon("Scizor", 70, "Steel", "Steel", "Metal Claw"));
        allPokemons.add(new WildPokemon("Heracross", 80, "Bug", "Bug", "Megahorn"));
        allPokemons.add(new WildPokemon("Slugma", 40, "Fire", "Fire", "Ember"));
        allPokemons.add(new WildPokemon("Swinub", 50, "Ice", "Ice", "Powder Snow"));
        allPokemons.add(new WildPokemon("Teddiursa", 60, "Normal", "Normal", "Scratch"));
        allPokemons.add(new WildPokemon("Phanpy", 90, "Ground", "Ground", "Tackle"));
        allPokemons.add(new WildPokemon("Smeargle", 55, "Normal", "Normal", "Sketch"));
        allPokemons.add(new WildPokemon("Smoochum", 45, "Ice", "Ice", "Powder Snow"));
        allPokemons.add(new WildPokemon("Elekid", 45, "Electric", "Electric", "Thunder Punch"));
        allPokemons.add(new WildPokemon("Magby", 45, "Fire", "Fire", "Ember"));
        allPokemons.add(new WildPokemon("Larvitar", 50, "Rock", "Rock", "Bite"));
        allPokemons.add(new WildPokemon("Miltank", 95, "Normal", "Normal", "Stomp"));

        // Generation 3 (Hoenn)
        allPokemons.add(new WildPokemon("Treecko", 40, "Grass", "Grass", "Pound"));
        allPokemons.add(new WildPokemon("Torchic", 45, "Fire", "Fire", "Ember"));
        allPokemons.add(new WildPokemon("Mudkip", 50, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Ralts", 28, "Psychic", "Psychic", "Confusion"));
        allPokemons.add(new WildPokemon("Aron", 50, "Steel", "Steel", "Headbutt"));
        allPokemons.add(new WildPokemon("Swablu", 45, "Flying", "Flying", "Peck"));
        allPokemons.add(new WildPokemon("Trapinch", 45, "Ground", "Ground", "Bite"));
        allPokemons.add(new WildPokemon("Feebas", 20, "Water", "Water", "Tackle"));
        allPokemons.add(new WildPokemon("Bagon", 45, "Dragon", "Dragon", "Dragon Breath"));
        allPokemons.add(new WildPokemon("Beldum", 40, "Psychic", "Psychic", "Take Down"));
        allPokemons.add(new WildPokemon("Poochyena", 35, "Dark", "Dark", "Bite"));
        allPokemons.add(new WildPokemon("Zigzagoon", 38, "Normal", "Normal", "Tackle"));
        allPokemons.add(new WildPokemon("Wurmple", 45, "Bug", "Bug", "Tackle"));
        allPokemons.add(new WildPokemon("Lotad", 40, "Water", "Water", "Astonish"));
        allPokemons.add(new WildPokemon("Seedot", 40, "Grass", "Grass", "Bide"));
        allPokemons.add(new WildPokemon("Slakoth", 60, "Normal", "Normal", "Scratch"));
        allPokemons.add(new WildPokemon("Makuhita", 72, "Fighting", "Fighting", "Arm Thrust"));
        allPokemons.add(new WildPokemon("Nincada", 31, "Bug", "Bug", "Scratch"));
        allPokemons.add(new WildPokemon("Kecleon", 60, "Normal", "Normal", "Lick"));
        allPokemons.add(new WildPokemon("Wailmer", 130, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Shroomish", 60, "Grass", "Grass", "Absorb"));
        
     // Generation 4 (Sinnoh)
        allPokemons.add(new WildPokemon("Turtwig", 55, "Grass", "Grass", "Razor Leaf"));
        allPokemons.add(new WildPokemon("Chimchar", 44, "Fire", "Fire", "Flame Wheel"));
        allPokemons.add(new WildPokemon("Piplup", 53, "Water", "Water", "Bubble Beam"));
        allPokemons.add(new WildPokemon("Shinx", 45, "Electric", "Electric", "Spark"));
        allPokemons.add(new WildPokemon("Budew", 40, "Grass", "Grass", "Mega Drain"));
        allPokemons.add(new WildPokemon("Riolu", 40, "Fighting", "Fighting", "Force Palm"));
        allPokemons.add(new WildPokemon("Gible", 58, "Dragon", "Dragon", "Dragon Rage"));
        allPokemons.add(new WildPokemon("Lucario", 70, "Fighting", "Fighting", "Aura Sphere"));
        allPokemons.add(new WildPokemon("Hippopotas", 68, "Ground", "Ground", "Crunch"));
        allPokemons.add(new WildPokemon("Croagunk", 48, "Poison", "Poison", "Poison Jab"));

        // Generation 5 (Unova)
        allPokemons.add(new WildPokemon("Snivy", 45, "Grass", "Grass", "Vine Whip"));
        allPokemons.add(new WildPokemon("Tepig", 65, "Fire", "Fire", "Flame Charge"));
        allPokemons.add(new WildPokemon("Oshawott", 55, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Purrloin", 41, "Dark", "Dark", "Scratch"));
        allPokemons.add(new WildPokemon("Blitzle", 45, "Electric", "Electric", "Spark"));
        allPokemons.add(new WildPokemon("Roggenrola", 55, "Rock", "Rock", "Headbutt"));
        allPokemons.add(new WildPokemon("Timburr", 75, "Fighting", "Fighting", "Low Kick"));
        allPokemons.add(new WildPokemon("Throh", 120, "Fighting", "Fighting", "Vital Throw"));
        allPokemons.add(new WildPokemon("Venipede", 30, "Poison", "Poison", "Poison Tail"));
        allPokemons.add(new WildPokemon("Sandile", 50, "Dark", "Dark", "Bite"));
        allPokemons.add(new WildPokemon("Zorua", 40, "Dark", "Dark", "Feint Attack"));
        allPokemons.add(new WildPokemon("Minccino", 55, "Normal", "Normal", "Double Slap"));
        allPokemons.add(new WildPokemon("Deerling", 60, "Normal", "Normal", "Tackle"));
        allPokemons.add(new WildPokemon("Emolga", 55, "Electric", "Electric", "Quick Attack"));
        allPokemons.add(new WildPokemon("Joltik", 50, "Bug", "Bug", "Electroweb"));
        allPokemons.add(new WildPokemon("Ferroseed", 44, "Grass", "Grass", "Metal Claw"));
        allPokemons.add(new WildPokemon("Klink", 40, "Steel", "Steel", "Charge Beam"));
        allPokemons.add(new WildPokemon("Litwick", 50, "Ghost", "Ghost", "Ember"));
        allPokemons.add(new WildPokemon("Axew", 46, "Dragon", "Dragon", "Dragon Rage"));
        allPokemons.add(new WildPokemon("Golett", 59, "Ground", "Ground", "Mud-Slap"));

        // Generation 6 (Kalos)
        allPokemons.add(new WildPokemon("Chespin", 56, "Grass", "Grass", "Vine Whip"));
        allPokemons.add(new WildPokemon("Fennekin", 40, "Fire", "Fire", "Ember"));
        allPokemons.add(new WildPokemon("Froakie", 41, "Water", "Water", "Bubble"));
        allPokemons.add(new WildPokemon("Bunnelby", 38, "Normal", "Normal", "Tackle"));
        allPokemons.add(new WildPokemon("Fletchling", 45, "Flying", "Flying", "Peck"));
        allPokemons.add(new WildPokemon("Scatterbug", 38, "Bug", "Bug", "Tackle"));
        allPokemons.add(new WildPokemon("Litleo", 62, "Fire", "Fire", "Ember"));
        allPokemons.add(new WildPokemon("Flabébé", 44, "Fairy", "Fairy", "Fairy Wind"));
        allPokemons.add(new WildPokemon("Skiddo", 66, "Grass", "Grass", "Vine Whip"));
        allPokemons.add(new WildPokemon("Espurr", 62, "Psychic", "Psychic", "Confusion"));
        allPokemons.add(new WildPokemon("Pancham", 67, "Fighting", "Fighting", "Arm Thrust"));
        allPokemons.add(new WildPokemon("Helioptile", 44, "Electric", "Electric", "Thunder Shock"));
        allPokemons.add(new WildPokemon("Furfrou", 75, "Normal", "Normal", "Headbutt"));
        allPokemons.add(new WildPokemon("Swirlix", 62, "Fairy", "Fairy", "Draining Kiss"));
        allPokemons.add(new WildPokemon("Inkay", 53, "Dark", "Dark", "Peck"));
        allPokemons.add(new WildPokemon("Binacle", 42, "Rock", "Rock", "Scratch"));
        allPokemons.add(new WildPokemon("Spritzee", 78, "Fairy", "Fairy", "Fairy Wind"));
        allPokemons.add(new WildPokemon("Skrelp", 50, "Poison", "Poison", "Water Gun"));
        allPokemons.add(new WildPokemon("Clauncher", 50, "Water", "Water", "Bubble"));
        allPokemons.add(new WildPokemon("Noibat", 40, "Flying", "Flying", "Wing Attack"));


     // Generation 7 (Alola)
        allPokemons.add(new WildPokemon("Rowlet", 68, "Grass", "Grass", "Leafage"));
        allPokemons.add(new WildPokemon("Litten", 45, "Fire", "Fire", "Ember"));
        allPokemons.add(new WildPokemon("Popplio", 50, "Water", "Water", "Water Gun"));
        allPokemons.add(new WildPokemon("Pikipek", 35, "Normal", "Normal", "Peck"));
        allPokemons.add(new WildPokemon("Yungoos", 48, "Normal", "Normal", "Tackle"));
        allPokemons.add(new WildPokemon("Grubbin", 47, "Bug", "Bug", "Vice Grip"));
        allPokemons.add(new WildPokemon("Rockruff", 45, "Rock", "Rock", "Rock Throw"));
        allPokemons.add(new WildPokemon("Komala", 65, "Normal", "Normal", "Wood Hammer"));
        allPokemons.add(new WildPokemon("Toucannon", 80, "Normal", "Normal", "Bullet Seed"));
        allPokemons.add(new WildPokemon("Vikavolt", 77, "Bug", "Bug", "Thunderbolt"));
        allPokemons.add(new WildPokemon("Bruxish", 68, "Water", "Water", "Aqua Jet"));
        allPokemons.add(new WildPokemon("Cutiefly", 40, "Bug", "Bug", "Absorb"));
        allPokemons.add(new WildPokemon("Togedemaru", 65, "Electric", "Electric", "Spark"));
        allPokemons.add(new WildPokemon("Mimikyu", 55, "Ghost", "Ghost", "Shadow Claw"));
        allPokemons.add(new WildPokemon("Mudbray", 70, "Ground", "Ground", "Stomp"));
        allPokemons.add(new WildPokemon("Salandit", 48, "Poison", "Poison", "Toxic"));
        allPokemons.add(new WildPokemon("Stufful", 70, "Normal", "Normal", "Brutal Swing"));
        allPokemons.add(new WildPokemon("Bounsweet", 42, "Grass", "Grass", "Razor Leaf"));
        allPokemons.add(new WildPokemon("Wimpod", 45, "Bug", "Bug", "Struggle Bug"));
        allPokemons.add(new WildPokemon("Sandygast", 55, "Ghost", "Ghost", "Astonish"));


        
        
        
        return allPokemons;
    }
    
    
    public static List<WildPokemon> getLegendaryPokemons() {
        List<WildPokemon> legendaryPokemons = new ArrayList<>();

        // Legendary Pokémon list
        // Legendary Pokemon list
        legendaryPokemons.add(new WildPokemon("Mewtwo", 106, "Psychic", "Psychic", "Psystrike"));
        legendaryPokemons.add(new WildPokemon("Rayquaza", 105, "Dragon", "Dragon", "Dragon Ascent"));
        legendaryPokemons.add(new WildPokemon("Lugia", 110, "Flying", "Flying", "Aeroblast")); 
        legendaryPokemons.add(new WildPokemon("Ho-oh", 106, "Fire", "Fire", "Sacred Fire"));
        legendaryPokemons.add(new WildPokemon("Zapdos", 90, "Electric", "Electric", "Thunderbolt")); 
        legendaryPokemons.add(new WildPokemon("Moltres", 90, "Fire", "Fire", "Flamethrower")); 
        legendaryPokemons.add(new WildPokemon("Articuno", 90, "Ice", "Ice", "Ice Beam")); 
        legendaryPokemons.add(new WildPokemon("Kyogre", 100, "Water", "Water", "Water Spout")); 
        legendaryPokemons.add(new WildPokemon("Groudon", 100, "Ground", "Ground", "Precipice Blades")); 
        legendaryPokemons.add(new WildPokemon("Dialga", 100, "Steel", "Steel", "Roar of Time"));
        legendaryPokemons.add(new WildPokemon("Palkia", 90, "Water", "Water", "Spacial Rend")); 
        legendaryPokemons.add(new WildPokemon("Giratina", 150, "Ghost", "Ghost", "Shadow Force")); 
        legendaryPokemons.add(new WildPokemon("Reshiram", 100, "Fire", "Fire", "Blue Flare"));
        legendaryPokemons.add(new WildPokemon("Zekrom", 100, "Electric", "Electric", "Bolt Strike"));
        legendaryPokemons.add(new WildPokemon("Kyurem", 125, "Ice", "Ice", "Glaciate")); 
        legendaryPokemons.add(new WildPokemon("Xerneas", 126, "Fairy", "Fairy", "Moonblast")); 
        legendaryPokemons.add(new WildPokemon("Yveltal", 126, "Dark", "Dark", "Oblivion Wing")); 
        legendaryPokemons.add(new WildPokemon("Zygarde", 108, "Dragon", "Dragon", "Core Enforcer")); 
        legendaryPokemons.add(new WildPokemon("Solgaleo", 137, "Psychic", "Psychic", "Sunsteel Strike")); 
        legendaryPokemons.add(new WildPokemon("Lunala", 137, "Ghost", "Ghost", "Moongeist Beam")); 
        legendaryPokemons.add(new WildPokemon("Necrozma", 97, "Psychic", "Psychic", "Prismatic Laser")); 

 



        return legendaryPokemons;
    }
    
    
    public static List<WildPokemon> getMythicalPokemons() {
        List<WildPokemon> mythicalPokemons = new ArrayList<>();

        // Mythical Pokemon list
        mythicalPokemons.add(new WildPokemon("Mew", 100, "Psychic", "Psychic", "Psystrike"));
        mythicalPokemons.add(new WildPokemon("Celebi", 100, "Psychic", "Grass", "Leaf Storm"));
        mythicalPokemons.add(new WildPokemon("Jirachi", 100, "Steel", "Psychic", "Doom Desire"));
        mythicalPokemons.add(new WildPokemon("Deoxys", 100, "Psychic", "Psychic", "Psycho Boost"));
        mythicalPokemons.add(new WildPokemon("Phione", 100, "Water", "Water", "Surf"));
        mythicalPokemons.add(new WildPokemon("Manaphy", 100, "Water", "Water", "Heart Swap"));
        mythicalPokemons.add(new WildPokemon("Darkrai", 100, "Dark", "Dark", "Dark Void"));
        mythicalPokemons.add(new WildPokemon("Shaymin", 100, "Grass", "Grass", "Seed Flare"));
        mythicalPokemons.add(new WildPokemon("Arceus", 100, "Normal", "Normal", "Judgment"));
        mythicalPokemons.add(new WildPokemon("Victini", 100, "Psychic", "Fire", "V-create"));
        mythicalPokemons.add(new WildPokemon("Keldeo", 100, "Water", "Fighting", "Secret Sword"));
        mythicalPokemons.add(new WildPokemon("Meloetta", 100, "Normal", "Psychic", "Relic Song"));
        mythicalPokemons.add(new WildPokemon("Genesect", 100, "Bug", "Steel", "Techno Blast"));
        mythicalPokemons.add(new WildPokemon("Diancie", 100, "Rock", "Fairy", "Diamond Storm"));
        mythicalPokemons.add(new WildPokemon("Hoopa", 100, "Psychic", "Ghost", "Hyperspace Hole"));
        mythicalPokemons.add(new WildPokemon("Volcanion", 100, "Fire", "Water", "Steam Eruption"));
        mythicalPokemons.add(new WildPokemon("Magearna", 100, "Steel", "Fairy", "Fleur Cannon"));
        mythicalPokemons.add(new WildPokemon("Marshadow", 100, "Fighting", "Ghost", "Spectral Thief"));
        mythicalPokemons.add(new WildPokemon("Zeraora", 100, "Electric", "Electric", "Plasma Fists"));
        mythicalPokemons.add(new WildPokemon("Genesect", 71, "Bug", "Steel", "Techno Blast"));


        
        
        
        return mythicalPokemons;
    }


}
