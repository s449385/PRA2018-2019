import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ZapisanieDoPliku {
    public String makeFile(Mieszkancy mieszkaniec) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter plik = new PrintWriter(mieszkaniec.getPesel() + ".txt", "UTF-8");
        plik.println("Miasto: " + mieszkaniec.getMiasto());
        plik.println("Imię: " + mieszkaniec.getImie());
        plik.println("Nazwisko: " + mieszkaniec.getNazwisko());
        plik.println("Pesel: " + mieszkaniec.getPesel());
        plik.close();
        return mieszkaniec.getImie() + " " + mieszkaniec.getNazwisko() + " z miasta " + mieszkaniec.getMiasto() + " o peselu " + mieszkaniec.getPesel();
     }
}
