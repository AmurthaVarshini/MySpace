
import java.security.MessageDigest;
import java.util.Scanner;

public class SimpleSHA256 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphanumeric message: ");
        String message = scanner.nextLine();

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(message.getBytes());

        
        StringBuilder hexHash = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexHash.append('0');
            hexHash.append(hex);
        }

        System.out.println("Original Message: " + message);
        System.out.println("SHA-256 Hash: " + hexHash.toString());
    }
}
