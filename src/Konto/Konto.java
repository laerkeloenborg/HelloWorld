package Konto;

public class Konto {
    //ATTRIBUTTER
    private String kontonummer;
    private String ejernavn;
    private double saldo;

    //GET METODER
    public String getKontonummer() { //returnere kontonummeret som det er på nuværende tidspunkt
        return kontonummer;
    }

    public String getEjernavn() { //returnere ejernavnet som det er på nuværende tidspunkt
        return ejernavn;
    }

    public double getSaldo() { //returnere saldoen som det er på nuværende tidspunkt
        return saldo;
    }

    //SET METODER - void bruges fordi vi ikke vil have den returnere en værdi
    public void setKontonummer(String kontonummer) { //angiver værdien for kontonummer.
        this.kontonummer = kontonummer;
    }

    public void setEjernavn(String ejernavn) { //angiver værdien for ejernavn
        this.ejernavn = ejernavn;
    }

    public void setSaldo(double saldo) { //angiver værdien for saldoen
        this.saldo = saldo;
    }

    //CONSTRUCTORS
    /*
    Konstruktør uden parametre bruges, når du vil oprette en konto med standardværdier.
    Konstruktør med kontonummer og ejernavn bruges, når du vil oprette en konto, men ikke behøver at angive en startsaldo (saldo sættes automatisk til 0).
    Konstruktør med kontonummer, ejernavn og saldo bruges, når du vil oprette en konto og angive alle tre oplysninger (kontonummer, ejernavn, og startsaldo).
     */

    public Konto() { //Default constructor. Den tager ikke nogle parametre og dermed bruger den standardværdierne
        this.kontonummer = "ukendt";
        this.ejernavn = "ukendt";
        this.saldo = 0.0;
    }

    public Konto(String kontonummer, String ejernavn) { //Tager parametrene kontonummer og ejernavn, dvs. kontonummer og ejernavn sættes til de værdier der gives når objektet oprettes
        this.kontonummer = kontonummer;
        this.ejernavn = ejernavn;
        this.saldo = 0.0;
    }

    public Konto(String kontonummer, String ejernavn, double saldo) {// tager parametrene kontonummer, ejernavn og saldo, dvs. Den initialiserer alle tre instansvariable med de værdier, der gives, når objektet oprettes.
        this.kontonummer = kontonummer;
        this.ejernavn = ejernavn;
        this.saldo = saldo;
    }

    //METODE TIL AT INDSÆTTE PENGE
    public double indsæt(double beløb) { //metoden indsæt tager parametren beløb (det beløb brugeren ønsker at indsætte på kontoen)
        if (beløb > 0){
            this.saldo += beløb;
        }
        return this.saldo;
    }

    //METODE TIL AT HÆVE PENGE
    public double hæv(double beløb) { //metoden hæv tager parameteren beløb (det beløb der ønskes hævet fra konto)
        if (beløb > 0 && beløb <= saldo) { //betingelsen i if statementet gør at det kun kan trækkes fra saldoen hvis beløbet er over 0 og mindre end det der allerede står på saldoen
            saldo -= beløb;
            return saldo;
        } else {
            return -1; //dette er hvis der forsøges at hæves mere end der er på kontoen
        }
    }

    @Override
    public String toString() {
        return "Konto.Konto { " +
                "Kontonummer: " + kontonummer + "." +
                " Ejernavn: " + ejernavn + "." +
                " Saldo: " + saldo + " kr. }";
    }
}
