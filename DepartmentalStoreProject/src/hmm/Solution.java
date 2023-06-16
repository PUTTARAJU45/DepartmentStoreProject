package hmm;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to Maaramma Departmental Store");
		Scanner scan = new Scanner(System.in);
		DepartmentalStore store = new DepartmentalStore();

		store.addProduct();
		int choice = 1;
		while (choice == 1) {
			store.displayProduct();
			store.buyProduct();

			System.out.println("Press 1 to continue Shopping");
			System.out.println("or any other number to checkout ");
			choice = scan.nextInt();
		}
		store.checkout();

	}

}
