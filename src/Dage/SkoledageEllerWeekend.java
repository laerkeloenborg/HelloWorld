package Dage;

import java.util.Scanner;

public class SkoledageEllerWeekend {
    public static void main(String[] args) {
        Scanner brugerInput = new Scanner(System.in);
        Ugedag ugedag = null;

        int nummer = 1; // Startnummer for menuen

        for (Ugedag menu : Ugedag.values()) {
            System.out.println(nummer + ": " + menu);
            nummer++;
        }

        System.out.println("Vælg et tal fra 1-7");
        int brugerValg = brugerInput.nextInt();

        while (brugerValg < 1 || brugerValg > 7) {
            System.out.println("Du må kun skrive et tal fra 1-7. Prøv igen");
            brugerValg = brugerInput.nextInt();
        }

        switch (brugerValg) {
            case 1 -> System.out.println(Ugedag.MANDAG);
            case 2 -> System.out.println((Ugedag.TIRSDAG));
            case 3 -> System.out.println(Ugedag.ONSDAG);
            case 4 -> System.out.println(Ugedag.TORSDAG);
            case 5 -> System.out.println(Ugedag.FREDAG);
            case 6 -> System.out.println(Ugedag.LØRDAG);
            case 7 -> System.out.println(Ugedag.SØNDAG);
        }

        /*switch (brugerValg) {
            case 1, 2, 3, 4, 5 -> System.out.println("Det er hverdag");
            case 6, 7 -> System.out.println("Det er weekend");
        } */
        if (brugerValg >= 1 && brugerValg <= 5) { //behøver ikke stå >= 1. Pga. der er to if sætninger inde i vores if er det nesting.
            System.out.println("Du skal i skole");
            if (brugerValg == 1) {
                System.out.print("Det er mandag igen...");
            }
            if (brugerValg == 5) {
                System.out.println("Men du har weekend når du har fri");
            }
        } else {
            System.out.println("Det er weekend, bare sov videre");
        }


    }
}
