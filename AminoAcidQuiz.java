import java.io.Console;
import java.util.Random;

public class AminoAcidQuiz {

    public static String[] SHORT_NAMES = 
    { "A","R", "N", "D", "C", "Q", "E", 
    "G",  "H", "I", "L", "K", "M", "F", 
    "P", "S", "T", "W", "Y", "V" };

    public static String[] FULL_NAMES = 
    {
    "alanine","arginine", "asparagine", 
    "aspartic acid", "cysteine",
    "glutamine",  "glutamic acid",
    "glycine" ,"histidine","isoleucine",
    "leucine",  "lysine", "methionine", 
    "phenylalanine", "proline", 
    "serine","threonine","tryptophan", 
    "tyrosine", "valine"};

    public static void main(String[] args) {
        Console console = System.console();
        Random random = new Random();

        int score = 0;
        long startTime = System.currentTimeMillis();

        while(System.currentTimeMillis() - startTime < 30000) {
            int randomIndex = random.nextInt(FULL_NAMES.length);
            String randomAminoAcid = FULL_NAMES[randomIndex];
            System.out.println("Enter the one character code for: " + randomAminoAcid);
            String input = console.readLine().toUpperCase();
            char inputChar = input.charAt(0);

            if(inputChar != SHORT_NAMES[randomIndex].charAt(0)) {
                System.out.println("Incorrect answer. Quiz over!");
                break;
            } else {
                score++;
            }
           
        }

        System.out.println("Quiz over! Your score: " + score);
    }
}

