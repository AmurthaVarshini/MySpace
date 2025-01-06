import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Unit Converter ===");
            System.out.println("1. Temperature (Celsius to Fahrenheit)");
            System.out.println("2. Length (Meters to Feet)");
            System.out.println("3. Weight (Kilograms to Pounds)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertTemperature(scanner);
                    break;
                case 2:
                    convertLength(scanner);
                    break;
                case 3:
                    convertWeight(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    public static void convertTemperature(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
    }

    public static void convertLength(Scanner scanner) {
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();
        double feet = meters * 3.28084;
        System.out.printf("Length in feet: %.2f ft%n", feet);
    }

    public static void convertWeight(Scanner scanner) {
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        double pounds = kilograms * 2.20462;
        System.out.printf("Weight in pounds: %.2f lbs%n", pounds);
    }
}
