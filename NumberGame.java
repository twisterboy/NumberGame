# NumberGame
this is basic java program of if else condition implemented on a small game guessing number.
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) +1;
        boolean haswon = false;
        System.out.println("i have randomly choosen a number between 1 and 100.");
        System.out.println("try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for(int i=10 ;i > 0; i--){
            System.out.println("you have "+ i +" guesses left. Choose again: ");
            int guess = scanner.nextInt();

            if(randomNumber<guess){
                System.out.println("it is smaller than" +guess+".");
            }
            else if(randomNumber>guess){
                System.out.println("it is greater then "+guess+".");
            }
            else {
                haswon = true;
                break;
            }
        }
        if(haswon == true){
            System.out.println("CORRECT........YOU WIN");
        }else {
            System.out.println("GAME OVER......YOU LOSE!!!");
            System.out.println("the number was : " +randomNumber);
        }

    }
}
