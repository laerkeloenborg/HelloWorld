package Supermarkedswebshop;

public class Ordrelinje {
    private int antal;
    private Vare vare;

    public Ordrelinje(int antal, Vare vare){
        this.antal = antal;
        this.vare = vare;
    }

    public double samletPris(){
        return vare.getPris() * antal;
    }

    @Override
    public String toString(){
        return "Ordrelinje: " + antal + " stk " + vare + ", samlet pris: " + samletPris() + " kr.";
    }

}
