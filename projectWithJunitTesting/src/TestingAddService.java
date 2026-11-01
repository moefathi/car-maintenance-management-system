package carManagementSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingAddService {
	
	ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<Appointment> appointments = new ArrayList<>();
	
	@Test
	void testAddServiceReportA() {
		Customer customer = new RegularCustomer("Moe", "Amman", "200", "0799", "Ford", "2010", "20-94680");
		customers.add(customer);
		Appointment appointment = new Appointment(customer, "9:00 AM");
		appointments.add(appointment);
		AddServiceReport add = new AddServiceReport();
		String result = add.addServiceReport(appointments, "9:00 AM");
		assertEquals("Service report successfully added" , result);
	}
	
	@Test
	void testAddServiceReportB() {
		Customer customer = new RegularCustomer("motasem", "Amman", "201", "0799434", "Toyota", "2013", "20-5435");
		customers.add(customer);
		Appointment appointment = new Appointment(customer, "9:00 AM");
		appointments.add(appointment);
		AddServiceReport add = new AddServiceReport();
		String result = add.addServiceReport(appointments, "8:00 PM");
		assertEquals("Please enter a valid appointment time!" , result);
	}
	
	@Test
	void testAddServiceReportC() {
		Customer customer = new RegularCustomer("Laith", "Amman", "202", "07967", "Chevrolet", "2010", "20-5354");
		customers.add(customer);
		Appointment appointment = new Appointment(customer, "11:00 AM");
		appointments.add(appointment);
		AddServiceReport add = new AddServiceReport();
		String result = add.addServiceReport(appointments, "3:00 PM");
		assertEquals("Did not find an appointment at: " + "3:00 PM" , result);
	}
	
	@Test
	void testAddDiagnosticReportA() {
		Customer customer = new RegularCustomer("Salem", "Amman", "203", "079559", "Ford", "2013", "20-6756");
		customers.add(customer);
		Appointment appointment = new Appointment(customer, "9:00 AM");
		appointments.add(appointment);
		AddDiagnosticReport add = new AddDiagnosticReport();
		String result = add.addDiagnosticResults(appointments, "9:00 AM");
		assertEquals("Diagnostic report successfully added" , result);
	}
	
	@Test
	void testAddDiagnosticReportB() {
		Customer customer = new RegularCustomer("Ayman", "Amman", "204", "079910", "Toyota", "2012", "20-94680");
		customers.add(customer);
		Appointment appointment = new Appointment(customer, "9:00 AM");
		appointments.add(appointment);
		AddDiagnosticReport add = new AddDiagnosticReport();
		String result = add.addDiagnosticResults(appointments, "7:00 PM");
		assertEquals("Please enter a valid appointment time!" , result);
	}
	
	@Test
	void testAddDiagnosticReportC() {
		Customer customer = new RegularCustomer("Rashed", "Amman", "205", "079910", "Ford", "2005", "20-4566");
		customers.add(customer);
		Appointment appointment = new Appointment(customer, "9:00 AM");
		appointments.add(appointment);
		AddDiagnosticReport add = new AddDiagnosticReport();
		String result = add.addDiagnosticResults(appointments, "8:00 AM");
		assertEquals("Please enter a valid appointment time!" , result);
	}
	
	@Test
	void testcalculateBillA() {
		Customer customer = new RegularCustomer("Mahmoud", "Amman", "206", "0793449", "Mercedess", "2012", "20-24434");
		customers.add(customer);
		BillCalculations b = new BillCalculations();
		String result = b.calculateBill(customers, "200");
		assertEquals("Full Bill: " + 50.0, result);
	}
	
	@Test
	void testCalculateBillB() {
		Customer customer = new RegularCustomer("Mohammad", "Amman", "207", "07998221", "BMW", "2018", "20-65466");
		customers.add(customer);
		BillCalculations b = new BillCalculations();
		String result = b.calculateBill(customers, "100");
		assertEquals("Customer Not Found", result);
	}
	
	@Test
	void testCalculateBillC() {
		Customer customer = new FleetCompanyCustomer("Hamad", "Amman", "230", "0778999", "Kia", "2019", "20-6546");
		customers.add(customer);
		BillCalculations b = new BillCalculations();
		String result = b.calculateBill(customers, "230");
		assertEquals("Full Bill: " + 35.0, result);
	}
	
	@Test
	void testCalculateBillD() {
		Customer customerThree = new StaffMembersCustomer("Ayham", "Amman", "240", "079765", "Huynday", "2009", "20-5453");
		customers.add(customerThree);
		BillCalculations b = new BillCalculations();
		String result = b.calculateBill(customers, "250");
		assertEquals("Full Bill: " + 25.0, result);
	}
	
}
