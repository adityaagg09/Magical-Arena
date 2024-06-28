import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random = new Random();

    static  Scanner sc = new Scanner(System.in);

    public static int rollYourDice() {
        /*
            - Here we have dice to roll out values in the range 1 to 6
            - In below function we have added 1 because random.nextInt(0) will generate int values in range 0 to 5
        */
        return random.nextInt(6) + 1;
    }


    public static void main(String[] args) {

        System.out.println("Welcome to the Magical-Arena, Please register yourself in the arena");

        // Register player details
        Player playerA = registerPlayer();
        Player playerB = registerPlayer();

        if(playerA.health<=playerB.health) {
            startFightWhenIntiallyPlayerAHealthIsLessThanPlayerB(playerA,playerB);
        } else {
            startFightWhenIntiallyPlayerBHealthIsLessThanPlayerA(playerA,playerB);
        }

        System.out.println("Thank for your participation in the Magical-Arena, Have a nice Day !!!");

    }

    public static void startFightWhenIntiallyPlayerBHealthIsLessThanPlayerA(Player playerA, Player playerB) {
        while(playerA.health>0 && playerB.health>0) {
            playerBHealthIsLessThanPlayerA(playerA, playerB);
            if(checkPlayerHealthIsZeroOrNot(playerA)) return;
            playerAHealthIsLessThanPlayerB(playerA, playerB);
        }
    }

    public static void startFightWhenIntiallyPlayerAHealthIsLessThanPlayerB(Player playerA, Player playerB) {
        while(playerA.health>0 && playerB.health>0) {
            playerAHealthIsLessThanPlayerB(playerA, playerB);
            if(checkPlayerHealthIsZeroOrNot(playerB)) return;
            playerBHealthIsLessThanPlayerA(playerA, playerB);
        }
    }

    static void playerBHealthIsLessThanPlayerA(Player playerA, Player playerB) {
        fight(playerB, playerA);
        if(checkPlayerHealthIsZeroOrNot(playerA)) {
            System.out.println("Player B wins !!!");
        }
    }

    static void playerAHealthIsLessThanPlayerB(Player playerA, Player playerB) {
        fight(playerA, playerB);
        if(checkPlayerHealthIsZeroOrNot(playerB)) {
            System.out.println("Player A wins !!!");
        }
    }

    static boolean checkPlayerHealthIsZeroOrNot(Player player) {
        return player.health<=0;
    }

    public static Player registerPlayer() {
        int health, strength, attack;
        System.out.println("Please enter player details: " +
                "1) Health");
        health = sc.nextInt();
        System.out.println("2) Strength");
        strength = sc.nextInt();
        System.out.println("3) Attack");
        attack = sc.nextInt();
        return new Player(health, strength, attack);
    }

    public static void fight(Player attacker, Player defender) {

        System.out.println("Fight started between attacker and defender");

        System.out.println("Attacker started to roll the dice");
        int attackDiceRollValue = rollYourDice();
        System.out.println("Attacker got the dice number as: %s".formatted(attackDiceRollValue));

        System.out.println("Defender started to roll the dice");
        int defendDiceRollValue = rollYourDice();
        System.out.println("Defender got the dice number as: %s".formatted(defendDiceRollValue));

        int attackDamage = attacker.attack * attackDiceRollValue;
        System.out.println("Attack damage created by attacker is: %s".formatted(attackDamage));

        int defenseStrength = defender.strength * defendDiceRollValue;
        System.out.println("Defense strength created by defender is: %s".formatted(defenseStrength));

        int damageDone = Math.max(0, attackDamage - defenseStrength);
        defender.health-=damageDone;

        System.out.println("Fight ended between attacker and defender, Defender health is reduced by: %s".formatted(damageDone));

    }

}