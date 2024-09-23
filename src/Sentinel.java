import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SENTINEL = -1;
        int tal = 0;
        int sum = 0;

        System.out.println("Indtast de tal der skal lægges sammen, eller -1 for at stoppe.");

        while (tal != SENTINEL){
            sum += tal; //vigtigt at dette står ovenover det nedenunder, da rækkefølgen er vigtig. Fordi så længe tallet ikke er -1 kommer summen frem derefter taster du tal derefter sum osv. indtil du skriver -1 og så stopper loopet og dermed kommer der ikke en sum efterfølgende-
            tal = input.nextInt(); //Hvis dette står ovenover i stedet, vil summen blive fratrukket -1 når man skriver dette for at få loopet til at stoppe.
        }
        input.close();
        System.out.println("Summen er " + sum);
    }
}
