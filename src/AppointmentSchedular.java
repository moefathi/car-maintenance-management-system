package carManagementSystem;

import java.util.ArrayList;

public interface AppointmentSchedular {

	void scheduleAppointment(Customer customer, ArrayList<Appointment> appointments, String appointmentTime);

	void scheduleAppointment(Customer customer, ArrayList<Appointment> appointments); 

}
