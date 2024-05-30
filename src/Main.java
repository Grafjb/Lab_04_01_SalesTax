//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double purchasePrice = 100.0;
        double salesTaxRate = 0.05;

        double salesTax = purchasePrice * salesTaxRate;

        System.out.println("The purchase price is: $" + purchasePrice);
        System.out.println("The sales tax (5%) on the purchase is: $" + salesTax);
    }
}
