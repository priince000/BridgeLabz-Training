import java.util.Scanner;

public class handshake {

    public static int calculatehandshakes(int numberofstudents) {
        return (numberofstudents * (numberofstudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberofstudents = sc.nextInt();
        int handshakes = calculatehandshakes(numberofstudents);

        System.out.println("The number of handshakes is " + handshakes);

        sc.close();
    }
}