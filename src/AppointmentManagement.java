package carManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManagement implements AppointmentSchedular {

	void printTodayAppointments(ArrayList<Appointment> appointments) {
		if (appointments.size() > 0) {
			for (int i = 0; i < appointments.size(); i++) {
				System.out.println(appointments.get(i).toString());
				System.out.println(
						"----------------------------------------------------------------------------------------------------");
			}
		} else {
			System.out.println("No Appointments For Today!");
		}

	}

	@Override
	public void scheduleAppointment(Customer customer, ArrayList<Appointment> appointments, String appointmentTime) {
		if (appointments.size() < 9) {

			for (int i = 0; i < appointments.size(); i++) {
				Appointment app = appointments.get(i);
				if (app.getAppointmentTime().equals(appointmentTime)) {
					System.out.println("This appointment time is RESERVED!!");
					return;
				}
			}

			for (int i = 0; i < appointments.size(); i++) {
				Appointment app = appointments.get(i);
				if (app.getCustomer().equals(customer)) {
					System.out.println("Customer already scheduled an appointment!!");
					return;
				}
			}

			Appointment newAppointment = new Appointment(customer, appointmentTime);
			appointments.add(newAppointment);

			System.out.println("Appointment Scheduled for " + customer.getFullName() + " at " + appointmentTime
					+ ", his car is " + customer.car.getMake() + customer.car.getModel() + ", and plate number is "
					+ customer.car.getPlateNumber());

		} else {
			System.out.println("There is no available appointments for the day!!");
		}
	}

	@Override
	public void scheduleAppointment(Customer customer, ArrayList<Appointment> appointments) {
		
	}
}
