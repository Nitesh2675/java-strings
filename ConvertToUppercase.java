import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String result1 = convertToUpper(text);
        String result2 = text.toUpperCase();

        System.out.println("Using user-defined method: " + result1);
        System.out.println("Using toUpperCase(): " + result2);
        System.out.println("Results match: " + result1.equals(result2));
    }

    public static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
}