package Cirkel;

public class Cirkel {
    double radius;

    public Cirkel (double radius){
        this.radius = radius;
    }

    public double arealBeregner(){
        return Math.PI * (radius*radius);
    }
}
