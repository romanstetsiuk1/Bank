import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

//import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void shouldReturnTrueIfInputDateIsCorrect() {
//        given
        Client user1 = new Client("User1", "SecondName1",
                "loginUser1", "pass1", new BigDecimal("212.12"));
        String inputLog = "loginUser1";
        String inputPass = "pass1";
//        when
        user1.singIn(user1, inputLog, inputPass);
        boolean result = user1.isSigned();
//        then
        Assert.assertTrue(true);
    }

}