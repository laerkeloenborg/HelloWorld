package Bowling;

public class Person {

    String fornavn;
    String efternavn;
    double skostørrelse;

    public Person(String fornavn, String efternavn, double skostørrelse) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.skostørrelse = skostørrelse;
    }

    public void udskrivPerson (){
        System.out.println("Navn: " + efternavn + ", " + fornavn + ". Skostørrelse: " + skostørrelse);
    }
}
