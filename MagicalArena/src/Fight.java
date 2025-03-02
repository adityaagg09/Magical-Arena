public class Fight {

    void fightBetween2Players(Player playerA, Player playerB) {

        if(playerA.attack == 0 && playerB.attack == 0 ) {
            System.out.println("Both players don't have a fighting capacity, Hence ending the game");
            return;
        }

        while (playerA.health > 0 && playerB.health > 0) {
            if (playerA.health >= playerB.health) {
                playerBWillAttackAndPlayerAWillDefend(playerA, playerB);
                if (checkPlayerHealthIsZeroOrNot(playerA)) break;
                playerAWillAttackPlayerBWillDefend(playerA, playerB);
            } else {
                playerAWillAttackPlayerBWillDefend(playerA, playerB);
                if (checkPlayerHealthIsZeroOrNot(playerB)) return;
                playerBWillAttackAndPlayerAWillDefend(playerA, playerB);
            }
        }
    }

     void fight(Player attacker, Player defender) {

        System.out.println("Attacker started to roll the dice");
        int attackDiceRollValue = DiceUtil.rollYourDice();
        System.out.printf("Attacker got the dice number as: %s%n", attackDiceRollValue);

        System.out.println("Defender started to roll the dice");
        int defendDiceRollValue = DiceUtil.rollYourDice();
        System.out.printf("Defender got the dice number as: %s%n", defendDiceRollValue);

        int attackDamage = attacker.attack * attackDiceRollValue;
        System.out.printf("Attack damage created by attacker is: %s%n", attackDamage);

        int defenseStrength = defender.strength * defendDiceRollValue;
        System.out.printf("Defense strength created by defender is: %s%n", defenseStrength);

        int damageDone = Math.max(0, attackDamage - defenseStrength);
        defender.health -= damageDone;

        System.out.printf("Fight ended between attacker and defender, Defender health is reduced by %s to %s%n", damageDone, defender.health);

    }

    void playerBWillAttackAndPlayerAWillDefend(Player playerA, Player playerB) {
        System.out.println("\nPlayerB will attack and PlayerA will defend");
        fight(playerB, playerA);
        if (checkPlayerHealthIsZeroOrNot(playerA)) {
            System.out.println("\nPlayer B wins !!!\n");
        }
    }

    void playerAWillAttackPlayerBWillDefend(Player playerA, Player playerB) {
        System.out.println("\nPlayerA will attack and PlayerB will defend");
        fight(playerA, playerB);
        if (checkPlayerHealthIsZeroOrNot(playerB)) {
            System.out.println("\nPlayer A wins !!!\n");
        }
    }

    boolean checkPlayerHealthIsZeroOrNot(Player player) {
        return player.health <= 0;
    }

}
