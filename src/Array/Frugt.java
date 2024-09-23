package Array;

import java.util.ArrayList;

public class Frugt {
    public static void main(String[] args) {

        //Laver en array og printer en af listens elementer ud
        String[] frugt = new String[3]; //3 er hvor mange elementer der er tilstede i vores array
        frugt[0] = "Banan";
        frugt[1] = "Jordbær";
        frugt[2] = "Mango";
        System.out.println(frugt[1]);

        // dette kan gøres i stedet for det ovenover. Her bruges ArrayList, dette er mere fleksibelt end et normalt array som ses ovenover
        ArrayList frugtliste = new ArrayList();
        frugtliste.add("Jordbær");
        frugtliste.add("Mango");
        frugtliste.add("Banan");
       /* for (int i = 0; i < frugtliste.size(); i++){
            System.out.println(frugtliste.get(i));
        }
        Printer vores ArrayList ud i et for loop
        */


        System.out.println(frugtliste.get(1)); //Printer det objekt/element der står på plads 1 (indekstal) i vores ArrayList
        frugtliste.set(1,"Citron");//Skifter det objekt der er på indeks plads nr. 1 ud med Citron
        System.out.println(frugtliste.get(1)); //Her printer vi det nye element som er på indeks plads nr 1 ud

        frugtliste.remove("Mango"); //fjerner elementet mango fra arraylisten
       //frugtliste.clear(); //fjerner alle elementer i en arraylist
        System.out.println(frugtliste.contains("Hindbær")); //giver en true eller false værdi anpå om det element vi skriver (her er det hindbær) findes i vores frugtlisst


        System.out.println(frugtliste);
        System.out.println(frugtliste.size());




    }
}
