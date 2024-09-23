import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvis du vil finde ud af hvad dit BMI er, så kig med her.");
        System.out.print("Du skal starte med at indtaste din vægt her: ");
        double vægt = input.nextDouble();
        System.out.print("Til sidst skal du indtaste din højde i meter her: ");
        double højde = input.nextDouble();
        double total = (vægt / (højde * højde));
        boolean totalUndervægtig = total < 18.5;
        boolean totalNormalvægtig = total > 18.5 && total < 25;
        boolean totalOvervægtig = total > 25.1 && total < 30;
        boolean totalSværtOvervægtig = total > 30;

        if (totalUndervægtig) {
            System.out.println("Ifølge din indtastet vægt og højde, har du en BMI på " + total);
            System.out.println("Dermed svarer dit BMI tal til at du er undervægtig.");
        } else if (totalNormalvægtig) {
            System.out.println("Ifølge din indtastet vægt og højde, har du en BMI på " + total);
            System.out.println("Dermed svarer dit BMI tal til at du er normalvægtig.");
        } else if (totalOvervægtig) {
            System.out.println("Ifølge din indtastet vægt og højde, har du en BMI på " + total);
            System.out.println("Dermed svarer dit BMI tal til at du er overvægtig.");
        } else if (totalSværtOvervægtig) {
            System.out.println("Ifølge din indtastet vægt og højde, har du en BMI på " + total);
            System.out.println("Dermed svarer dit BMI tal til at du er svært overvægtig.");
        }
    }
}
