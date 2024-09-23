package Lommeregner;

public class Calculator {
/*
Dette er et field
*/

    public void add(double decital1, double decital2) {
        double svar1 = decital1 + decital2;
        System.out.println("Addition of two doubles: " + decital1 + " + " + decital2 + " = " + svar1);
    }

    public void add(int heltal1, int heltal2) {
        int svar2 = heltal1 + heltal2;
        System.out.println("Addition of two integers: " + heltal1 + " + " + heltal2 + " = " + svar2);
    }

    public void add(int heltal3, int heltal4, int heltal5) {
        int svar3 = heltal3 + heltal4 + heltal5;
        System.out.println("Addition of three integers: " + heltal3 + " + " + heltal4 + " + " + heltal5 + " = " + svar3);
    }

    /*public Integer add(String tekst1, String tekst2){
        tekst1 = tekst1;
        tekst2 = tekst2;
        int svar4 = tekst1 + tekst2;
        return "Addition of two strings: " + tekst1 + " + " + tekst2 + " = " + svar4;
    }*/


    public void multiply (int tal1, int tal2){
        int svar5 = tal1 + tal2;
        System.out.println("Multiplication of two integers: " + tal1 + " * " + tal2 + " = " + svar5);
    }

    public void multiply (double tal3, double tal4){
        double svar6 = tal3 + tal4;
        System.out.println("Multiplication of two doubles: " + tal3 + " * " + tal4 + " = " + svar6);
    }

    public void divide (int tal5, int tal6){
        int svar7 = tal5 / tal6;
        System.out.println("Division of two integers: " + tal5 + " / " + tal6 + " = " + svar7);
    }

    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       calculator.add(7.3,5.2); //to decimaltal lægges sammen
       calculator.add(13,2); //to heltal lægges sammen
       calculator.add(1,2,3); //tre heltal lægges sammen
       calculator.multiply(2,6); //to heltal ganges sammen
       calculator.multiply(2.3,3.2); //to decimaltal ganges sammen
       calculator.divide(20,2); //to heltal divideres
    }


}
