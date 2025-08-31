import java.util.Scanner;

public class divider {

    public static int[] findremainderandquotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberofchildren = sc.nextInt();

        if (numberofchildren == 0) {
            System.out.println("Cannot divide by zero. Number of children must be greater than 0.");
        } else {
            int[] result = findremainderandquotient(numberOfChocolates, numberofchildren);

            System.out.println("Each child gets " + result[1] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[0]);
        }
        sc.close();
    }
}