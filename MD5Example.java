import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a message
        System.out.print("Enter a message to encrypt: ");
        String message = scanner.nextLine();

        try {
            // Create a MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convert the message to bytes and update the digest
            md.update(message.getBytes());

            // Compute the MD5 hash
            byte[] digest = md.digest();

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            // Display the MD5 hash
            System.out.println("MD5 Hash: " + hexString.toString());

        } catch (NoSuchAlgorithmException e) {
            // Handle the case where MD5 algorithm is not available
            System.err.println("MD5 algorithm not found.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
