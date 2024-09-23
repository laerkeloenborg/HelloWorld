package Supermarkedswebshop;

import java.util.ArrayList;

public class Indkøbskurv {
    //Private Arraylist til at gemme ordrelinjer
    private ArrayList<Ordrelinje> ordrelinjer;

    //konstruktor der initialiserer ArrayListen
    public Indkøbskurv(){
        ordrelinjer = new ArrayList<>();
    }

    //Metode til at tilføje en ordrelinje til kurven
    public void tilføjOrdrelinje (Ordrelinje ordrelinje){
        ordrelinjer.add(ordrelinje);
    }

    //Metode til at beregne den samlede pris af alle varer i kurven
    public double samletPris(){
        double totalPris = 0;
        for (Ordrelinje ordrelinje : ordrelinjer){
            totalPris += ordrelinje.samletPris();
        }
        return totalPris;
    }

    @Override
    public String toString(){
        String kurvIndhold = "Indkøbskurv:\n";
        for (Ordrelinje ordrelinje : ordrelinjer) {
            kurvIndhold = kurvIndhold + ordrelinje.toString() + "\n";
        }
        kurvIndhold = kurvIndhold + "Samlet pris: " + samletPris() + " kr.";
        return kurvIndhold;
    }


}
