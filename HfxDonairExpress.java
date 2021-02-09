import java.util.Scanner;

/**
 * This program is used by HfxDonairExpress to take their online orders. Their menu is as follows
 *
 * Donair:
 *      small - $5
 *      med   - $6
 *      large - $7
 *
 * Pizza:
 *      small - $8
 *      med   - $9
 *      large - $10
 *
 *      Toppings:
 *          pepperoni - $1.00
 *          jalapeno  - $0.99
 *          mushroom  - $0.75
 */
public class HfxDonairExpress {

      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type;
        int size;
        Double price = 0.00;

        System.out.println("Welcome to HfxDonairExpress! What would you like (0 for Donair, 1 for Pizza)?");

        // Get the type of food
        type = in.nextInt();

        System.out.println("You have selected " + (type == 0 ? "Donair" : "Pizza") + ".");
        System.out.println("Please enter a size (0 for small, 1 for med, 2 for large)");

        // Get the size
        size = in.nextInt();
        in.nextLine();

        // Process depending on the type
        switch (type) {
            case 0: // Donair
                if (size == 0) {
                    price = 5.00;
                } else if (size == 1) {
                    price = 6.00;
                } else {
                    price = 7.00;
                }

            case 1: // Pizza
                if (size == 0) {
                    price = 8.00;
                } else if (size == 1) {
                    price = 9.00;
                } else {
                    price = 10.00;
                }

                break;

            default:
                System.out.println("Invalid food choice");
        }

        // Show the final price
        System.out.println("Your order comes to $" + String.format("%.2f", price));

    }
}
