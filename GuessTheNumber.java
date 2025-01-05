import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1; 
        int attempts = 5;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to guess it.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;
            if (attempts > 0) {
                System.out.println("You have " + attempts + " attempts left.");
            } else {
                System.out.println("Sorry, you're out of attempts. The number was " + randomNumber + ".");
            }
        }
    }
}
