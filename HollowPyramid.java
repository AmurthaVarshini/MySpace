public class HollowPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(" ".repeat(5 - i));
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print((j == 1 || j == (2 * i - 1) || i == 5) ? "*" : " ");
            }
            System.out.println();
        }
    }
