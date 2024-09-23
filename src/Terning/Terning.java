package Terning;

import java.util.Random;

public class Terning {
    private final int MAX = 6;
    private int faceValue;
    private Random number = new Random();

    public Terning() { //default constructor (pga, ingen parametre)
        faceValue = number.nextInt(MAX) + 1;
    }

    public void roll() {
        faceValue = number.nextInt(MAX) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }



}
