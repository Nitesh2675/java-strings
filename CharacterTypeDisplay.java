import java.util.Scanner;

public class CharacterTypeDisplay {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to categorize each character in the string
    public static String[][] categorizeCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacter(str.charAt(i));
        }
        return result;
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Character | Type");
        System.out.println("-----------------");
        for (String[] row : results) {
            System.out.println(row[0] + "         | " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to analyze characters:");
        String input = scanner.nextLine();
        String[][] results = categorizeCharacters(input);
        displayResults(results);
    }
}
