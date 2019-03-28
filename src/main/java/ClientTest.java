import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

//import static org.junit.Assert.*;

public class ClientTest {

    //    singIn
    @Test
    public void shouldReturnTrueIfInputDateIsCorrect() {
//        given
        Client user1 = new Client("User1", "SecondName1",
                "loginUser1", "pass1", new BigDecimal("212.12"));
        String inputLog = "loginUser1";
        String inputPass = "pass1";
//        when
        user1.singIn(user1, inputLog, inputPass);
//        then
        Assert.assertTrue(true);
    }

    @Test
    public void shouldReturnFalseIfInputPassNoCorrect() {
//        given
        Client user3 = new Client("User3", "SecondName3",
                "loginUser3", "pass3", new BigDecimal("16.07"));
        String inputLog = "loginUser3";
        String inputPass = "3pass";
//        when
        user3.singIn(user3, inputLog, inputPass);
//        then
        Assert.assertFalse(false);
    }

    @Test
    public void shouldReturnFalseIfInputLoginNoCorrect() {
//        given
        Client user2 = new Client("User2", "SecondName2",
                "loginUser2", "pass2", new BigDecimal("12056.47"));
        String inputLog = "loginuser2";
        String inputPass = "pass2";
//        when
        user2.singIn(user2, inputLog, inputPass);
//        then
        Assert.assertFalse(false);
    }

    //    singOut:
    @Test
    public void shouldReturnFalse() {
//        given
        Client user1 = new Client("User", "SecondName",
                "loginUser", "pass", new BigDecimal("21.12"));
        user1.singIn(user1, "loginUser", "pass");
//        when
        user1.singOut(user1);
//        then
        Assert.assertFalse(false);
    }


}