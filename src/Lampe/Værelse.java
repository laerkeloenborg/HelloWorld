package Lampe;

public class Værelse {
    public static void main(String[] args) {

        Lampe skrivebordsLampe = new Lampe(true);
        System.out.println("Status på skrivebordslampen: ");
        skrivebordsLampe.trykPåKontakt();

        System.out.println();

        Lampe sengeLampe = new Lampe(false);
        System.out.println("Status på sengeLampen: ");
        sengeLampe.trykPåKontakt();

        System.out.println("Antal lamper oprettet: " + Lampe.getAntalLamper());



    }
}
