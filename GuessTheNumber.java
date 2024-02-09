import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        int playerScore = 0;
        boolean continuePlaying = true;

        while (continuePlaying) {
            int secretNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxTries = 5;

            System.out.println("I've chosen a number between 1 and 100. Can you guess it?");

            while (attempts < maxTries) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                input.nextLine();

                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Hooray! You got it right! The number was " + secretNumber + ". You guessed it in " + attempts + " attempts.");
                    playerScore++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Give it another shot.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
            }

            if (attempts >= maxTries) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + secretNumber + ".");
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String playAgain = input.nextLine();
            continuePlaying = playAgain.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your final score: " + playerScore);

        input.close();
    }
}
