package Lampe;

public class Lampe {
    private boolean erTændt;
    private static int antalLamper = 0;

    public Lampe(boolean erTændt) {
        this.erTændt = erTændt;
        antalLamper++;
    }

    public Lampe() {
        erTændt = false;
        antalLamper++;
    }

    public void trykPåKontakt() {
        erTændt = ! erTændt;
        if (erTændt) {
            System.out.println("Lampen er slukket!");
        } else {
            System.out.println("Lampen er tændt!");
        }
    }

    public static int getAntalLamper() {
        return antalLamper;
    }


    @Override
    public String toString(){
        if(erTændt == true){
            return "Lampen er slukket";
        } else {
            return "Lampen er tændt";
        }
    };



}

