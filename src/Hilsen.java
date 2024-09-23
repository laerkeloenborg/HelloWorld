public class Hilsen {

    //OPGAVE 1:
    /*public static String hej(String navn){
        return "Hej " + navn + "!";
        //System.out.println("Hej " + navn + "!");

    }

    public static void main(String[] args) {
       // String person1 = "Lærke";
       // hej(person1);

        //hej("Morten");
        // hej("Lonny");

        System.out.println(hej("Lærke"));
        System.out.println(hej("Jørgen"));
        System.out.println(hej("Lonny"));
    }

    */

    //OPGAVE 2:
    public void hej(String navn) {
        // return "Hej " + navn + "!";
        System.out.println("Hej " + navn + "!");
    }

    public static void main(String[] args) {
        Hilsen person = new Hilsen();
        String navnPåPerson = "Lærke";

        person.hej(navnPåPerson);

    }

}
