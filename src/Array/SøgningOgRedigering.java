package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SøgningOgRedigering {
    ArrayList<Integer> tabel12 = new ArrayList<Integer>(Arrays.asList(2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5));

    public static void main(String[] args) {
        int[] tabel = {2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5};
        int søgeTal = 5;

        boolean fundet = false;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] == søgeTal) {
                System.out.println("Fundet på position: " + i);
                fundet = true;
            }
        }
        if(!fundet){
            System.out.println("Elementet blev ikke fundet");
        }

    }


}
