import java.util.Scanner;

public class Game {

    private Scanner sc;
    private RegisterPlayer registerPlayer;
    private Fight fight;

    Game() {
        sc =  new Scanner(System.in);
        registerPlayer = new RegisterPlayer();
        fight = new Fight();
    }


    void startGame() {

        System.out.println("Please enter First player details");
        Player playerA = registerPlayer.registerPlayer(sc);

        System.out.println("\nPlease enter Second player details");
        Player playerB = registerPlayer.registerPlayer(sc);

        System.out.println("\nStart Fight");

        fight.fightBetween2Players(playerA, playerB);
    }

}