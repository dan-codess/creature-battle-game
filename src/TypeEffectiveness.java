public class TypeEffectiveness {
	public static double getEffectiveness(String moveType, String defenderType) {
		if (isSuperEffective(moveType, defenderType)) {
			return 2.0;
		} else if (isNotVeryEffective(moveType, defenderType)) {
			return 0.5;
		}
			return 1.0;
	}
	
	private static boolean isSuperEffective(String moveType, String defenderType) {
		if(moveType.equals("Fire") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Normal")) return true;
		if(moveType.equals("Ground") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Electric") && defenderType.equals("Water")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Water")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Flying") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Ice")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Ice")) return true;
		if(moveType.equals("Rock") && defenderType.equals("Ice")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Ice")) return true;
		if(moveType.equals("Flying") && defenderType.equals("Fighting")) return true;
		if(moveType.equals("Psychic") && defenderType.equals("Fighting")) return true;
		if(moveType.equals("Fairy") && defenderType.equals("Fighting")) return true;
		if(moveType.equals("Ground") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Psychic") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Water") && defenderType.equals("Ground")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Ground")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Ground")) return true;
		if(moveType.equals("Electric") && defenderType.equals("Flying")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Flying")) return true;
		if(moveType.equals("Rock") && defenderType.equals("Flying")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Bug")) return true;
		if(moveType.equals("Flying") && defenderType.equals("Bug")) return true;
		if(moveType.equals("Rock") && defenderType.equals("Bug")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Psychic")) return true;
		if(moveType.equals("Ghost") && defenderType.equals("Psychic")) return true;
		if(moveType.equals("Dark") && defenderType.equals("Psychic")) return true;
		if(moveType.equals("Water") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Ground") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Ghost") && defenderType.equals("Ghost")) return true;
		if(moveType.equals("Dark") && defenderType.equals("Ghost")) return true;
		if(moveType.equals("Dragon") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Fairy") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Dark")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Dark")) return true;
		if(moveType.equals("Fairy") && defenderType.equals("Dark")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Ground") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Fairy")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Fairy")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Grass")) return true; 
		
		return false;
	}
	
	private static boolean isNotVeryEffective(String moveType, String defenderType) {
		if (moveType.equals("Fire") && defenderType.equals("Water")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Fairy") && defenderType.equals("Fire")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Water")) return true;
		if(moveType.equals("Water") && defenderType.equals("Water")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Water")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Water")) return true;
		if(moveType.equals("Electric") && defenderType.equals("Electric")) return true;
		if(moveType.equals("Flying") && defenderType.equals("Electric")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Electric")) return true;
		if(moveType.equals("Water") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Electric") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Ground") && defenderType.equals("Grass")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Ice")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Fighting")) return true;
		if(moveType.equals("Rock") && defenderType.equals("Fighting")) return true;
		if(moveType.equals("Dark") && defenderType.equals("Fighting")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Fairy") && defenderType.equals("Poison")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Ground")) return true;
		if(moveType.equals("Rock") && defenderType.equals("Ground")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Flying")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Flying")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Flying")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Psychic")) return true;
		if(moveType.equals("Psychic") && defenderType.equals("Psychic")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Bug")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Bug")) return true;
		if(moveType.equals("Ground") && defenderType.equals("Bug")) return true;
		if(moveType.equals("Normal") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Flying") && defenderType.equals("Rock")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Ghost")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Ghost")) return true;
		if(moveType.equals("Fire") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Water") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Electric") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Dragon")) return true;
		if(moveType.equals("Ghost") && defenderType.equals("Dark")) return true;
		if(moveType.equals("Dark") && defenderType.equals("Dark")) return true;
		if(moveType.equals("Normal") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Grass") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Ice") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Flying") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Psychic") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Rock") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Dragon") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Steel") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Fairy") && defenderType.equals("Steel")) return true;
		if(moveType.equals("Fighting") && defenderType.equals("Fairy")) return true;
		if(moveType.equals("Bug") && defenderType.equals("Fairy")) return true;
		if(moveType.equals("Dark") && defenderType.equals("Fairy")) return true;
		if(moveType.equals("Poison") && defenderType.equals("Steel")) return true; 
		
		return false;
	}
}

