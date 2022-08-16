package projectOne;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	@Test
	void testContactServiceClass() {
		ContactService.addContact("John", "Smith", "077090046", "123 Address St. UK 89109");
		assertTrue(ContactService.contactList.get(0).getContactId().equals("1234567890"));
		assertTrue(ContactService.contactList.get(0).getFirstName().equals("John"));
		assertTrue(ContactService.contactList.get(0).getLastName().equals("Smith"));
		assertTrue(ContactService.contactList.get(0).getPhoneNumber().equals("077090046"));
		assertTrue(ContactService.contactList.get(0).getAddress().equals("123 Address St. UK 89109"));
	}
	@Test
	void testContactDelete() {
		ContactService.addContact("John", "Smith", "077090046", "123 Address St. UK 89109");
		int size = ContactService.contactList.size();
		ContactService.deleteContact("90197");
	}
	@Test
	void testContactUpdateFirst() {
		ContactService.addContact("Master", "Who", "1234567890", "123 Address St. UK 89109");
		int size = ContactService.contactList.size();
		System.out.println(ContactService.contactList.get(size - 1).getContactId());
		System.out.println(ContactService.contactList.get(size - 1).getFirstName());
		ContactService.updateFirstName("90197", "Martha");
		System.out.println(ContactService.contactList.get(size - 1).getFirstName());
		assertTrue(ContactService.contactList.get(size - 1).getFirstName().equals("Martha"));
	}
	@Test
	void testContactUpdateLast() {
		int size = ContactService.contactList.size();
		ContactService.updateLastName("90197", "Jones");
	}
	@Test
	void testContactUpdatePhone() {
		int target = 0;
		ContactService.updatePhoneNumber("90197", "1234567890");
		assertTrue(ContactService.contactList.get(target).getPhoneNumber().equals("1234567890"));
	}	
}