import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    int number;
    int guessedNumber;
    GuessNumber() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void userInput (){
        System.out.println("Guess a number: ");
       Scanner sc = new Scanner (System.in);
       guessedNumber = sc.nextByte();
    }

    boolean isCorrect() {
       if (number == guessedNumber) {
           System.out.println("You are winner...🎉🎉🎉");
           return true;
       } else if (number > guessedNumber) {
           System.out.println("Number is lesser...!!!!");
       } else {
           System.out.println("Number is greater...!!!!");
       }
       return false;
    }
}

public class Guess_The_Number {
    public static void main(String[] args) {
       GuessNumber num = new GuessNumber();
       int trials = 5;
       while (trials > 0) {
           num.userInput();
           boolean b = num.isCorrect();
           if (b == true) {
               break;
           }
           trials --;
       }
       if (trials == 0) {
           System.out.println("You lose the game..😢😢😢");
       }
    }
}
