package Konto;

import java.util.Scanner;

public class KontoTestMedBrugerInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //OPRETTER BRUGERINPUT
        System.out.println("Indtast dit kontonummer: ");
        String kontonummer = userInput.nextLine();

        System.out.println("Indtast navnet på ejeren af kontoen: ");
        String ejernavn = userInput.nextLine();

        System.out.println("Indtast startsaldo: ");
        double saldo = userInput.nextDouble();

        //OPRETTER KONTOOBJEKT
        Konto minkonto = new Konto(kontonummer, ejernavn, saldo);
        System.out.println("Konto.Konto oprettet: " + minkonto);

        //BRUGEREN VIL INDSÆTTE / HÆVE PENGE
        System.out.println("Skriv om du vil indsætte eller hæve penge (skriv indsæt eller hæv): " + userInput.nextLine());
        String valg = userInput.nextLine();

        if (valg.equalsIgnoreCase("indsæt")) {

            System.out.println("Indtast det beløb du vil sætte ind på din konto: ");
            double indsatBeløb = userInput.nextDouble();
            double nySaldoEfterIndsætning = minkonto.indsæt(indsatBeløb);
            System.out.println("Efter indsætningen er din saldo nu på: " + nySaldoEfterIndsætning + " kr.");

        } else if (valg.equalsIgnoreCase("hæv")) {

            System.out.println("Indtast det beløb du vil hæve på din konto: ");
            double hævBeløb = userInput.nextDouble();
            double nySaldoEfterHævning = minkonto.hæv(hævBeløb); //minkonto bruger metoden hæv fra filen Konto.Konto, og trækker det beløv der er skrevet i parentesen

            if (nySaldoEfterHævning == -1) {
                System.out.println("Fejl: Ikke nok penge på kontoen til at hæve dette beløb!");
            } else {
                System.out.println("Efter hævningen er din saldo nu på: " + nySaldoEfterHævning + " kr.");
            }


        }
    }
}
