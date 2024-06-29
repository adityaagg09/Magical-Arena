import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void test_Player() {
        Player player = new Player(100, 4 ,4);
        Assert.assertEquals(100, player.health);
        Assert.assertEquals(4, player.strength);
        Assert.assertEquals(4, player.attack);
    }

}
