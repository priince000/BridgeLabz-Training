import java.util.Scanner;

public class simpleinterest {

    public static double calculatesimpleinterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double interest = calculatesimpleinterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);

        sc.close();
    }
}
