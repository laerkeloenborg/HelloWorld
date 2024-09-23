package StuderendeArray;

public class Studerende {
    //instansvariabler
    private String navn;
    private String mail;

    //konstruktør
    public Studerende(String navn, String mail){
        this.navn = navn;
        this.mail = mail;
    }

    //get metode for navn
    public String getNavn(){
        return navn;
    }

    //set metode for navn
    public void setNavn(String navn){
        this.navn = navn;
    }

//get metode for mail
    public String getMail(){
        return mail;
    }

    //set metode for mail
    public void setMail(String mail){
        this.mail = mail;
    }

    //toString metode
    @Override
    public String toString(){
        return "Studerendes navn: " + navn + ", mailadresse: " + mail;
    }
}
