package mosallem_sales;

import java.util.ArrayList;

public class Customer {
	int customerID;
	String firstName;
	
	public Customer() {
		ArrayList accounts = new ArrayList<>();
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
