public class Employee extends Person {
	
	public String socialSN;
	
	public Employee(String first, String last, String ssn) {
		super();
		socialSN = ssn;
	}
	
	public String getSsn() {
		
		String veil = socialSN.substring(7);
		
		return "xxx-xx-" + veil ;
	}
	 public void setSsn(String ssn) {
		 socialSN = ssn;
	 }
	
	
	 @Override
		public String toString() {
			return super.toString() + "\nSSN: " + getSsn() + "\n\n";				
		}
}