import java.util.Scanner;

public class BookOrder {
        public static void main(String[] args) {
        System.out.println("Enter the amount of books:  ");
        Scanner keyboard = new Scanner(System.in);
        int numberOfBooks = keyboard.nextInt();

        System.out.println("Enter the total price: ");
        double priceOfBooks = keyboard.nextFloat();
        
        double tax = 0.085;
        double totalTaxAmount = priceOfBooks * tax;
        System.out.println("Tax amount: " + String.format("%.2f", totalTaxAmount) );

        double shippingChargePerBook = 3.5;
        double totalShippingChargeAmount = numberOfBooks * shippingChargePerBook;
        System.out.println("Shipping amount: " + String.format("%.2f", totalShippingChargeAmount));

        double totalPrice = priceOfBooks + totalTaxAmount + totalShippingChargeAmount;
        
        System.out.println("The total price is: " + String.format("%.2f", totalPrice));
    }
}
