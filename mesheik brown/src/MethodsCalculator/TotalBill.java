package MethodsCalculator;

public class TotalBill {

    public static double calculateTotalBill(double billAmount, double taxPercent) {

        double tax = billAmount * (taxPercent / 100);
        double totalBill = billAmount + tax;
        return totalBill;

    }
}
