package Bil;

import java.util.ArrayList;

public class Bil {
    private String farve;
    private int antalKørteKilometer;
    private double nypris;
    private Chauffør chauffør;

    //konstruktør for bilen
    public Bil (String farve, int antalKørteKilometer, double nypris){
        this.farve = farve;
        this.antalKørteKilometer = antalKørteKilometer;
        this.nypris = nypris;
        this.chauffør = null; //der er ingen chauffør i starten
    }

    //metode til at opdatere antal kørte kilometer
    public void kør(int antalKilometer) {
        antalKørteKilometer += antalKilometer;
    }

    //metode til at få bilens nypris
    public double getNypris() {
        return nypris;
    }



    //metode til at få en beskrivelse af bilen
    public String toString() {
        return "Bilen har farven: " + farve +  ", har kørt " + antalKørteKilometer + " kilometer, og koster: " + nypris + " kr.";
    }

    //metode til at sætte en chauffør i bilen, hvis der ikke allerede er en chauffør
    public boolean enChaufførSætterSigInd(Chauffør c) {
        if (chauffør==null){
            chauffør = c;
            return true;
        } else {
            return false; //dvs. der allerede sidder en chauffør
        }
    }

    //metode til at få af vide, hvem der kører bilen
    public Chauffør hvemKørerBilen() {
        return chauffør;
    }

    //metode til at lade chaufføren stige ud af bilen
    public Chauffør chaufførenStigerUd(){
        if (chauffør != null){
            Chauffør tidligereChauffør = chauffør;
            chauffør = null;
            return tidligereChauffør;
        }
        return null; //ingen chauffør i bilen
    }
}

