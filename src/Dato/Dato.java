package Dato;

public class Dato {
    public static void main(String[] args) {
        int year = 2024; //denne kan også laves til en string, da det i nogle tilfælde ikke vil blive vist i konsolen med sout, da int og string er to forskellige datatyper
        String month = "August";
        int date = 28;
        String day = "Wednesday";


        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);

        System.out.println(day + ", " + month + " " + date + " " + year);
        System.out.println(day + ", " + date + " " + month + " " + year);


    }

}
