import java.math.BigInteger;
	import java.util.Scanner;
public class RSA{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a prime number P: ");
	        BigInteger P = new BigInteger(scanner.nextLine());

	        System.out.print("Enter a prime number Q: ");
	        BigInteger Q = new BigInteger(scanner.nextLine());
	        BigInteger N = P.multiply(Q);
	        BigInteger phi = (P.subtract(BigInteger.ONE)).multiply(Q.subtract(BigInteger.ONE));
	        BigInteger E;
	        while (true) {
	            System.out.print("Enter a public key E (must be coprime with (P-1)*(Q-1)): ");
	            E = new BigInteger(scanner.nextLine());
	            if (E.gcd(phi).equals(BigInteger.ONE)) {
	                break;
	            } else {
	                System.out.println("E is not coprime with (P-1)*(Q-1), try again.");
	            }
	        }
	        BigInteger D = E.modInverse(phi);
	        System.out.println("Public Key (E, N): (" + E + ", " + N + ")");
	        System.out.println("Private Key (D, N): (" + D + ", " + N + ")");
	        System.out.print("Enter a plaintext (PT) as a number: ");
	        BigInteger PT = new BigInteger(scanner.nextLine());
	        System.out.println("Plaintext (PT): " + PT);
	        BigInteger CT = PT.modPow(E, N);
	        System.out.println("Ciphertext (CT): " + CT);
	        BigInteger decryptedPT = CT.modPow(D, N);
	        System.out.println("Decrypted Plaintext (PT): " + decryptedPT);

	        scanner.close();  
	    }
	
