package carManagementSystem;

import java.util.ArrayList;

public class ViewScheduledAppointments {

	void viewScheduledAppointment(ArrayList<Appointment> appointments) {
		if (!appointments.isEmpty()) {
			System.out.println("All Scheduled appointments: ");
			for (int i = 0; i < appointments.size(); i++) {
				Appointment appointment = appointments.get(i);
				if (!appointment.isAppointmentCompleted()) {
					System.out.println(appointment.toString());
				}
			}
		} else {
			System.out.println("No more scheduled appointments for today!!!");
		}
	}
}
