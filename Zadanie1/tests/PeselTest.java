import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PeselTest extends Pesel {
    @Test
    public void isLenghtOKTest(){
        assertFalse(isLenghtOK("4256476"));
        assertTrue(isLenghtOK("12345678912"));
    }
    @Test
    public void checkSumTest() {
        assertFalse(checkSum("12345678912"));
        assertTrue(checkSum("70061864846"));
    }
}
