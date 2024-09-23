package StuderendeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class StudieholdTest {
    public static void main(String[] args) {
        //Opretter nye studerende
        Studerende studerende1 = new Studerende("Lærke", "hej@gmail.com");
        Studerende studerende2 = new Studerende("Bo", "bo21@gmail.com");
        Studerende studerende3 = new Studerende("Petrine", "peterhi@gmail.com");

        //opretter nyt hold
        Hold holdA = new Hold();

        //tilføjer de studerende til vores hold objekt
        holdA.tilføjStuderende(studerende1);
        holdA.tilføjStuderende(studerende2);
        holdA.tilføjStuderende(studerende3);

        //Printer de studerende ud
        System.out.println(holdA);
        System.out.println("De studerende i nummerisk rækkefølge: ");

        //printer den studerende som man søger ud efter hvis personen er der
       // System.out.println("Studerende fundet: " + holdA.søgningAfStuderende("Lærke"));

        //Metode så jeg kan få min ArrayList
        ArrayList<Studerende> listeMedStuderende = holdA.getStuderendeList();

        //For loop så jeg kan få et tal foran de studerende på listen
        for (int i = 0; i < listeMedStuderende.size(); i++){
            System.out.println(i+1 + ":" + listeMedStuderende.get(i));
        }

        //opretter scanner så vi kan lave brugerinteraktion
        Scanner brugerInput = new Scanner(System.in);

        System.out.println();

        //prompt brugeren
        System.out.println("Skriv navnet på den studerende du vil finde: ");

        //gør at brugeren kan skrive det navn de leder efter
        String navnSøgtPå = brugerInput.next();

        //ny ArrayList for søgeresultatet (i tilfælde af der bliver søgt på et navn som flere har)
        Studerende søgeresultat = holdA.søgningAfStuderende(navnSøgtPå);

        if (søgeresultat == null) {
            System.out.println("Den studerende findes ikke på holdet.");
        } else {
            System.out.println("Den studerende går på holdet! Her er personens oplysninger:\n " + holdA.søgningAfStuderende(navnSøgtPå)); //ved brug af metoden søgningAfStuderende
            // søgeresultat.setNavn("Mathias"); Bruges hvis man vil ændre navnet jeg har søgt på til mathias
        }

        System.out.println();


        // System.out.println(holdA); //her printes navneliste på studerende ud og det jeg har søgt på er nu ændret med mathias

        System.out.println("Hvis du vil ændre i en af de studerendes oplysninger, indtast deres nummer herunder samt ENTER:");
        int nummer = brugerInput.nextInt(); //opretter variabel så det kan bruges hvis evt. oplysninger skal ændres
        brugerInput.nextLine();

        Studerende ændringAfPerson = listeMedStuderende.get(nummer-1); //pga. indeks starter fra 0, derfor -1. Derudover gør det at jeg får navnet udskrevet på det indeksplads jeg starter ind
        //evt. lav et if statement så hvis man skriver et tal som ikke er på listen, skal man kunne skrive et nyt !!!!
        System.out.println("Du kan nu ændre i følgende oplysninger: " + ændringAfPerson);
        System.out.println("Rediger data og tryk ENTER. Hvis den studerendes data ikke skal redigeres tast ENTER.");
        System.out.println("Ændring af navn: " + ændringAfPerson.getNavn()); //Getmetode på at få navnet på den studerende jeg vil ændre i
        String nytNavn = brugerInput.nextLine();
        if (!nytNavn.isEmpty()){ //betyder hvis nytNavn ikke er tomt så skal den set personens navn til det brugeren har tastet
            ændringAfPerson.setNavn(nytNavn);
        }

        System.out.println("Ændring af mailadresse: " + ændringAfPerson.getMail());
        String nyMail = brugerInput.nextLine();
        if (!nyMail.isEmpty()){
            ændringAfPerson.setMail(nyMail);
        }

        System.out.println("Den studerendes nye oplysninger er: " + ændringAfPerson);
        System.out.println("Holdets oplysninger er nu opdateret og alles oplysninger er: \n" + holdA);







    }
}
