package carManagementSystem;

public class Appointment {
	private Customer customer;
	private String appointmentTime;
	private boolean appointmentCompleted;
	private ServiceReport serviceReport;
	private DiagnosticResult diagnosticResult;

	public Appointment(Customer customer, String appointmentTime) {
		this.customer = customer;
		this.appointmentTime = appointmentTime;
		this.appointmentCompleted = false;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	
	public boolean isAppointmentCompleted() {
		return appointmentCompleted;
	}

	public void setAppointmentCompleted() {
		this.appointmentCompleted = true;
	}
	
	public ServiceReport getServiceReport() {
		return serviceReport;
	}

	public DiagnosticResult getDiagnosticResult() {
		return diagnosticResult;
	}

	public void setServiceReport(ServiceReport serviceReport) {
		this.serviceReport = serviceReport;
	}

	public void setDiagnosticResult(DiagnosticResult diagnosticResult) {
		this.diagnosticResult = diagnosticResult;
	}

	@Override
	public String toString() {
		return "Customer Name: " + customer.getFullName() + "\n" + "Customer address: " + customer.getAddress() + "\n"
				+ "Customer National ID: " + customer.getNationalId() + "\n" + "Customer Contact Number: "
				+ customer.getContactNumber() + "\n" + "for car " + customer.car.getMake() + ", Model "
				+ customer.car.getModel() + ", plate " + customer.car.getPlateNumber() + "\n" + "Appointment time: "
				+ appointmentTime + "\n" + "Is Appointment Completed? " + appointmentCompleted + "\n" + 
				"----------------------------------------------------------------------------------------------";
	}

}
