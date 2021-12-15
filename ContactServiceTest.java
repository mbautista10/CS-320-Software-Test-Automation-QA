package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	// Tests the add contact method and if a contact already exists
	@Test
	void testAddContact() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("123456789", "Thomas", "Jefferson", "6507895487", "Shadwell, Virginia");
		Contact c2 = new Contact("234567891", "Tom", "Brady", "3477896598", "Tampa Bay, Florida");
		Contact c3 = new Contact("345678910", "Christiano", "Ronaldo", "5517893254", "Funchal, Portuga");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2)); 
		assertEquals(true, cs.add(c3));
		
		// the contact already exists, the assertEquals true again the test fails
		assertEquals(false, cs.add(c1)); 
	}
	
	
	// Tests the delete method by ID and if the contact does not exists
	@Test
	void testDeleteMethod() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("123456789", "Thomas", "Jefferson", "6507895487", "Shadwell, Virginia");
		Contact c2 = new Contact("234567891", "Tom", "Brady", "3477896598", "Tampa Bay, Florida");
		Contact c3 = new Contact("345678910", "Christiano", "Ronaldo", "5517893254", "Funchal, Portugal");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		// assertions delete contact by  id
		assertEquals(true, cs.remove("123456789"));
		assertEquals(true, cs.remove("345678910"));
		
		// assertion will pass because the contact is not present
		assertEquals(false, cs.remove("789456"));
	}
	
	// tests the update method by first name, last name and address
	@Test
	void testUpdateMethod() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("123456789", "Thomas", "Jefferson", "6507895487", "Shadwell, Virginia");
		Contact c2 = new Contact("234567891", "Tom", "Brady", "3477896598", "Tampa Bay, Florida");
		Contact c3 = new Contact("345678910", "Christiano", "Ronaldo", "5517893254", "Funchal, Portugal");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		// updates the contact even if the first name or last name or address is ""
		assertEquals(true, cs.update("123456789", "Jimmy", "Smith", ""));
		assertEquals(true, cs.update("123456789", "", "", ""));
		
		// will not update contact but the test will pass
		assertEquals(false, cs.update("789548", "Mauricio", "Bautista", ""));
		assertEquals(false, cs.update("789548", "", "", ""));
	}
	

}
