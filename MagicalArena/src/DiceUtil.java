import java.util.Random;

public class DiceUtil {

    final static int maxDiceCount = 5;

    public static int rollYourDice() {
        /*
            - Here we have dice to roll out values in the range 1 to 6
            - In below function we have added 1 because random.nextInt(0) will generate int values in range 0 to 5
        */
        return new Random().nextInt(maxDiceCount) + 1;  // Need to make staitic constant
    }

}
