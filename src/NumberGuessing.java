import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[]args){

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean OnPoint;

        keyboard = new Scanner(System.in);
        pickedNumber = (int)(Math.random()*100);
        OnPoint = false;


        System.out.println("Hello there and WELCOME to the Number Guessing Game.");
        System.out.println("The rules are simple.");
        System.out.println("Guess a number if, it is too high guess another number.");
        System.out.println("If the number is too high, guess another number.");
        System.out.println("Keep guessing a number until you get it right.");
        guessedNumber = keyboard.nextInt();

        while (!OnPoint){

            if (guessedNumber < pickedNumber){
                System.out.println("Your number is too low.");


            }  else if (guessedNumber > pickedNumber){
                System.out.println("Your number is too high.");

            }  else if (guessedNumber == pickedNumber){
                System.out.println("You got it right.");


                OnPoint = true;
                break;

                }

            System.out.println("Guess Again.");
            guessedNumber = keyboard.nextInt();

        }
        System.out.println("Thank you for playing the Number Guessing Game!!!");

    }

}
