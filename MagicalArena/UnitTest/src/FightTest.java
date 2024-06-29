import org.junit.Assert;
import org.junit.Test;

public class FightTest {

    @Test
    public void test_fightBetween2Players() {
        Player a = new Player(100,5,4);
        Player b = new Player(100,6,9);
        Fight.fightBetween2Players(a, b);
    }

    @Test
    public void test_playerBWillAttackAndPlayerAWillDefend_PlayerBWillWin() {
        Player a = new Player(1,1,1);
        Player b = new Player(10,1,10);
        Fight.playerBWillAttackAndPlayerAWillDefend(a, b);
    }
    @Test
    public void test_playerBWillAttackAndPlayerAWillDefend_ButPlayerBWillNotWin() {
        Player a = new Player(10,1,1);
        Player b = new Player(10,1,1);
        Fight.playerBWillAttackAndPlayerAWillDefend(a, b);
    }

    @Test
    public void test_playerAWillAttackPlayerBWillDefend_PlayerAWillWin() {
        Player a = new Player(10,1,10);
        Player b = new Player(1,1,1);
        Fight.playerAWillAttackPlayerBWillDefend(a, b);
    }
    @Test
    public void test_playerAWillAttackPlayerBWillDefend_ButPlayerAWillNotWin() {
        Player a = new Player(10,1,1);
        Player b = new Player(10,1,1);
        Fight.playerAWillAttackPlayerBWillDefend(a, b);
    }

    @Test
    public void test_checkPlayerHealthIsZeroOrNot_ReturnsTrue() {
        Player player = new Player(0,1,1);
        Assert.assertEquals(true, Fight.checkPlayerHealthIsZeroOrNot(player));
    }

    @Test
    public void test_checkPlayerHealthIsZeroOrNot_ReturnsFalse() {
        Player player = new Player(10,1,1);
        Assert.assertEquals(false, Fight.checkPlayerHealthIsZeroOrNot(player));
    }

    @Test
    public void test_checkPlayerHealthIsZeroOrNot_ReturnsTrue2() {
        // Value in the health can't be null as we have taken the health, strength and attack as int not Integer
        Player player = new Player(-4,1,1);
        Assert.assertEquals(true, Fight.checkPlayerHealthIsZeroOrNot(player));
    }

}
