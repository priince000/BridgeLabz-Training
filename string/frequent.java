import java.util.Scanner;

public class frequent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}