package Supermarkedswebshop;

public class Vare {
    private String navn;
    private double pris = 0;

    public Vare (String navn, double pris){
        this.navn = navn;
        this.pris = pris;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(){
        this.navn = navn;
    }


    public double getPris(){
        return pris;
    }

    public void setPris(){
        this.pris = pris;
    }

    @Override
    public String toString(){
        return "Vare: " + navn + ", Pris: " + pris + " pr. stk.";
    }

}
