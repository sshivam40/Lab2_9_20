import java.util.Random;

public class ChatGPTCode {
    public static String[] SHORT_NAMES = { "A", "R", "N", "D", "C", "Q", "E", 
        "G", "H", "I", "L", "K", "M", "F", 
        "P", "S", "T", "W", "Y", "V" };

    public static String[] FULL_NAMES = {
        "alanine","arginine", "asparagine", 
        "aspartic acid", "cysteine",
        "glutamine",  "glutamic acid",
        "glycine" ,"histidine","isoleucine",
        "leucine",  "lysine", "methionine", 
        "phenylalanine", "proline", 
        "serine","threonine","tryptophan", 
        "tyrosine", "valine"};
    
    public static void main(String[] args) {
        Random random = new Random();
        
        int score = 0;
        boolean gameOver = false;
        long startTime = System.currentTimeMillis();
        
        while (!gameOver) {
            // Check if 30 seconds have passed
            if (System.currentTimeMillis() - startTime >= 30000) {
                gameOver = true;
                break;
            }
            
            // Generate a random index to select an amino acid
            int randomIndex = random.nextInt(SHORT_NAMES.length);
            String aminoAcidFullName = FULL_NAMES[randomIndex];
            String aminoAcidShortName = SHORT_NAMES[randomIndex];
            
            System.out.println("Amino acid: " + aminoAcidFullName);
            System.out.print("Enter the one-letter code: ");
            
            // Check if there are any more command-line arguments
            if (args.length > 0) {
                String userAnswer = args[0].trim().toLowerCase();
                
                if (userAnswer.equals(aminoAcidShortName.toLowerCase())) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. Game over!");
                    gameOver = true;
                }
            } else {
                System.out.println("No user input provided. Game over!");
                gameOver = true;
            }
        }
        
        System.out.println("Quiz ended. Your score: " + score);
    }
}
