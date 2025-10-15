import java.util.Scanner;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Scanner with UTF-8 encoding to support any characters
        Scanner in = new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8));

        System.out.println("Enter a text:");
        String text = in.nextLine();

        // Split the text into words using spaces and punctuation as delimiters
        String[] words = text.split("[ ,.:;!?\\-]+");

        System.out.println("Words with all unique letters:");
        for (String word : words) {
            if (!word.isEmpty() && hasUniqueLetters(word)) {
                System.out.print(word + " ");
            }
        }

        in.close();
    }

    // Method that checks if all letters in a word are unique
    private static boolean hasUniqueLetters(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isLetter(c)) continue;
            if (word.indexOf(c) != word.lastIndexOf(c)) return false;
        }
        return true;
    }
}
