import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        do {
            double subtotal = 0;
            String itemName;
            double price;

            System.out.println("Enter items (first item’s name and then price)");
            System.out.println("Type END 0 to finish items");

            while (true) {
                itemName = input.next();

                if (itemName.equalsIgnoreCase("END")) {
                    price = input.nextDouble();
                    break;
                }

                price = input.nextDouble();
                subtotal += price;
            }
            double discountPercent = 10;
            double discountAmount = subtotal * discountPercent / 100;
            double totalBeforeTax = subtotal - discountAmount;
            double salesTaxPercent = 5;
            double salesTax = totalBeforeTax * salesTaxPercent / 100;
            double invoiceTotal = totalBeforeTax + salesTax;

            // Printing invoice
            System.out.println("\n--------- INVOICE ---------");
            System.out.printf("Subtotal:\t\t$%.2f%n", subtotal);
            System.out.println("Discount percent:\t" + (int) discountPercent);
            System.out.printf("Discount amount:\t$%.2f%n", discountAmount);
            System.out.printf("Total before tax:\t$%.2f%n", totalBeforeTax);
            System.out.println("Sales tax:\t\t" + (int) salesTaxPercent);
            System.out.printf("Invoice total:\t\t$%.2f%n", invoiceTotal);

            System.out.print("\nContinue (y/n): ");
            choice = input.next().charAt(0);

        } while (choice != 'y' && choice != 'Y');

        input.close();
        System.out.println("\nProgram terminated.");
    }
}
