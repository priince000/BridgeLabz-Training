import java.util.Scanner;

public class athelete {

    public static double calculaterounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter length of side 3: ");
        double side3 = sc.nextDouble();

        double rounds = calculaterounds(side1, side2, side3);

        System.out.println("The athlete complete " + rounds + " rounds to run 5 km.");

        sc.close();
    }
}