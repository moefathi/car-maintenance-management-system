package carManagementSystem;

public class RegisterCustomerFactory {

	public Customer factoryCustomer(int category, String fullName, String address, String nationalId,
			String contactNumber, String make, String model, String plateNumber) {

		if (category == 1)
			return new RegularCustomer(fullName, address, nationalId, contactNumber, make, model, plateNumber);

		if (category == 2)
			return new FleetCompanyCustomer(fullName, address, nationalId, contactNumber, make, model, plateNumber);

		if (category == 3)
			return new StaffMembersCustomer(fullName, address, nationalId, contactNumber, make, model, plateNumber);

		return null;
	}
}