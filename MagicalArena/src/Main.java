import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Magical-Arena, Please register yourself in the arena\n");

        // Register player details
        System.out.println("Please enter First player details");
        Player playerA = RegisterPlayer.registerPlayer(sc);

        System.out.println("\nPlease enter Second player details");
        Player playerB = RegisterPlayer.registerPlayer(sc);

        System.out.println("\nStart Fight");

        Fight.fightBetween2Players(playerA, playerB);

        System.out.println("Thank for your participation in the Magical-Arena, Have a nice Day !!!");
    }

}