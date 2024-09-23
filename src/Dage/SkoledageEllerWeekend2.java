package Dage;

import java.util.Scanner;

public class SkoledageEllerWeekend2 {
    public static void main(String[] args) {
        System.out.println("Vælg en dag, ved at skrive et tal 1-7");
        int brugerValg;
        Scanner scanner = new Scanner(System.in);
        brugerValg = scanner.nextInt();
        Ugedag ugedag = null;
        while (brugerValg > 7 || brugerValg < 1) {
            System.out.println("Det er ikke en af de 7 dage, prøv igen");
            brugerValg = scanner.nextInt();
        }
        /*ugedag = Ugedage.values()[brugerValg];
        String dag = "";
         switch(ugedag) {
             case
        };
        System.out.println(brugerValg);*/
        ugedag = switch (brugerValg) {
            case 1 -> Ugedag.MANDAG;
            case 2 -> Ugedag.TIRSDAG;
            case 3 -> Ugedag.ONSDAG;
            case 4 -> Ugedag.TORSDAG;
            case 5 -> Ugedag.FREDAG;
            case 6 -> Ugedag.LØRDAG;
            case 7 -> Ugedag.SØNDAG;
            default -> null;
        };
        System.out.println(ugedag);
        String weekendOrWorkday;
        /*weekendOrWorkday = switch(ugedag){
            case Monday, Tuesday, Wednesday, Thursday, Friday -> "its a workday";
            case Saturday, Sunday -> "its weekend!";
        };
        System.out.println(weekendOrWorkday);*/
        if (ugedag == Ugedag.MANDAG) {
            System.out.println("Det mandag igen... Du skal i skole");
        } else if (ugedag == Ugedag.TIRSDAG || ugedag == Ugedag.ONSDAG || ugedag == Ugedag.TORSDAG) {
            System.out.println("Du skal i skole");
        } else if (ugedag == Ugedag.FREDAG) {
            System.out.println("Du har weekend når du har fri");
        } else {
            System.out.println("Det er weekend bare sov videre ");
        }


    }
}

