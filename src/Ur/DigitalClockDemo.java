package Ur;

public class DigitalClockDemo {
    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay(); //opretter uret
        for (int i = 0; i < 61; i++){
            clock.timeTick(); //øger tiden med 1
            System.out.println("Klokken er: " + clock.getTime());
        }

    }
}
