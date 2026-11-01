package carManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Customer> customers = new ArrayList<>();
		ArrayList<Appointment> appointments = new ArrayList<>();

		RegisterCustomer registerCustomer = new RegisterCustomer();
		AppointmentManagement appointment = new AppointmentManagement();
		AppointmentProxy proxyAppt = new AppointmentProxy();
		AddDiagnosticReport diagnosticReport = new AddDiagnosticReport();
		AddServiceReport serviceReport = new AddServiceReport();
		GenerateDailyCarReport dailyCarReport = new GenerateDailyCarReport();
		ViewScheduledAppointments scheduledAppt = new ViewScheduledAppointments();
		BillCalculations bill = new BillCalculations();

		while (true) {
			System.out.println("Select Your Role: ");
			System.out.println("1. Front Desk");
			System.out.println("2. Mechanic");
			System.out.println("3. Technichian");
			System.out.println("4. Quit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				while (true) {
					System.out.println("Front Desk - Select a choice");
					System.out.println("1. Register new customer");
					System.out.println("2. Schedule appointment");
					System.out.println("3. Calculate customer's Bill based on National ID");
					System.out.println("4. Print today appointments");
					System.out.println("5. Back");

					int choiceFunctionality = scanner.nextInt();
					scanner.nextLine();

					if (choiceFunctionality == 1) {
						registerCustomer.registerNewCustomer(customers);
					} else if (choiceFunctionality == 2) {
						proxyAppt.scheduleAppointment(customers.get(customers.size() - 1), appointments);
					} else if (choiceFunctionality == 3) {
						bill.calculateBill(customers);
					} else if (choiceFunctionality == 4) {
						appointment.printTodayAppointments(appointments);
					} else if (choiceFunctionality == 5) {
						break;
					} else {
						System.out.println("Invalid Choice");

					}
				}
			} else if (choice == 2) {
				while (true) {
					System.out.println("Mechanic - Select a choice");
					System.out.println("1. View Scheduled Appointments");
					System.out.println("2. Add Service Report");
					System.out.println("3. Back");

					int choiceFunctionality = scanner.nextInt();
					scanner.nextLine();

					if (choiceFunctionality == 1) {
						scheduledAppt.viewScheduledAppointment(appointments);
					} else if (choiceFunctionality == 2) {
						serviceReport.addServiceReport(appointments);
					} else if (choiceFunctionality == 3) {
						break;
					} else {
						System.out.println("Invalid Choice");

					}
				}
			} else if (choice == 3) {
				while (true) {
					System.out.println("Technichian - Select a choice");
					System.out.println("1. Add diagnostic report");
					System.out.println("2. Generate report for serviced cars");
					System.out.println("3. Back");

					int choiceFunctionality = scanner.nextInt();
					scanner.nextLine();

					if (choiceFunctionality == 1) {
						diagnosticReport.addDiagnosticResults(appointments);
					} else if (choiceFunctionality == 2) {
						dailyCarReport.generateCarReport(appointments);
					} else if (choiceFunctionality == 3) {
						break;
					} else {
						System.out.println("Invalid Choice");

					}
				}
			} else if (choice == 4) {
				System.out.println("Exit");
				return;
			} else {
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

}
