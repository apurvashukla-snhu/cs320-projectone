package projectOne;
import java.util.*;

public class ContactService {
	public static String contactId;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	
	//creating array
	static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	
	//unique Id code
	public static String generateUniqueId() {
		String uniqueId;
		if (contactList.isEmpty()) {
			contactId = "0000000000";
		}
		//if not empty, get the contact list from highest
		else {
			int arraySize = contactList.size();
			contactId = contactList.get(arraySize - 1).getContactId();
		}
		int temp = Integer.valueOf(contactId);
		temp += 1;
		uniqueId = Integer.toString(temp);
		return uniqueId;
	}
	//creating addContact function
	public static void addContact(String firstName, String lastName, String phoneNumber, String address) {
		String ID = generateUniqueId();
		Contact contact1 = new Contact(ID, firstName, lastName, phoneNumber, address);
		contactList.add(contact1);
	}
	// update methods
	public static void updateFirstName(String uniqueId, String firstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if(uniqueId.compareTo(contactList.get(i).getContactId()) == 0) {
				contactList.get(i).setFirstName(firstName);
			}
		}
	}
	public static void updateLastName(String uniqueId, String lastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if(uniqueId.compareTo(contactList.get(i).getContactId()) == 0) {
				contactList.get(i).setFirstName(lastName);
			}
		}
	}
	public static void updatePhoneNumber(String uniqueId, String phoneNumber) {
		for (int i = 0; i < contactList.size(); i++) {
			if(uniqueId.compareTo(contactList.get(i).getContactId()) == 0) {
				contactList.get(i).setFirstName(phoneNumber);
			}
		}
	}
	public static void updateAddress(String uniqueId, String address) {
		for (int i = 0; i < contactList.size(); i++) {
			if(uniqueId.compareTo(contactList.get(i).getContactId()) == 0) {
				contactList.get(i).setFirstName(address);
			}
		}
	}
//delete contact
	public static void deleteContact(String uniqueId) {
		for (int i = 0; i < contactList.size(); i++) {
			if(uniqueId.compareTo(contactList.get(i).getContactId()) == 0) {
				contactList.remove(i);
			}
		}
	}
}

