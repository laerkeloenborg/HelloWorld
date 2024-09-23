package Lommeregner;

public class Calculator2 {
    public double add(double decital1, double decital2) {
       return decital1 + decital2;
    }

    public int add(int heltal1, int heltal2) {
        return heltal1 + heltal2;
    }

    public int add(int heltal3, int heltal4, int heltal5) {
      return heltal3 + heltal4 + heltal5;
    }

    public int add(String tekst1, String tekst2){
       int tal3 = Integer.parseInt(tekst1); //to lokale variabler fordi det er indenfor metodens scope
       int tal4 = Integer.parseInt(tekst2); //gør så når vores string lægges sammen giver det en int

       return tal3 + tal4;
    }


    public int multiply (int tal1, int tal2){
       return tal1 * tal2;
    }

    public double multiply (double tal3, double tal4){
       return tal3 * tal4;
    }

    public double divide (int tal5, int tal6){
       return (double) tal5 / tal6;
    }

    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        System.out.println(calculator.add(2,2)); //to heltal lægges sammen
    }


}
