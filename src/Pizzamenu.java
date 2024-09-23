import java.util.Scanner;

public class Pizzamenu {
    public static void main(String[] args) {
        Scanner brugerInput = new Scanner(System.in);

        System.out.println("Du skal vælge et nr. fra følgende menu: \n1. Margherita, \n2. Vesuvio, \n3. Hawaii, \n4. Pepperoni");

        int pizzaValg = brugerInput.nextInt();

        while (pizzaValg > 4 || pizzaValg < 1){
            System.out.println("Den pizza har vi ikke. Du kan vælge 1-4");
            pizzaValg = brugerInput.nextInt();
        }

        switch (pizzaValg) {
            case 1 -> System.out.println("Du har valgt Margherita");
            case 2 -> System.out.println("Du har valgt Vesuvio");
            case 3 -> System.out.println("Du har valgt Hawaii");
            case 4 -> System.out.println("Du har valgt Pepperoni");
           /* default -> System.out.println("Du har ikke valgt en pizza fra menuen."); - denne behøves ikke da vi har vores while loop ovenover switch */
        };

    }
}
