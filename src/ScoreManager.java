import java.io.*;
import java.util.*;

public class ScoreManager {
    private static final String SCORE_FILE = "top_scores.txt";
    private static final int MAX_TOP_SCORES = 5;
    private List<Integer> topScores;

    public ScoreManager() {
        topScores = loadTopScores();
    }

    public int calculateScore(int turnsTaken, int wildPokemonsCaptured, int defeatedWildPokemons) {
        int baseScore = 10000;
        int turnPenalty = turnsTaken * 10; // Penalty for each turn taken
        int captureBonus = wildPokemonsCaptured * 50; // Bonus for each wild Pokemon captured
        
        // Calculate final score
        int finalScore = baseScore - turnPenalty + captureBonus;

        return Math.max(finalScore, 0); // Ensure the score is not negative
    }
    
    
    public void saveScore(int score) {
        topScores.add(score);
        Collections.sort(topScores, Collections.reverseOrder());
        if (topScores.size() > MAX_TOP_SCORES) {
            topScores = topScores.subList(0, MAX_TOP_SCORES);
        }
        saveTopScores();
    }

    public void displayTopScores() {
        System.out.println("---------Top Scores---------");
        for (int i = 0; i < topScores.size(); i++) {
            System.out.println((i + 1) + ". " + topScores.get(i));
            
	        System.out.println("----------------------------");
        }
    }

    private List<Integer> loadTopScores() {
        List<Integer> scores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORE_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                scores.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading top scores: " + e.getMessage());
        }
        return scores;
    }

    private void saveTopScores() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SCORE_FILE))) {
            for (int score : topScores) {
                writer.println(score);
            }
        } catch (IOException e) {
            System.out.println("Error saving top scores: " + e.getMessage());
        }
    }
}