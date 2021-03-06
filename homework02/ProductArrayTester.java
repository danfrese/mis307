package homework02;

import java.util.Scanner;
import homework01.Product;

/*
 * @author: Dan Frese
 */
public class ProductArrayTester {

	public static void main(String[] args) {

		// Variable declarations
		Scanner in = new Scanner(System.in);
		int prodCount = 0, prodQuantity = 0;
		double prodPrice = 0.00, totalSum = 0.00;
		String prodCode = "", prodDesc = "";

		System.out.print("Please enter the number of products: ");
		prodCount = in.nextInt();
		Product[] cart = new Product[prodCount];// Initialize cart[] array

		for (int i = 0; i < cart.length; i++) {
			in.nextLine();// Clears the Scanner buffer
			System.out.println("Enter product code for product " + (i + 1) + ": ");
			prodCode = in.nextLine();

			System.out.println("Enter description for product " + (i + 1) + ": ");
			prodDesc = in.nextLine();

			System.out.print("Enter quantity for product " + (i + 1) + ": ");
			prodQuantity = in.nextInt();

			System.out.print("Enter price for product " + (i + 1) + ": ");
			prodPrice = in.nextDouble();

			/*
			 * Create a new Product object with populated values and add the new
			 * object to the cart[] array.
			 */
			cart[i] = new Product(prodCode, prodDesc, prodPrice, prodQuantity);

			// Calculate total values
			totalSum += cart[i].getTotalValue();
		}

		in.close();
		System.out.printf("%s%.2f", "Total value of items in cart is: $", totalSum);
	}
}