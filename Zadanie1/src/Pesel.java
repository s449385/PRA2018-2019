public class Pesel {
    String pesel;

    public String getPesel(){
        return pesel;
    }
    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    public static boolean isValid(String pesel){
        if(isLenghtOK(pesel) && checkSum(pesel)){
            return true;
        }
        else
            return false;
    }

    public static boolean isLenghtOK(String pesel){
        if(pesel.length() != 11){
            System.out.println("Podany pesel nie ma 11 cyfr.");
            return false;
        }
        else
            return true;
    }

    static int[] peselConvert(String s){
        int[] intArray = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            intArray[i] = Character.digit(s.charAt(i), 10);
        }
        return intArray;
    }

    public static boolean checkSum(String pesel){
        int Pesel[] = peselConvert(pesel);
        int sum = 9 * Pesel[0] + 7 * Pesel[1] + 3 * Pesel[2] + 1 * Pesel[3] + 9 * Pesel[4] + 7 * Pesel[5] + 3 * Pesel[6] + 1 * Pesel[7] + 9 * Pesel[8] + 7 * Pesel[9];
        sum %= 10;
        if(sum == Pesel[10]){
            return true;
        }
        else
            System.out.println("Nieprawidłowy pesel");
            return false;
    }
}
