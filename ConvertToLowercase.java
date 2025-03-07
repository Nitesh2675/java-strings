import java.util.Scanner;

public class ConvertToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String result1 = convertToLower(text);
        String result2 = text.toLowerCase();

        System.out.println("Using user-defined method: " + result1);
        System.out.println("Using toLowerCase(): " + result2);
        System.out.println("Results match: " + result1.equals(result2));
    }

    public static String convertToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
}
