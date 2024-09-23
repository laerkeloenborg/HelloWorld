import java.util.Scanner;

public class BilletautomatDemo {
    public static void main(String[] args) {
        Billetautomat billetautomat1 = new Billetautomat(25);

        System.out.println("En billet koster: " + billetautomat1.getPris() + " kr.");

        Scanner gæstIndbetaling = new Scanner(System.in);

        System.out.println("Indtast det beløb du vil indbetale: ");

        int beløbIndsættes = gæstIndbetaling.nextInt();
        billetautomat1.setIndbetal(beløbIndsættes);

        System.out.println("Din nuværende saldo er på: " + billetautomat1.getSaldo() + " kr.");

      billetautomat1.setPrintBillet();

        System.out.println("Din saldo, efter billetkøbet, er nu på: " + billetautomat1.getSaldo() + " kr.");

        System.out.println("Automaten har samlet indtjent: " + billetautomat1.getTotal() + " kr.");


    }
}
