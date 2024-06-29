import java.util.Scanner;

public class RegisterPlayer {

     Player registerPlayer(Scanner sc) {
        int health, strength, attack;
        System.out.println("1) Health");
        health = sc.nextInt();
        System.out.println("2) Strength");
        strength = sc.nextInt();
        System.out.println("3) Attack");
        attack = sc.nextInt();
        return new Player(health, strength, attack);
    }

}
