import java.util.Scanner;

public class Vigenere {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter plaintext:");

	        String text = sc.nextLine().toUpperCase();

	        System.out.println("Enter key:");

	        String key = sc.nextLine().toUpperCase();

	        StringBuilder cipher = new StringBuilder();

	        int len1 = key.length();

	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);

	            if (Character.isLetter(ch)) {
	                int shift = (ch - 'A' + key.charAt(i % len1) - 'A') % 26;
	                cipher.append((char) (shift + 'A'));
	            } else {
	                cipher.append(ch);
	            }
	        }

	        System.out.println("Ciphertext: " + cipher);

	        sc.close();
	    }
	}
