public class Instructor{
	private String lastName;
	private String firstName;
	private String officeNumber;

	public Instructor(String lname, String fname, String office){
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}

	public Instructor(Instructor obj){
		lastName = obj.lastName;
		firstName = obj.firstName;
		officeNumber = obj.officeNumber;
	}

	public void set(String lname, String fname, String office){
		lastName = lname; 
		firstName = fname; 
		officeNumber = office;
	}

	public String toString() {
	// Create a string representing the object. 
		String str = "Last Name: " + lastName +
		"\nFirst Name: " + firstName + 
		"\nOffice Number: " + officeNumber;
	// Return the string.
	return str; 
	}

}