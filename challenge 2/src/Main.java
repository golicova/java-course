public class Main {
    public static double salaryCalculator(double hoursPerWeek, double moneyPerHour, double vacationDays) {
        // edge cases
        if (hoursPerWeek < 0) {
            System.out.println("Invalid input");
        }
        if (moneyPerHour < 0) {
            System.out.println("Invalid input");
        }

        double unpaidTime = vacationDays * moneyPerHour * 8;

        // about 52 weeks in a year
        double grossYearlySalary = moneyPerHour * hoursPerWeek * 52 - unpaidTime;
        return grossYearlySalary;
    }

    public static void main (String[] args) {
        double salary = salaryCalculator(40,15, 8);
        System.out.println(salary);
    }
}
