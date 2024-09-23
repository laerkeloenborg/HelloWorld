package Cirkel;

public class CirkelTest {
    public static void main(String[] args) {

        Cirkel cirkelA = new Cirkel(4.5);

        double cirkelAAreal = cirkelA.arealBeregner();

        Cirkel cirkelB = new Cirkel(12);


        double cirkelBAreal = cirkelB.arealBeregner();

        System.out.println("Arealet af cirkel A er " + cirkelAAreal + " og cirkel B har et areal på " + cirkelBAreal);

    }
}
