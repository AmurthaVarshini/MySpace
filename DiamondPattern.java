public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = -4; i <= 4; i++) {
            System.out.println(" ".repeat(Math.abs(i)) + "*".repeat(9 - 2 * Math.abs(i)));
        }
    }
}
