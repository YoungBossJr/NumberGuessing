import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[]args){

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean OnPoint;
        int TimesGuessed;
        boolean PlayAgain;

        int Playagain;


        PlayAgain = false;
        keyboard = new Scanner(System.in);


        while (!PlayAgain){

        }System.out.println("Hello there and WELCOME to the Number Guessing Game.");
        System.out.println("The rules are simple.");
        System.out.println("Guess a number if, it is too high guess another number.");
        System.out.println("If the number is too low guess another number.");
        System.out.println("Keep guessing a number until you get it right.");


        OnPoint = false;
        pickedNumber = (int)(Math.random()*100);
        TimesGuessed = 4;


        while (!OnPoint && TimesGuessed > 0) {

            System.out.println("Guess a number.");
            guessedNumber = keyboard.nextInt();

            if (guessedNumber < pickedNumber){
                System.out.println("Your number is too low.");


            }  else if (guessedNumber > pickedNumber){
                System.out.println("Your number is too high.");

            }  else if (guessedNumber == pickedNumber){
                System.out.println("You got it right.");
                OnPoint = true;

            }

                TimesGuessed--;

            System.out.println("Guess Again.");
            guessedNumber = keyboard.nextInt();

        }
        if (OnPoint==true){
            System.out.println("Thank you for playing the Number Guessing Game!!!");
            System.out.println("You had"+ TimesGuessed+" guesses left.");
        }

        else if (OnPoint==false&&TimesGuessed<1){
           System.out.println("You did not guess the number.");
           System.out.println("The number you were trying to guess was "+pickedNumber+".");

        }
        System.out.println("Do you want to play again. 0=No 1=Yes");
        Playagain = keyboard.nextInt();

        if (Playagain == 0){
            System.out.println("Thank you for playing The Number Guessing Game.");
            PlayAgain = true;
        }
        if (Playagain == 1){
            PlayAgain = false;
        }





    }

}
