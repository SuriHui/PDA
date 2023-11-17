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
            System.out.print("Your age: ");
            Scanner scanner = new Scanner(System.in);
            double age;
            try {
                age = scanner.nextDouble();    
                if (shouldContinue)  {
                    int yong = getYoungerAge(age);
                    int ol = getOlderAge(age);

                    if (age < yong) {
                        System.out.println("\n" + (int) age + " is too young!!\n");
                    } else if (age > ol) {
                        System.out.println("\n" + (int) age + " is too young!!\n");
                    } else {
                        System.out.println("\nYou can date between " + yong + " and " + ol + "\n");
                    }
                    System.out.println("Enter 0 to quit the program.\n");
                    System.out.println("Enter anything if you wish to continue.");
                    age = scanner.nextInt();
                    if (age == 0) {
                        shouldContinue = false;
                    }
                }
            } catch (InputMismatchException error) {
                System.out.println("\nPlease enter an integer.\n");
            }
        }
        System.out.println("\nThank you for your time! I hope you have a lovely day!");
    }

    public int getYoungerAge(double age) {
        int LOWER_BOUND = (int) Math.ceil((age/2) + 7);
        return LOWER_BOUND;
    }

    public int getOlderAge(double age) {
        int UPPER_BOUND = (int) Math.floor((age-7) * 2);
        return UPPER_BOUND;
    }

    /**
     * The main method instantiates and runs the program

     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}