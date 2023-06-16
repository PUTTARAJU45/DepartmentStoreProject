package hmm;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {
	Scanner scan = new Scanner(System.in);
	LinkedHashMap<Integer, Product> map = new LinkedHashMap<Integer, Product>();
	int TotalBill = 0;

	void addProduct() {
		map.put(1, new Product("Chocolates", 20, 10));
		map.put(2, new Product("Goodday", 40, 5));
		map.put(3, new Product("IceCream", 50, 20));
		map.put(4, new Product("Water", 50, 10));

	}

	void displayProduct() {
		Set<Integer> keys = map.keySet();
		for (int key : keys) {
			Product p = map.get(key);
			System.out.println("Enter " + key + " to order " + p.getName());
			System.out.println("Available quantity : " + p.getQuantity());
			System.out.println("Product cost  Rs: " + p.getCost());
			System.out.println();

		}

	}

	void buyProduct() {
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		Product p = map.get(choice);
		if (p != null) {
			System.out.println("Enter Quantity");
			int quantity=scan.nextInt();
			
			if(quantity<=p.getQuantity()) {
				Double productCost=quantity * p.getCost();
				
				TotalBill+=productCost;
				
				p.setQuantity(p.getQuantity()-quantity);
				
				System.out.println("Ordered "+quantity+" "+p.getName());
				System.out.println("Product Cost : "+productCost);
				System.out.println("Total Bill "+TotalBill);
				
				
				
			}
			else {
				try {
					throw new InvalidChoiceException("Invalid Quantity");
				} catch (InvalidChoiceException e) {
					System.out.println(e.getMessage());

				}
				
			}
		
		
		
		} else {
			try {
				throw new InvalidChoiceException("Invalid choice");
			} catch (InvalidChoiceException e) {
				System.out.println(e.getMessage());

			}
		}

	}

	void checkout() {
		System.out.println("Total Bill: Rs. " + TotalBill);
		System.out.println("Thank you for Shopping");

	}

}
