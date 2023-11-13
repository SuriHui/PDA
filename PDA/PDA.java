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
        boolean question = true;
        while (question) {
            while (shouldContinue==true) {
                System.out.println("How old are you?");
                Scanner scanner = new Scanner(System.in);
                int age = -1;
                try {
                    age = scanner.nextInt();                    
                } catch (InputMismatchException error) {
                    System.out.println("Please enter an integer");
                }
                if (age == 0)  {
                    shouldContinue = false;
                } else if (age == -1) {
                    System.out.print("");
                } else {
                    int LOWER_BOUND = 0;
                    int UPPER_BOUND = 0;
                    LOWER_BOUND = age/2 + 7;
                    UPPER_BOUND = (age - 7) * 2;
                    if (age < LOWER_BOUND) {
                        System.out.println(age + " is too young!!");
                    } else if (age > UPPER_BOUND) {
                        System.out.println(age + " is too young!!");
                    } else {
                        System.out.println("You can date between " + LOWER_BOUND + " and " + UPPER_BOUND);
                    }
                    System.out.println("Press 0 to quit the program.");
                    System.out.println("Press 1 if you wish to continue.");
                    Scanner scr = new Scanner(System.in);
                    int input = scr.nextInt();
                    if (input == 0){
                        System.out.println("Thank you for your time! I hope you have a lovely day!");
                        shouldContinue = false;
                    }
                }
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