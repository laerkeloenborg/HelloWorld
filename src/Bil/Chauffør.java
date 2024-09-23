package Bil;

public class Chauffør {
    private String chaufførNavn;

    //konstruktør for Bil.Chauffør
    public Chauffør(String chaufførNavn){
       this.chaufførNavn = chaufførNavn;
    }

    //metode til at få chaufførens navn
    public String toString(){
        return chaufførNavn;
    }
}
