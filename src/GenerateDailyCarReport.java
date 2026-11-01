package carManagementSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateDailyCarReport {
	void generateCarReport(ArrayList<Appointment> appointments) {
		if (appointments.size() == 0) {
			System.out.println("No appointments for today.");
			return;
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("dailyReport.txt"));
			writer.write("Daily Report For Each Serviced Cars:\n");
			writer.write("--------------------------------------------------------------\n");

			for (int i = 0; i < appointments.size(); i++) {
				Appointment appointment = appointments.get(i);
				if (appointment.isAppointmentCompleted()) {
					writer.write("Customer National ID: " + appointment.getCustomer().getNationalId() + "\n");
					writer.write("Car Plate Number: " + appointment.getCustomer().getCar().getPlateNumber() + "\n");
					if(appointment.getServiceReport() != null) {
					writer.write("Repairs Performed: " + appointment.getServiceReport().getRepairsPerformed() + "\n");
					writer.write("Parts Used: " + appointment.getServiceReport().getPartsUsed() + "\n");
					}else {
						writer.write("Service Report Is Empty");
					}
					if(appointment.getDiagnosticResult() != null) {
					writer.write("Issues Found: " + appointment.getDiagnosticResult().getIssuesFound() + "\n");
					writer.write("Recommended Actions: " + appointment.getDiagnosticResult().getRecommendedActions() + "\n");
					}else {
						writer.write("Diagnostic Report Is Empty");
					}
					writer.write("Appointment Time: " + appointment.getAppointmentTime() + "\n");
					writer.write("--------------------------------------------------------------\n");

				}
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
