package Terning;

import java.util.Random;

public class Terningkast {
    public static void main(String[] args) {
        Random rand = new Random();
        int kastEt = rand.nextInt(6) + 1; //de to tal kan ligeledes defineres inden i loop'et
        int kastTo = rand.nextInt(6) + 1;
        int sum = 0;
        int terningeKast = 0;

        while (sum != 7) {
            kastEt = rand.nextInt(6) + 1;
            kastTo = rand.nextInt(6) + 1;
            sum = kastEt + kastTo;
            System.out.println(kastEt + "+" + kastTo + "= " + sum);
            terningeKast++;
        }
        System.out.println("Du brugte " + terningeKast + " kast på at ramme 7!");
    }
}
