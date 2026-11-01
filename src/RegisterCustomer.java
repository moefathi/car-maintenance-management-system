package carManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterCustomer {

	void registerNewCustomer(ArrayList<Customer> customers) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer's full name: ");
		String fullName = scanner.nextLine();
		System.out.println("Enter customer's address: ");
		String address = scanner.nextLine();
		
		System.out.println("Enter customer's NationalID: ");
		String nationalId = scanner.nextLine();;
		System.out.println("Enter customer's contact number: ");
		String contactNumber = scanner.nextLine();
		System.out.println("Enter customer's car make: ");
		String make = scanner.nextLine();
		System.out.println("Enter customer's car model: ");
		String model = scanner.nextLine();
		System.out.println("Enter customer's car plate number: ");
		String plateNumber = scanner.nextLine();
		
		System.out.println("Enter customer type by selecting a number: ");
		System.out.println("1. Private car owner");
		System.out.println("2. Fleet company client");
		System.out.println("3. Center staff memeber");
		int customerCategory = scanner.nextInt();
		scanner.nextLine();

		Customer newCustomer;
		RegisterCustomerFactory factory = new RegisterCustomerFactory();
		newCustomer = factory.factoryCustomer(customerCategory, fullName, address, nationalId, contactNumber, make,
					model, plateNumber);
		
		Handler nationalIdCheck = new NationalIdValidate();
		nationalIdCheck.validateNationalId(newCustomer, customers);
		
	}
}
