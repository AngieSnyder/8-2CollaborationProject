public class Customer extends Person {

	private String employeeNumber;
	
	public Customer(String first, String last, String number) {
		super();
		employeeNumber = number;
	}

	public String getCustomerNumber() {
		return employeeNumber;
	}
	
	public void setCustomerNumber(String empNum) {
		employeeNumber = empNum;
	}
	
	@Override
	public String toString() {

		return "Name: " + firstName + " " + lastName + 
				"\nCustomer Number: " + employeeNumber + "\n\n";		
	}
}
