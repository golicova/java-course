public class Main {
    public static double calculateTotalPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalPrice(100,0.2,0.08);
        System.out.println(groupTotalMealPrice);

        double individualTotalMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualTotalMealPrice);

        // built in function
        double result = Math.pow(2,5);
        System.out.println(result);
    }
}