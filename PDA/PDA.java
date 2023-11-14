/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
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
                float LOWER_BOUND = 0;
                float UPPER_BOUND = 0;
                LOWER_BOUND = age/2 + 7;
                UPPER_BOUND = (age - 7) * 2;
                Math.ceil(LOWER_BOUND);
                Math.floor(UPPER_BOUND);
                if (age < LOWER_BOUND) {
                    System.out.println(age + " is too young!!");
                } else if (age > UPPER_BOUND) {
                    System.out.println(age + " is too young!!");
                } else {
                    System.out.println("You can date between " + LOWER_BOUND + " and " + UPPER_BOUND);
                }
                System.out.println("Enter 0 to quit the program.");
                System.out.println("Enter anything if you wish to continue.");
                Scanner scr = new Scanner(System.in);
                int input;
                try {
                    input = scanner.nextInt();
                    if (input == 0){
                        shouldContinue = false;
                    }
                } catch (InputMismatchException error) {

                }
            }
        }
        System.out.println("Thank you for your time! I hope you have a lovely day!");
    }

    /**
     * The main method instantiates and runs the program

     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}