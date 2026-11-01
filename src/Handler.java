package carManagementSystem;

import java.util.ArrayList;

public interface Handler {

	void setNextHandler(Handler handler);
	void validateNationalId(Customer customer, ArrayList<Customer> customers);
}
