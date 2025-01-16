import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        
        int decimal = binaryToDecimal(binaryString);

        
        System.out.println("Decimal equivalent of " + binaryString + " is: " + decimal);

        scanner.close();
    }

    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
