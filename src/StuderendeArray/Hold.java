package StuderendeArray;

import java.util.ArrayList;

public class Hold {
    //Private ArrayList til at gemme studerende
    private ArrayList<Studerende> studerendeList;
    private String søgenavn = "Lærke";


    //Konstruktor der initialisere ArrayListen
    public Hold() {
        studerendeList = new ArrayList<>();
    }

    //get metode til at få ArrayListen

    public ArrayList<Studerende> getStuderendeList() {
        return studerendeList;
    }

    //Metode til at tilføje en studerende til listen
    public void tilføjStuderende(Studerende studerende) {
        studerendeList.add(studerende);
    }

    //toString metode til at udskrive de studerende pænt
    @Override
    public String toString() {
        String studerendePåHold = "Navne på de studerende der går i klassen:\n";
        for (Studerende studerende : studerendeList) {
            studerendePåHold = studerendePåHold + studerende.toString() + "\n";
        }
        return studerendePåHold;
    }

    //metode til at søge efter en studerende
    public Studerende søgningAfStuderende(String søgenavn) {

        for (Studerende studerende : studerendeList) {
            if (studerende.getNavn().equalsIgnoreCase(søgenavn)) {
                return studerende;
            }
        }
        return null;
    }
}
