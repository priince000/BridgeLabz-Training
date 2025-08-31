import java.util.Scanner;

public class sum {
    public static int findsum(int n) {
        int sum = 0;
        for (int a = 1; a<= n; a++) {
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            int sum = findsum(n);
            System.out.println("The sum of the first " + n + " numbers is: " + sum);
        }

        sc.close();
    }
    
}
