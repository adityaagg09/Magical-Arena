import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DiceUtilTest {

    private Random random = new Random();

    @Test
    public void test_rollYourDice_ValueShouldBeInRange1To6() {
        int value = DiceUtil.rollYourDice(random);
        Assert.assertEquals(3.0, value, 2.5 );
    }

}
