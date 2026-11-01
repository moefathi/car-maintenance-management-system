package carManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BillCalculations {

	void calculateBill(ArrayList<Customer> customers) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter National ID to show the bill: ");
		String nationalId = scanner.nextLine();

		double regularBill = 50;
		Customer customer = null;
		for (int i = 0; i < customers.size(); i++) {
			Customer savedCustomer = customers.get(i);
			if (savedCustomer.getNationalId().equals(nationalId)) {
				customer = savedCustomer;
				break;
			}
		}
		if (customer == null) {
			System.out.println("Customer Not Found");
			return;
		}

		CalculateDiscount bill = new CalculateDiscount();
		System.out.println("Full Bill: " + bill.calculateFullBill(customer));
	}
}
