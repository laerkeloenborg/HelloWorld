package Ur;

public class NumberDisplay {

    private int limit; //Både limit og value kan kun tilgås i denne Array.klasse (Ur.NumberDisplay)
    private int value;

    public NumberDisplay (int rollOverLimit){ //constructor der har parameteren rollOverLimit.Denne definere hvornår tallet sættes til 0
        limit = rollOverLimit; //definere grænsen for hvornår value skal over til 0
        value = 0; // sætte den initiale værdi af value til 0
    }

    public int getValue() { //Getter metode for at få den aktuelle værdi
        return value; //returnere den aktielle værdi af attibuttens value.
    }

    public String getDisplayValue() { //Dette gør at tallene fremvises som tekst. Værdien for Values tjekkes hvorvidt det er større eller mindre end 10.
        if (value < 10) {
            return "0" + value; //hvis værdien er mindre end 10 viser den værdien som tocifret
        } else {
            return "" + value; //ellers returneres værdien som den er
        }
    }

    public void setValue (int replacementValue) { //setter metode for at sætte en ny værdi //metoden her gør det muligt at sætte attributten Value til en anden værdi. Her tjekkes parameteren replacementValue om det er indenfor 0 og Limit. Hvis den er dette tilskrives Value værdien af replacementVærdi
        if (replacementValue >= 0 && replacementValue <= limit) { //sikrer at værdien er indenfor 0 og limit
            value = replacementValue; //opdatere value med det nye værdi
        }
    }

    public void increment () { //metode til at inkremetere værdien //metoden her gør det muligt for værdien for Value at stige, dog hvis det overstiger Limit så tilskrives Value værdien som det resterende som er tilbage af Limit.
        value = (value +1) % limit; // øger value med 1. hvis den overstiger limit
        }

    }




