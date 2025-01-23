import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Message:");

        String PT = sc.nextLine();

        StringBuilder Rs = new StringBuilder();

        for (int i = 0; i < PT.length(); i++) {
            char ch1 = PT.charAt(i);
            char cha1 = (char) (ch1 + 3);

            if (ch1 > 'x') {
                cha1 = (char) (ch1 - 26 + 3);
            }

            Rs.append(cha1);
        }

        System.out.println("Output: " + Rs);
    }
}
