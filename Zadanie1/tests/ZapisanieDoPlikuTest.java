import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class ZapisanieDoPlikuTest extends ZapisanieDoPliku {
    @Test
    public void makeFileTest() throws FileNotFoundException, UnsupportedEncodingException{
        Mieszkancy mieszkancy = new Mieszkancy();
        assertEquals("Anna Kowalska z miasta Poznan o peselu 12345678912", makeFile(mieszkancy));
    }
}
