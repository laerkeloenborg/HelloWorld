package Firkant;

public class Firkant {
    double height;
    double length;

    public Firkant(double height, double length) {

        this.height = height;
        this.length = length;

    }
    public double beregnAereal(){

        return height * length;


    }

    public String hvilkenSlagsFirkant(){

        if(height == length) {

            return "det er en kvadrat";

        }
        else {

            return "Det er et rektangel";

        }

    }

}
