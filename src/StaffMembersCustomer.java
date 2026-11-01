package carManagementSystem;

public class StaffMembersCustomer extends Customer {
	
	private final double REGULAR_PRICE = 50;
	private final double DISCOUNT_RATE_STAFF = 50 * 0.5;

	public StaffMembersCustomer(String fullName, String address, String nationalId, String contactNumber, String make,
			String model, String plateNumber) {
		super(fullName, address, nationalId, contactNumber, make, model, plateNumber);
	}

	@Override
	public double calculateBill() {
		return REGULAR_PRICE - DISCOUNT_RATE_STAFF;
	}
}
