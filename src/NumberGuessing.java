import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[] args) {

        Scanner keyboard;
        int GuessedNumber;
        int PickedNumber;
        boolean OnPoint;

        keyboard = new Scanner(System.in);
        PickedNumber = (int)(Math.random()*100);
        OnPoint = false;


        System.out.println("Hello there, and WELCOME to the Number Guessing Game!");
        System.out.println("The rules couldn't be easier.");
        System.out.println("Guess a random Number.");
        System.out.println("If the number is too high, then guess another number.");
        System.out.println("If the number is too low, guess again");
        System.out.println("Keep guessing until you get the right number.");
        GuessedNumber = keyboard.nextInt();

        while (OnPoint){

            if (GuessedNumber < PickedNumber){
                System.out.println("Your number is too low.");


            }else if (GuessedNumber > PickedNumber){
                System.out.println("Your number is too high.");

            }else if (GuessedNumber == PickedNumber){
                System.out.println("That is the correct number.");


                OnPoint = true;
                break;
            }

            System.out.println("Guess Again.");
            GuessedNumber = keyboard.nextInt();

        }
        System.out.println("Thank You for playing the Number Guessing Game!!!");

    }

}
