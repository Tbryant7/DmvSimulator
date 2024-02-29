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
}
}