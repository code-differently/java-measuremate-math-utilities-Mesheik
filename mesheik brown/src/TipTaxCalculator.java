import MethodsCalculator.Tax;
import MethodsCalculator.TotalBill;
import MethodsCalculator.Tip;
import java.util.Scanner;


public class TipTaxCalculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         TotalBill totalBill = new TotalBill();
         Tax tax = new Tax();
         Tip tip = new Tip();


         System.out.println("Enter Bill Amount ");
         double totalBillMade = scanner.nextDouble();
         System.out.println("Enter Tax rate");
         double tax1 = scanner.nextDouble();
         System.out.println("Enter Tip Amount");
         double tip1 = scanner.nextDouble();

        double output = totalBillMade + tax1 + tip1;
        System.out.println(output);

        scanner.close();



    }




}