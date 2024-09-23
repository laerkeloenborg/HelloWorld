import java.util.Arrays;

public class IterateThroughArray {
    public static void main(String[] args) {
        //opgave 1
        double[] decimal = {4.5, 25.3, 12.1, 34.0, 15.5};

        double mindste = decimal[0];
        double største = decimal[0];

        // double kvadratrod = Math.sqrt(4.3);
        // System.out.println(kvadratrod);

        for (int i = 0; i < decimal.length; i++) {
            System.out.print(Math.pow(decimal[i], 2) + " ,");
        }

        System.out.println();

        //opgave 2
        for (int i = 0; i < decimal.length; i++) {
            if (decimal[i] < mindste) {
                mindste = decimal[i];
            }
            if (decimal[i] > største) {
                største = decimal[i];
            }
        }
        System.out.println("Den mindste værdi er " + mindste);
        System.out.println("Den største værdi er " + største);

        System.out.println();

        //opgave 3
        double talViLederEfter = 12.1;
        for (int i = 0; i < decimal.length; i++) {
            if (decimal[i] == talViLederEfter) {
                System.out.println("Hurra! Jeg fandt 12.1. Det stod på index nr. " + i);
            }
        }
    }
}
