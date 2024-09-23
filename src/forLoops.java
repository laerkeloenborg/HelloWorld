public class forLoops {
    public static void main(String[] args) {

        // Opgave 1) Skriv en metode med et for-loop der skriver følgende ud: 2 gange 1 = 2, 2 gange 2 = 4, 2 gange 3 = 6, 2 gange 4 = 8
       for(int i = 1; i<=4; i++){
            int nummer = 2;
            int sum = nummer * i;
            System.out.println(nummer + " gange " + i + " = " + sum);}
        System.out.println();


        // Opgave 2) Skriv en metode med et for-loop der skriver følgende talrækker ud: 2 4 6 8 10 12, 4 19 34 49 64 79, 30 20 10 0 -10 -20, -7 -3 1 5 9 13, 97 94 91 88 85 82
        for (int i = 2; i <= 12; i += 2) { /* variablen sættes til 2, loopet starter med at kører og kører så længe i (2) er lavere eller ligemed 12 herefter stopper den loopet, variablen 2 skal plusses med to for hver gang loopet kører */
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 4; i <= 79; i += 15) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 30; i >= -20; i-=10){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -7; i <= 13; i+=4) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 97; i >= 82; i-=3){
            System.out.print(i + " ");
        }
    }
}

