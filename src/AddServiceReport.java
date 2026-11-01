package carManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddServiceReport {

	void addServiceReport(ArrayList<Appointment> appointments) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter appointment time that you want to add service report for: ");
		String appointmentTime = scanner.nextLine();

		Appointment appointment = null;

		if (appointmentTime.equals("9:00 AM") || appointmentTime.equals("10:00 AM")
				|| appointmentTime.equals("11:00 AM") || appointmentTime.equals("12:00 PM")
				|| appointmentTime.equals("1:00 PM") || appointmentTime.equals("2:00 PM")
				|| appointmentTime.equals("3:00 PM") || appointmentTime.equals("4:00 PM")
				|| appointmentTime.equals("5:00 PM")) {
			for (int i = 0; i < 9; i++) {
				Appointment app = appointments.get(i);
				if (app.getAppointmentTime().equals(appointmentTime)) {
					if (app.isAppointmentCompleted()) {
						System.out.println("Appointment is already completed!");
						return;
					}
					appointment = app;
					break;
				}
			}
		} else {
			System.out.println("Please enter a valid appointment time!");

		}

		if (appointment == null) {
			System.out.println("Did not find an appointment at: " + appointmentTime);
			return;
		}

		System.out.println("Enter repairs performed: ");
		String repairsPerformed = scanner.nextLine();

		System.out.println("Enter parts used: ");
		String partsUsed = scanner.nextLine();

		ServiceReport serviceReport = new ServiceReport(repairsPerformed, partsUsed);

		appointment.setServiceReport(serviceReport);
		System.out.println("Service report successfully added");
	}
}
