package carManagementSystem;

import java.util.ArrayList;

public class NationalIdValidate implements Handler{
	
	private Handler handler;
	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void validateNationalId(Customer customer, ArrayList<Customer> customers) {
		for(int i = 0; i < customers.size(); i++) {
			Customer oldCustomer = customers.get(i);
			if(oldCustomer.getNationalId().equals(customer.getNationalId())) {
				System.out.println("National ID alredy exists, Try again!!!");
				return;
			}
		}
		if(handler != null) {
			handler.validateNationalId(customer, customers);
		}else {
			customers.add(customer);
			System.out.println("A new registerd customer: " + customer.getFullName());
		}
	}

}
