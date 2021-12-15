package contactService;
import java.util.ArrayList;

public class ContactService {
	// Contains a list of contacts
	private ArrayList <Contact> contacts;
	
	// default constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// this method adds a given contact to our list if is not already present
	public boolean add(Contact contact) {
		// first we determine if contact is already present
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		//if the contact is not present then we add it and return true
		if (!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact added succesfully!");
			return true;
		}
		else {
			System.out.println("Contact already present");
			return false;
		}
	}
	
	//this method removes a contact with given contact ID if present in our list
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getid().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact removed succesfully!");
				return true;
			}
		}
		System.out.println("Contact not present");
		return false;
	}
	
	/*
	 * this method updates the contact of the given contact ID, 
	 * if found, it updates its first name, last name and number address
	 * passes and empty string if certain details are not to be changed
	 */
	public boolean update(String contactID, String firstName, String lastName, String numberAddress) {
		for (Contact c : contacts) {
			if (c.getid().equals(contactID)) {
				if (!firstName.equals(""))
					c.setfirstName(firstName);
				if (!lastName.equals(""))
					c.setlastName(lastName);
				if (!numberAddress.equals(""))
					c.setaddress(numberAddress)	;
				System.out.println("Contact updated succesfully");
				return true;
			}
		}
		System.out.println("Contact not present");
		return false;
	}
}
