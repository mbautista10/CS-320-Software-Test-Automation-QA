package contactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact Contact = new Contact("1234567890", "Mauricio", "Bautista", "2017894561", "Cliffside Park, New Jersey");
		assertTrue(Contact.getid().equals("1234567890"));
		assertTrue(Contact.getfirstName().equals("Mauricio"));
		assertTrue(Contact.getlastName().equals("Bautista"));
		assertTrue(Contact.getphone().equals("2017894561"));
		assertTrue(Contact.getaddress().equals("Cliffside Park, New Jersey"));
	}
	
	/* 
	 * The Test will fail if the id is 10 or less characters 
	 * The test will pass if the ID is more than characters 
	 */
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345678909", "Mauricio", "Bautista", "2017894561", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * The test will pass if the ID is not null
	 * The test will fail if the ID is 10 or less characters
	 * The test will pass if the ID is null
	 */
	@Test 
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "Mauricio", "Bautista", "2017894561", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * The test will fail if the last name is not null
	 * The test will fail if the last name is 10 or less characters
	 * The test will pass if the last name is more than 10 characters
	 * The test will pass if the first name is null
	 */
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Bautista", "2017894561", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * The test will fail if the first name is 10 or less characters
	 * The test will pass if the last name is more than 10 characters
	 */
	@Test
	void testContactFirstNameIsToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "MauricioBAU", "Bautista", "2017894561", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * The test will fail if the last name is not null 
	 * The test will fail if the last name is 10 or less characters
	 * The test will pass if the last name is more than 10 characters
	 * The test will pass if the last name is null
	 */
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", null, "2017894561", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * The test will fail if the last name is less or 10 characters
	 * The test will pass if the last name is more than ten characters
	 */
	@Test
	void testContactLastNameIsToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", "BautistaRam", "2017894561", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * 
	 * The test will fail if the phone is exactly 10 digits
	 * The test will pass if the phone is less or more than ten characters
	 * The test will fail if the phone is not null
	 * The test will pass if the phone is null
	 */
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", "Bautista", null, "Cliffside Park, New Jersey");
		});
	}
	/*
	 * The test will fail if the phone is exactly ten digits
	 * The test will pass if the phone is more or less than ten digits
	 */
	@Test
	void testContactPhoneisExactlyTenDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", "Bautista", "201789456", "Cliffside Park, New Jersey");
		});
	}
	
	@Test
	void testContactPhoneisLessThanTenDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", "Bautista", "20178945600", "Cliffside Park, New Jersey");
		});
	}
	
	/*
	 * The test will fail if the address is not null
	 * The test will fail if the address is less than 30 characters
	 * The test will pass if the address is more than or 30 characters
	 * The test will pass if the address is null
	 */
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", "Bautista", "2017894561", null);
		});
	}
	
	/*
	 * The test will fail if the last name is less than 30 characters
	 * The test will pass if the address is more than or 30 characters
	 */
	@Test
	void testContactAddressIsToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Mauricio", "Bautista", "2017894561", "Cliffside Park, New Jerseywert");
		});
	}

}
