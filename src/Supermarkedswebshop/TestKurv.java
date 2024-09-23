package Supermarkedswebshop;

public class TestKurv {
    public static void main(String[] args) {
        Vare vare1 = new Vare("mælk", 10);
       Ordrelinje ordrelinje1 = new Ordrelinje(2, vare1);
       Indkøbskurv indkøbskurv1 = new Indkøbskurv();

       // System.out.println(ordrelinje1.samletPris());
        System.out.println(vare1);
        System.out.println(ordrelinje1);
        System.out.println(indkøbskurv1);

    }

}
