public class Billetautomat {
    private int pris;
    private int saldo;
    private int total;

    public Billetautomat(int billetpris){
        pris = billetpris;
        saldo = 0;
        total = 0;
    }

    public int getPris(){
        return pris;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setIndbetal(int kroner){
        saldo = 0;

        if (kroner > 0){
            saldo += kroner;
        } else {
            System.out.println("Du skal minimum indsætte 0 kr. ind");
        }
    }

    public void setPrintBillet(){
       String billet = "############# \n" +
               "## Billet: " + pris + " kr. ##";

        if (saldo >= pris){
            System.out.println(billet);
            total += pris;
            saldo -= pris;
        } else {
            int difference = pris - saldo;
            System.out.println("Du mangler at indbetale: " + difference + " før du kan få din billet.");
        }
    }

    public int getTotal(){
        return total;
    }



}
