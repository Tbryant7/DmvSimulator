/*Tannon Bryant
 * 2/28/24
 * Dmv simulator
 */


 import java.util.Random;

public class DmvSimulator {
public static void main(String args[]) {

System.out.println("Welcome to the DMV!");
Random random = new Random();
int userNumber = random.nextInt(200) + 1;
System.out.println("Your number is: " + userNumber + "Please wait untik you are called");


int currentNumber = userNumber % + 1;
System.out.println("Your number is: " + userNumber + ". Please wait until your number is called.");

        // Calling out numbers until the user's number is called
        currentNumber = userNumber % 200 + 1;
        while (currentNumber != userNumber) {
            System.out.println("Now serving number: " + currentNumber);
            //Going to the number right after user number so it wraps around
            currentNumber = (currentNumber % 200) + 1;
        }

        boolean hasRequiredPaperwork = random.nextDouble() < 0.01;

        if (hasRequiredPaperwork) {
            System.out.println("Your number " + userNumber + " is called. Please proceed to the counter.");
            System.out.println("You have all the paperwork. You are all set");
    
        } else{

        //Printing out the numbers of the user 
        System.out.println("Your number " + userNumber + " is called. Please proceed to the counter.");
        System.out.println("What are you thinking, dont ever come back until you actually know what your doing, you never had the required paperwork WHAT are you thinking?!??");
        }
}
}