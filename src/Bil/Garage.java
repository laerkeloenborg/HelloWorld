package Bil;

import java.util.ArrayList;

public class Garage{

    //Laver en ArrayList
    private ArrayList<Bil> bilerne = new ArrayList<Bil>();

    //Laver en metode til at fortælle hvor mange biler der er i vores ArrayList
    public void antalBiler(){
        bilerne.size();
    }

    //Laver metoden for at tilføje en bil til ArrayListen
    public void tilføjBil(Bil nyBil){
        bilerne.add(nyBil);
    }

    //Laver metoden for at beregne prisen for alle bilerne i ArrayListen
    public double beregnPrisForAlleBiler(){
        double prisSum = 0.0; //Definere variablen prisSum som skal bruges til at finde summen af alle priserne

        for (Bil bil : bilerne){ //Laver for each loop da den skal loope gennem alle bilerne i ArrayListen
            prisSum += bil.getNypris(); //+=, +'et skal være der så det lægger den næste pris oveni den pris du har nu
            //prisSum = prisSum + bil.getNypris(); Dette er i princippet det samme som det der står ovenover.
        }
        return prisSum; //returnere den pris som loopet er kommet fremtil
    }
}
