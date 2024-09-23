import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
        final double CM_ENHED = 2.54; //erklærer variablen CM_ENHED for final så værdien ikke ændres
        Scanner input = new Scanner(System.in); //opretter scanneren
        System.out.print("Her kan du beregne enheden tommer til cm. Skriv hvor mange tommer du vil have omregnet:"); //hvis man fjern ln i println så kommer det input brugeren skriver til at stå på samme linje  //prompt til brugeren så de ved hvad de kan skrive/bruge siden på
        double tommer = input.nextDouble(); //her skriver brugeren deres input, i dette tilfælde det antal tommer de vil havde omregnet
        double centimeter = CM_ENHED*tommer; // bedst at lave denne variabel i stedet for at lave en string concatenation da der kan opstå fejl i den
        System.out.println(tommer + " tommer svarer til " + centimeter + " cm." );//her kommer outputtet hvor det input brugeren har skrevet omregnes til cm.

       // System.out.println(tommer + " tommer svarer til " + (CM_ENHED * tommer) + " cm.");

        // der kan ligeledes oprettes en double variabel der hedder double centimeter = CM_ENHED*tommer, som man kan sætte ind i outputtet i stedet for CM_ENHED*tommer

    }
}
