package Firkant;

public class FirkantTest {
    public static void main(String[] args) {

        Firkant firkantA = new Firkant(3.5,4.2);

        System.out.println(firkantA.beregnAereal());


        Firkant firkantB = new Firkant(5.6,5.6);

        System.out.println(firkantB.beregnAereal());

        System.out.println(firkantA.hvilkenSlagsFirkant() + "\n" + firkantB.hvilkenSlagsFirkant());

    }

}
