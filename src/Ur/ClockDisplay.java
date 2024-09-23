package Ur;

public class ClockDisplay {

    private NumberDisplay hours; //holder styr på timerne 0-23
    private NumberDisplay minutes; //holder styr på minutterne 0-59
    private String displayString; //klokkens visning i formatet hh:mm

    public ClockDisplay() {
        //initialiserer timer (limit 24) og minutter (limit 60)
       hours = new NumberDisplay(24);
       minutes = new NumberDisplay(60);
       updateDisplay(); //opdatere displayString til at vise 00.00 ved start
    }

    public void timeTick () { //hvis minutternes værdi ender på 0 når værdien stiger med 1 så stiger hours ligeledes med 1 og ellers stiger minut værdien bare med 1.
        minutes.increment(); //øger minutter med 1
        if (minutes.getValue()== 0){ //hvis minutter er 0, betyder det at en time er gået
            hours.increment(); //øger timerne med 1 når minutterne når 0
        } else {
            updateDisplay(); //opdatere displayString som repræsentere tiden
        }
    }

    public String getTime(){
        return displayString; //returnerer displayString som repræsentere tiden
    }

    private void updateDisplay(){ //opdatere klokkeslættet, dvs. når et minut eller time er gået opdateres tidspunktet
    displayString = hours.getDisplayValue() + " : " + minutes.getDisplayValue(); //sætter displayString til det aktuelle klokkeslet
    }




}
