public class Menneske {
    private String navn;
    private Menneske ægtefælle;

    //konstruktør
    public Menneske(String navn) {
        this.navn = navn;
        this.ægtefælle = null; //Der er ingen ægtefælle til at starte med
    }

    //set metode
    public void setÆgtefælle(Menneske ægtefælle) { //vi sætter ægtefælle værdien til ægtefække
        this.ægtefælle = ægtefælle;
    }

    //get metode
    public Menneske getÆgtefælle() { //Vi henter værdien for ægtefælle
        return ægtefælle;
    }


    //metode til at en person kan gifte sig med en anden
    public void giftSigMed(Menneske andenPerson) {
        if (!andenPerson.equals(this)) { //this er klassen Menneske
            ægtefælle = andenPerson;
        }
        if (andenPerson.getÆgtefælle() == null) {
            andenPerson.giftSigMed(this); //anden persons navn gifter sig med this, som er navnet på det menneske vi har lavet klassen baseret på
        }
    }

    //metode til at en person bliver skilt fra en anden
    public void bliverSkilt() {
        if (ægtefælle != null) {
            Menneske eksPartner = ægtefælle; //
            ægtefælle = null;
            eksPartner.bliverSkilt();
        }
    }

public String getNavn(){
        return navn;
}



}
