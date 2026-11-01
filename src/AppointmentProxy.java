package carManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentProxy implements AppointmentSchedular {

	private AppointmentManagement appointmentManager = new AppointmentManagement();

	@Override
	public void scheduleAppointment(Customer customer, ArrayList<Appointment> appointments) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Appointment Time (9:00 AM - 5:00 PM)");
		String appointmentTime = scanner.nextLine();

		boolean flag = false;
		if (appointmentTime.equalsIgnoreCase("9:00 AM") || appointmentTime.equalsIgnoreCase("10:00 AM")
				|| appointmentTime.equalsIgnoreCase("11:00 AM") || appointmentTime.equalsIgnoreCase("12:00 PM")
				|| appointmentTime.equalsIgnoreCase("1:00 PM") || appointmentTime.equalsIgnoreCase("2:00 PM")
				|| appointmentTime.equalsIgnoreCase("3:00 PM") || appointmentTime.equalsIgnoreCase("4:00 PM")
				|| appointmentTime.equalsIgnoreCase("5:00 PM")) {
			flag = true;
		} else {
			System.out.println("Pleas enter a valid appointment time!");
		}

			if (flag) {
				appointmentManager.scheduleAppointment(customer, appointments, appointmentTime);
			}

		}

	@Override
	public void scheduleAppointment(Customer customer, ArrayList<Appointment> appointments, String appointmentTime) {
		
	}
}
