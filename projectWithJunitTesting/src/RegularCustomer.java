package carManagementSystem;

public class RegularCustomer  extends Customer {
	
	private final double REGULAR_PRICE = 50;

	public RegularCustomer(String fullName, String address, String nationalId, String contactNumber, String make,
			String model, String plateNumber) {
		super(fullName, address, nationalId, contactNumber, make, model, plateNumber);
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return REGULAR_PRICE;
	}

	
}
