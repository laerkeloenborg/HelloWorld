package Bil;

public class TestBil {
    public static void main(String[] args) {
        //opretter en bil
        Bil minBil = new Bil("rød", 50, 250000);

        //opretter en chauffør
        Chauffør chauffør1 = new Chauffør("Preben");

        //udskriver information om bilen
        System.out.println(minBil);

        //kører bilen 100km
        minBil.kør(100);
        System.out.println("Efter at have kørt 100 km: " + minBil);

        //prøver at sætte en chauffør i bilen
        if (minBil.enChaufførSætterSigInd(chauffør1)) {
            System.out.println(chauffør1 + " har sat sig ind i bilen.");
        } else {
            System.out.println("Der sidder allerede en chauffør i bilen.");
        }

        //udskriver hvem der kører bilen
        System.out.println("Chaufføren, der kører bilen hedder " + minBil.hvemKørerBilen());

        //Chaufføren stiger ud
        Chauffør tidligereChauffør = minBil.chaufførenStigerUd();
        if (tidligereChauffør != null){
            System.out.println(tidligereChauffør + " har forladt bilen.");
        } else {
            System.out.println("Ingen chauffør i bilen.");
        }

        //udskriver hvem der kører bilen efter chaufføren er steget ud
        System.out.println("Chaufføren, der kører bilen hedder " + minBil.hvemKørerBilen());


        //Opretter bilobjekter
        Bil bil1 = new Bil("rød", 10, 100);
        Bil bil2 = new Bil("Sort", 200, 200);
        Bil bil3 = new Bil("pink", 196, 300);

        //opretter en garage objekt
        Garage garage1 = new Garage();

        //tilføjer bilobjekterne til garagen
        garage1.tilføjBil(bil1);
        garage1.tilføjBil(bil2);
        garage1.tilføjBil(bil3);

        //Printer prisen for alle de biler der er i garagen ud, vha. metoden beregnPrisForAlleBiler vi lavede i Garage klassen
        System.out.println("Summen for alle bilerne i garagen er " + garage1.beregnPrisForAlleBiler() + " kr.");

    }
}
