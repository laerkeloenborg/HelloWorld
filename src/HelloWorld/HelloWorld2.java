package HelloWorld;

public class HelloWorld2 {
    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
        //System.out.println("Your total meal price is " + result);


    }

    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(100, .2, .08);
        System.out.println("Your total meal price is " + groupTotalMealCost);

        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println("It will be " + individualTotalMealCost + " per person.");

        //calculateTotalMealPrice(listedPrice:15, tipRate: .2, taxRate: .8);
    }
}
