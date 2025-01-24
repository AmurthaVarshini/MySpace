import java.util.Scanner;

public class MonoalphabeticCipher {

    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append(key.charAt(c - 'A')); 
            } else {
                result.append(c);  
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String key = "WHKFQMBJSNRAUYGXCVPZDLEIOT"; 

        System.out.println("Enter Message:");

        String str = sc.nextLine().toUpperCase();

        System.out.println("Encrypted Message: " + encrypt(str, key));

        sc.close(); 
    }
