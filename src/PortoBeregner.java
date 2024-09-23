import java.util.Scanner;

public class PortoBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvis du følger vores guide på siden her, kan du få beregnet hvad det koster at få sendt dit brev.");
        System.out.print("Det første du starter med er at indtaste brevets vægt målt i hele gram: ");
        double brevVægt = input.nextInt();
        int pris = 0;

        if (brevVægt < 0 && brevVægt > 2000) {
            System.out.println("Et brev med denne vægt kan vi ikke sende."); }
        else {
            if (brevVægt > 0 && brevVægt <= 100) {
                pris = 25;
            } else {
                if (brevVægt > 101 && brevVægt <= 250) {
                    pris = 50;
                } else {
                    if (brevVægt > 251 && brevVægt <= 2000) {
                        pris = 75;
                    }
                    System.out.println("Eftersom dit brev vejer " + brevVægt + " gram, vil prisen for at sende dette brev være: " + pris + " kr.");
                }
            }
        }

        // i stedet for større end så lav mindre end eller ligmed, da 100 ikke er dækket ind lige nu




    }
}
