public class SquareRoot {
    public static void main(String[] args) {
        double num = 25; // Change this to your desired number
        double sqrt = num / 2, temp;
        do {
            temp = sqrt;
            sqrt = (temp + num / temp) / 2;
        } while (Math.abs(temp - sqrt) > 0.0001);
        System.out.println("Square root of " + num + " is: " + sqrt);
    }
