package contactService;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//constructor
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		// id length cannot be longer than 10 characters
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		// first name length cannot be longer than 10 characters
		if (firstName == null || firstName.length() >  10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		// last name length cannot be longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		// phone number has to be exactly 10 digits
		if (phone == null || phone.length() > 10 || phone.length() < 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		// address must be no longer than 30 characters
		if (address == null || address.length() >= 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// Getters
	public String getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphone() {
		return phone;
	}
	public String getaddress() {
		return address;
	}
	
	//setter
	public String setfirstName(String firstName) {
		return firstName;
	}
	public String setlastName(String lastName) {
		return lastName;
	}
	public String setaddress(String address) {
		return address;
	}
}//ending bracket


