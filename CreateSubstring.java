import java.util.Scanner;

public class CreateSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String substring1 = createSubstringUsingCharAt(text, start, end);
        String substring2 = text.substring(start, end);

        System.out.println("Using charAt(): " + substring1);
        System.out.println("Using substring(): " + substring2);
        System.out.println("Results match: " + substring1.equals(substring2));
    }

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }
}