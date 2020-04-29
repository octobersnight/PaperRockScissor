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

        String[] prs = {"paper", "rock", "scissor"};
        out.println("Paper! \nRock! \nScissor! \nShoot!");

        Random rndNum = new Random();
        int num = rndNum.nextInt(2);
        int firstPlayer = num;
        int secondPlayer = num;

        out.println(String.format("%s: %s vs. %s: %s", player1, prs[firstPlayer], player2, prs[secondPlayer]));
    }

}
