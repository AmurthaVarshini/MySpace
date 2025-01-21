import java.util.Random;
import java.util.Scanner;

public class OneTimePad  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Enter plain text: ");

        String plaintext = sc.nextLine().toUpperCase();

        StringBuilder key = new StringBuilder();
        StringBuilder cipher = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char random1 = (char) (ran.nextInt(26) + 'A');
            key.append(random1);

            char cipher1 = (char) ((plaintext.charAt(i) - 'A' + random1 - 'A') % 26 + 'A');
            cipher.append(cipher1);
        }

        System.out.println("Generated Key: " + key);
        System.out.println("Cipher Text: " + cipher);

        sc.close();
    }
