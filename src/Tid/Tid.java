package Tid;

public class Tid {
    public static void main(String[] args) {
        int startSekund = 10;
        int startMinut = 54;
        int startTime = 9;

        int sekunderDøgn = (24*60*60);
        int brugtTid = ((startTime*60*60)+(startMinut*60)+startSekund);
        int resterendeTid = (sekunderDøgn - brugtTid);

        int færdigSekund = 15;
        int færdigMinut = 22;
        int færdigTime = 10;

        int tidBrugtMinut = (startMinut - færdigMinut);
        int tidBrugtSekund = (færdigSekund - startSekund);
        int altTidBrugtSekunder = ((tidBrugtMinut*60)+tidBrugtSekund);

        System.out.println("Sekunder: " + startSekund);
        System.out.println("Minutter: " + startMinut);
        System.out.println("Timer: " + startTime);
        System.out.println("Siden midnat er der gået " + brugtTid + " sekunder");

        System.out.println("Der er " + resterendeTid + " sekunder tilbage i dette døgn");

        System.out.println("Færdig sekund: " + færdigSekund);
        System.out.println("Færdig minut: " + færdigMinut);
        System.out.println("Færdig time: " + færdigTime);

        System.out.println("Det tog " + tidBrugtMinut + " minutter og " + tidBrugtSekund + " sekunder på at lave denne opgave");
        System.out.println("Der er brugt " + altTidBrugtSekunder + " sekunder på at lave opgaven");

    }

}
