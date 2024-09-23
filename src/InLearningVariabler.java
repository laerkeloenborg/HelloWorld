import java.util.Scanner; //gør at vi kan bruge datatypen Scanner

public class InLearningVariabler {
    public static void main(String[] args) {
        //  int studerendesAlder = 21;
        double studerendesKarakterGennemsnit = 7.9;
        // char studerendesFirstInitial = 'L';
        // char studerendesSidsteInitial = 'L';
        // boolean studerendesPerfectAttendance = true;
        String studerendesFornavn = "Lærke";
        String studerendesEfternavn = "Lønborg";

        //  System.out.println(studerendesAlder);
        // System.out.println(studerendesKarakterGennemsnit);
        //  System.out.println(studerendesFirstInitial);
        //  System.out.println(studerendesSidsteInitial);
        // System.out.println(studerendesPerfectAttendance);
        System.out.println(studerendesFornavn + " " + studerendesEfternavn + " har karaktergennemsnittet " + studerendesKarakterGennemsnit);
        System.out.println("Hvad er dit karaktergennemsnit nu?");

        Scanner input = new Scanner(System.in); //laver et nyt scanner objekt, dermed kan brugeren skrive i inputtet. Det nye gennemsnit skal skrives med komma i stedet for punktum?
        studerendesKarakterGennemsnit = input.nextDouble(); //læser brugeren input. nextDouble læser double værdien fra brugeren
        System.out.println(studerendesFornavn + " " + studerendesEfternavn + " har nu karaktergennemsnittet " + studerendesKarakterGennemsnit); //outputtet kommer af brugerens input


    }
}
