package Array;

public class klasse {
    public static void main(String[] args) {
        //opgave 1, for loop m. int array
        int[] elementer = {34, 0, 0, 0, 0, 0, 0, 0, 117};
       // elementer [0]= 34;
       // elementer [8] = 117;

        elementer[3] = 53;
        elementer[5] = 77;

        for (int i = 0; i < elementer.length; i++) {
            System.out.print(elementer[i] + " ,");
        }

        System.out.println();

        // opgave 2, for-each loop m. string array
        String[] ord = {"Hej", "med", "dig"};
        for (String item : ord) {
            System.out.print(item + " ");
        }

        System.out.println();

        //opgave 3, array længde + double array
        Double[] decimal = {3.4, 2.5, 1.2, 6.7};
        System.out.println("På index 2 står der: " + decimal[2]);
        System.out.println("Længden på array: " + decimal.length);
    }
}
