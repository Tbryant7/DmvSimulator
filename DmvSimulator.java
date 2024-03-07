/*Tannon Bryant
 * 2/28/24
 * Dmv simulator
 */


 import java.util.Random;

public class DmvSimulator {
public static void main(String args[]) {

System.out.println("Welcome to the DMV!");
Random random = new Random();
int userNumber = random.nextInt(100) + 1;
System.out.println("Your number is: " + userNumber + "Please wait untik you are called");


int currentNumber = userNumber % + 1;
System.out.println("Your number is: " + userNumber + ". Please wait until your number is called.");

        // Calling out numbers until the user's number is called
        currentNumber = userNumber % 100 + 1;
        while (currentNumber != userNumber) {
            System.out.println("Now serving number: " + currentNumber);
            currentNumber = (currentNumber % 100) + 1; // Wrapping around to 1 if currentNumber equals 100
        }

        // Notifying the user about the paperwork
        System.out.println("Your number " + userNumber + " is called. Please proceed to the counter.");
        System.out.println("Sorry, you don't have the required paperwork.");
}
}