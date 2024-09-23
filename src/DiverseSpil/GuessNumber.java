package DiverseSpil;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); //laver et random objekt

        int numberToGuess = rand.nextInt(10) + 1; /*betyder at der kommer et random tal mellem 1 og 10. dette kan ligeledes tilskrives rand.nextInt(1, 11);
        (10) betyder at det finder et tal 0 til 9, +1 betyder at vi sætter +1 på. Det er fordi man starter på 0*/
        int usersGuess = -1;// det skal være et tal det aldrig kan blive i den ramme vi har sat op. Det her med at det ikke må være et tal 1 til 10
        int numberOfGuess = 0;

        System.out.println("Her skal du prøve at gætte et tal, start med at skriv et tal 1-10");
        while (usersGuess != numberToGuess) {
            usersGuess = input.nextInt();
            numberOfGuess++;
            if (usersGuess > numberToGuess) {
                System.out.println("Dette var for højt, prøv et lavere tal");
            } else if (usersGuess < numberToGuess) {
                System.out.println("Dette var for lavt, prøv et højere tal");
            } else {
                System.out.println("Korrekt! Det rigtige tal var " + numberToGuess + ". Det tog dig " + numberOfGuess + " at gætte det rigtige tal.");
            }
        }
    // her kan sout med at der er korrekt og bla bla sagtens stå her i stedet for i else

    }
}
