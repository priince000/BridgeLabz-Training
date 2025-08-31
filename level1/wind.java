import java.util.Scanner;

public class wind {

    public static double calculatewindchill(double tempF, double windSpeedMph) {
        return 35.74 
             + (0.6215 * tempF) 
             + (0.4275 * tempF - 35.75) * Math.pow(windSpeedMph, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = calculatewindchill(temperature, windSpeed);
            System.out.printf("Calculated Wind Chill: %.2f°F%n", windChill);
        } else {
            System.out.println("Wind chill formula is only valid when temperature ≤ 50°F and wind speed ≥ 3 mph.");
        }

        sc.close();
    }
}