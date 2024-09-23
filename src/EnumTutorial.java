import Dage.DaysOfTheWeek;

public class EnumTutorial {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.FREDAG;

        if (day == DaysOfTheWeek.FREDAG){
            System.out.println("Yay, det weekend!");
        }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            System.out.println(myDay);
        }


    }
}
