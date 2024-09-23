package Konto;

public class KontoTest {
    public static void main(String[] args) {
        Konto konto1 = new Konto(); //opretter en konto med default constructor

        System.out.println(konto1);

        Konto konto2 = new Konto("12345", "Lærke Lønborg"); //opretter konto med kontonummer og ejernavn

        System.out.println(konto2);

        Konto konto3 = new Konto("123456", "Lone", 625); //opretter konto med kontonummer, ejernavn og saldo

        System.out.println(konto3);

        //INDSÆT PENGE

        konto2.indsæt(4200.5); //det beløb man skriver i parentesen er det beløb der bliver lagt til saldoen.
        System.out.println("Efter indsætning: " + konto2);

        //HÆV PENGE

        konto3.hæv(200);
        System.out.println("Efter hævning: " + konto3);

        //HÆVNING AF FLERE PENGE END DER ER PÅ KONTOEN
        double nySaldo = konto3.hæv(1000);
        if (nySaldo == -1){
            System.out.println("Ikke nok penge på kontoen til at hæve det ønskede beløb");
        }





    }
}
