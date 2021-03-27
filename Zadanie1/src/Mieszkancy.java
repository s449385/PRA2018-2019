import java.util.Scanner;

public class Mieszkancy {
    String miasto, imie, nazwisko, pesel;

    public Mieszkancy() {
        this.pesel = "12345678912";
        this.miasto = "Poznan";
        this.imie = "Anna";
        this.nazwisko = "Kowalska";
    }

    public String getMiasto(){
        return miasto;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getPesel(){
        return pesel;
    }

    public void zbierzDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać następujące dane:" + "\n");
        System.out.println("Miasto zamieszkania: ");
        miasto = scan.nextLine();
        System.out.println("Imię: ");
        imie = scan.nextLine();
        System.out.println("Nazwisko: ");
        nazwisko = scan.nextLine();
        System.out.println("Pesel: ");
        pesel = scan.nextLine();
        if(!Pesel.isValid(pesel)){
            System.exit(1);
        }
    }
}

