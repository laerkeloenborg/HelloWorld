package Årstid;

import java.util.Scanner;

public class HvilkenÅrstid {
    public static void main(String[] args) {
        Scanner brugerInput = new Scanner(System.in);
        int nummer = 1;

        System.out.println("VELKOMMEN TIL! Her kan du finde frem til hvilken årstid de forskellige måneder kategoriseres som. \n Nedenunder ses en liste over de 12 måneder, samt hvilket tal de har.");


        for (ÅretsMåneder månedNummer : ÅretsMåneder.values()) { //laver en liste med numre og månedernes navn
            System.out.println(nummer + ": " + månedNummer);
            nummer++;
        }

        System.out.println("Start med at indtaste et tal, for den måned du vil finde ud af årstiden på:");
        int brugerValg = brugerInput.nextInt();

        while (brugerValg < 1 || brugerValg > 12) {
            System.out.println("Dette tal kan ikke finde en måned. Prøv igen med et tal 1-12");
            brugerValg = brugerInput.nextInt();
        }

        ÅretsMåneder åretsMåneder = null;

        åretsMåneder = switch (brugerValg) {
            case 1 -> ÅretsMåneder.JANUAR;
            case 2 -> ÅretsMåneder.FEBRUAR;
            case 3 -> ÅretsMåneder.MARTS;
            case 4 -> ÅretsMåneder.APRIL;
            case 5 -> ÅretsMåneder.MAJ;
            case 6 -> ÅretsMåneder.JUNI;
            case 7 -> ÅretsMåneder.JULI;
            case 8 -> ÅretsMåneder.AUGUST;
            case 9 -> ÅretsMåneder.SEPTEMBER;
            case 10 -> ÅretsMåneder.OKTOBER;
            case 11 -> ÅretsMåneder.NOVEMBER;
            case 12 -> ÅretsMåneder.DECEMBER;
            default -> null;
        };
        System.out.println(åretsMåneder);


        switch (åretsMåneder){
            case DECEMBER, JANUAR, FEBRUAR -> System.out.println("Det er vinter!");
            case MARTS, APRIL, MAJ -> System.out.println("Det er forår!");
            case JUNI, JULI, AUGUST -> System.out.println("Det er sommer!");
            case SEPTEMBER, OKTOBER, NOVEMBER -> System.out.println("Det er efterår!");
        };



       /* if (brugerValg >= 3 && brugerValg <= 5) {
            System.out.println("Det er forår!");
        } else if (brugerValg >= 6 && brugerValg <= 8) {
            System.out.println("Det er sommer!");
        } else if (brugerValg >= 9 && brugerValg <= 11) {
            System.out.println("Det er efterår!");
        } else {
            System.out.println("Det er vinter!");
        }*/

    }
}
