import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[]args) throws FileNotFoundException, UnsupportedEncodingException {
        Mieszkancy mieszkaniec = new Mieszkancy();
        mieszkaniec.zbierzDane();
        ZapisanieDoPliku plik = new ZapisanieDoPliku();
        plik.makeFile(mieszkaniec);
    }
}
