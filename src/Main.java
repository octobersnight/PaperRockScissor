import java.util.Scanner;
import java.util.Random;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.println("Enter Player 1: ");
        String player1 = input.next().toUpperCase();
        out.println("Enter Player 2: ");
        String player2 = input.next().toUpperCase();
        out.println("----------------------------------------------------------");
        out.println(String.format("%s vs. %s", player1, player2));
        out.println("----------------------------------------------------------");
        String[] prs = {"paper", "rock", "scissor"};
        out.println("Paper! \nRock! \nScissor! \nShoot!");

        Random rndNum = new Random();
        int num = rndNum.nextInt(2);
        int num2 = rndNum.nextInt(2);
        int firstPlayer = num;
        int secondPlayer = num2;

        out.println(String.format("%s: %s vs. %s: %s", player1, prs[firstPlayer], player2, prs[secondPlayer]));

        out.println(String.format("%s",winOrLose(prs[firstPlayer], prs[secondPlayer])));
    }

    public static String winOrLose(String firstPlayer, String secondPlayer){
        String paper = "paper";
        String rock = "rock";
        String scissor = "scissor";
        if (firstPlayer == paper &&  secondPlayer == rock || firstPlayer == rock && secondPlayer == paper){
            return "Game Over!";
        } else if (firstPlayer == paper &&  secondPlayer == scissor || firstPlayer == scissor && secondPlayer == paper){
            return "Game over!";
        }else if (firstPlayer == scissor &&  secondPlayer == rock || firstPlayer == rock && secondPlayer == scissor){
            return "Game Over!";
        } else {
            return "Its a Tied! Would you like to continue?";
        }

    }
}
