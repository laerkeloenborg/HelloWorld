package Terning;

public class Terningespil {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        terning1.roll(); //terning 1 tilskrives en ny random værdi
        terning2.roll(); //terning 2 tilskrives en ny random værdi

        System.out.println(terning1.getFaceValue());
        System.out.println(terning2.getFaceValue());

        int resultat1 = terning1.getFaceValue();
        int resultat2 = terning2.getFaceValue();

        if (resultat1 == 1 && resultat2 == 1){
            System.out.println("SNAKE EYES!");
        }



    }
}
