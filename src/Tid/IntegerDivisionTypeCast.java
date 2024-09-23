package Tid;

public class IntegerDivisionTypeCast {
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

        System.out.println("Færdig sekund: " + færdigSekund);
        System.out.println("Færdig minut: " + færdigMinut);
        System.out.println("Færdig time: " + færdigTime);

        System.out.println("Det tog " + tidBrugtMinut + " minutter og " + tidBrugtSekund + " sekunder på at lave denne opgave");
        System.out.println("Der er brugt " + altTidBrugtSekunder + " sekunder på at lave opgaven");

        // Opgave 1) Udskriv hvor mange procentdele af en time din minutvariabel er
        char procent = '%';
        System.out.println("Procentdel af timen der er gået: " + (tidBrugtMinut*100/60) + procent);

        // Opgave 2) Lav din minut-variabel om til typen double - så du får et kommatal der viser hvor mange brøkdele af en time dit minut-variabel er
        double minutterProcent = 32.0;

        System.out.println("Brøkdel af timen, der er gået: " + (minutterProcent/60));

        // Opgave 3) Lav din minut-variabel om til typen double - ved at type caste variablen ind i selve beregningen
        System.out.println("Brøkdel af timen, der er gået: " + ((double)tidBrugtMinut/60));

        // Opgave 4) Lav en konstant i stedet for at have tallet 60 stående i koden
        int minutterPerTime = 60;
        // final int minutterPerTime = 60;
        //final gør at minutterPerTime ikke kan tildeles en ny værdi
        //Variabler der er blevet erklæret final kaldes for en konstanter
        //Konventionen (reglen) for navngivning af konstanter er at de skrives med store bogstaver og tegnet _ i mellem hvert ord
        final int MINUTTER_PER_TIME = 60;
        final int PROCENT_TAL = 100;
        System.out.println("Brøkdel af timen, der er gået: " + ((double)tidBrugtMinut/MINUTTER_PER_TIME)); //når man skriver double inde i variablen tvinger den til at hive det ud af integer og dermed kommer de resterende decimaler efter komma'et med
        System.out.println("Brøkdel af timen, der er gået: " + ((double)tidBrugtMinut/MINUTTER_PER_TIME*PROCENT_TAL)+ procent); // istedet for at skrive double kan man også bare skrive d - f.eks. 1d/3 istedet for (double) 1/3
    }

}
