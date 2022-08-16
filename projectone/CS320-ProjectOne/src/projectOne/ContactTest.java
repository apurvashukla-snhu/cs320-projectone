package projectOne;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	@Test // created for contact creation testing
	void testContactClass() {
		Contact newContact = new Contact ("1963", "Doctor", "Who", "0770090046", "Inside The TARDIS, UK 19630");
		assertTrue(newContact.getFirstName().equals("Doctor"));
		assertTrue(newContact.getLastName().equals("Who"));
		assertTrue(newContact.getContactId().equals("1963"));
		assertTrue(newContact.getPhoneNumber().equals("077090046"));
		assertTrue(newContact.getPhoneNumber().equals("Inside The TARDIS, UK 19630"));
	}
	//test for overtly long id
	@Test
	void testLongId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000000", "Doctor", "Who", "077090046", "123 Address St., UK 89109");
		});
	}
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Smith", "077090046", "123 Address St. UK 89109");
		});
	}
	@Test
	void testContactLongFirst() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "DoctorLongName", "Smith", "077090046", "123 Address St. UK 89109");
		});
	}
	@Test
	void testContactLongLast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "Doctor", "WhoLongName", "077090046", "123 Address St. UK 89109");
		});
	}
	@Test
	void testContactNullLast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "Doctor", null, "077090046", "123 Address St. UK 89109");	
		});		
	}
	@Test
	void testContactLongPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "Doctor", "Who", "077090046123", "123 Address St. UK 89109");
		});
	}
	@Test
	void testContactEmptyPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "Doctor", "Who", null, "123 Address St. UK 89109");
		});
	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "Doctor", "Who", "077090046", null);
		});
	}
	@Test
	void testContactAddressLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90197", "Doctor", "Who", "077090046", "123 Address St. UK 89109 Long Address");
		});
	}
}
