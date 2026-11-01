package carManagementSystem;

public abstract class Customer{
	private String fullName;
	private String address;
	private String nationalId;
	private String contactNumber;
	Car car;

	public Customer(String fullName, String address, String nationalId, String contactNumber, String make, String model, String plateNumber) {
		this.fullName = fullName;
		this.address = address;
		this.nationalId = nationalId;
		this.contactNumber = contactNumber;
		this.car = new Car(make, model, plateNumber);
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		return address;
	}

	public String getNationalId() {
		return nationalId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public Car getCar() {
		return car;
	}

	public abstract double calculateBill();	
}
