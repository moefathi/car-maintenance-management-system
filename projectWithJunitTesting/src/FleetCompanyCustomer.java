package carManagementSystem;

public class FleetCompanyCustomer extends Customer {
	
	final double REGULAR_PRICE = 50;
	final double DISCOUNT_RATE_FLEET = 50 * 0.3;

	public FleetCompanyCustomer(String fullName, String address, String nationalId, String contactNumber, String make,
			String model, String plateNumber) {
		super(fullName, address, nationalId, contactNumber, make, model, plateNumber);
	}
	
	@Override
	public double calculateBill(){
		return REGULAR_PRICE - DISCOUNT_RATE_FLEET;
	}
}
