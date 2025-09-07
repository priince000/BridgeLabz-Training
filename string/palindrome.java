import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String original = input.toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}