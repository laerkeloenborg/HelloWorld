package DiverseSpil;

import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {
        Scanner usersChoice = new Scanner(System.in);
        Random rand = new Random();

        final int BEDST_UD_AF = 3;
        int count = 0;
        int computerPoint = 0;
        int brugerPoint = 0;

        System.out.println("Velkommen til spillet: Sten, Saks, Papir.");
        System.out.println("Vi spiller bedst ud af " + BEDST_UD_AF + " runder.");

        int randomNumber = rand.nextInt(3) + 1;
        String computersHåndtegn;

        while (count < BEDST_UD_AF) {
            System.out.println("Start med at vælge dit håndtegn:");
            String brugerensHåndtegn = usersChoice.next();

            if (randomNumber == 1) {
                computersHåndtegn = "sten";
            } else if (randomNumber == 2) {
                computersHåndtegn = "saks";
            } else {
                computersHåndtegn = "papir";
            }
            if (brugerensHåndtegn.equalsIgnoreCase(computersHåndtegn)) {
                System.out.println("Computeren valgte også " + computersHåndtegn + ". Det står uafgjort, prøv igen");
            } else {
                if (brugerensHåndtegn.equalsIgnoreCase("sten") && computersHåndtegn.equals("saks")) {
                    System.out.println("Computeren valgte " + computersHåndtegn + ", du vinder!");
                    brugerPoint++;

                } else if (brugerensHåndtegn.equalsIgnoreCase("papir") && computersHåndtegn.equals("sten")) {
                    System.out.println("Computeren valgte " + computersHåndtegn + ", du vinder!");
                    brugerPoint++;

                } else if (brugerensHåndtegn.equalsIgnoreCase("saks") && computersHåndtegn.equals("papir")) {
                    System.out.println("Computeren valgte " + computersHåndtegn + ", du vinder!");
                    brugerPoint++;

                } else if (brugerensHåndtegn.equalsIgnoreCase("papir") && computersHåndtegn.equals("saks")) {
                    System.out.println("Computeren valgte " + computersHåndtegn + ", computeren vinder!");
                    computerPoint++;

                } else if (brugerensHåndtegn.equalsIgnoreCase("saks") && computersHåndtegn.equals("sten")) {
                    System.out.println("Computeren valgte " + computersHåndtegn + ", computeren vinder!");
                    computerPoint++;

                } else {
                    System.out.println("Computeren valgte " + computersHåndtegn + ", computeren vinder!");
                    computerPoint++;
                }
                count++;

                if (!(computerPoint == brugerPoint)) {
                    count++;
                }
            }

        }
if (computerPoint > brugerPoint){
    System.out.println("Game over. Computeren vandt");
} else  {
    System.out.println("WEEEE! DU VANDT OVER COMPUTEREN!");
}
    }
}

