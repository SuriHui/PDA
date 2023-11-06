/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("Enter 0 to exit this program.");
            Scanner scanner = new Scanner(System.in);
            int LOWER_BOUND = 13;
            int age = scanner.nextInt();
            try {
                // don't repeat age
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
            if (age < LOWER_BOUND) {
                System.out.println(age + " is too young!!");
            } else {
                System.out.println("Computations go here");
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}