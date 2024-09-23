package Tid;

import java.util.Scanner; //import betyder at man indhenter en funktionalitet i javas bibliotek, i dette tilfælde java.util
//Torsdag d. 29. August 2024
public class Tidsberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //System.in er modsat af det vi kender som System.out, som gør at man kan skrive det ud i konsollen hvor system.in gør at man kan læse ind fra den
        System.out.println("Hvor mange hele timer er der gået? ");
        int timer = input.nextInt(); // dette betyder at man ikke tildeler variablen en bestemt værdi, men i stedet gør det muligt for brugeren at indtaste en værdi til selve variablen
        System.out.println("Der er gået " + timer + " timer siden midnat"); // dette gør at når brugeren tilskriver en værdi vil sætningen: der er gået xx timer siden midnat, hvor xx er det antal timer brugeren selv har angivet

        Scanner inputMinut = new Scanner(System.in); //opretter scanneren så den sidder i scriptet og venter på at der kommer et input fra brugeren som den kan bruge
        System.out.println("Hvor mange minutter er der gået? ");
        int minutter = inputMinut.nextInt();
        System.out.println("Der er gået " + minutter + " minutter siden midnat");

        Scanner inputSekund = new Scanner(System.in);
        System.out.println("Hvor mange sekunder er der gået? ");
        int sekunder = inputSekund.nextInt();
        System.out.println("Der er gået " + sekunder + " sekunder siden midnat");

        Scanner inputTid = new Scanner(System.in);
        final int SEKUNDER_PER_TIME = 60*60; //der kunne ligeledes stå 3600 i stedet for 60*60
        final int SEKUNDER_PER_MINUT = 60; //erklærer hermed min variabel sekunderVærdi for en konstant, dermed ændres værdien ikke. Ser pænere ud for brugeren, hvis man kigger på koden og under variablen samletSekunder
        System.out.println("Hvor mange sekunder er der gået siden midnat?"); //outputtet spørger brugeren hvor mange sekunder der er gået siden midnat
        int samletSekunder = ((timer*SEKUNDER_PER_TIME)+(minutter*SEKUNDER_PER_MINUT)+sekunder); // her tager koden og udregner samlet antal sekunder af de værdier som brugeren har indtastet i de forrige spørgsmål om hvor mange timer og minutter der er gået.
        System.out.println("Der er gået " + timer + " timer " + minutter + " minutter " + sekunder + " sekunder siden midnat");
        System.out.println("Der er gået " + samletSekunder + " sekunder siden midnat");


    }
}
