package projectOne;

public class Contact {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	//creating object
	public Contact(String contactId, String firstName,
				   String lastName, String phoneNumber,
				   String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name.");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name.");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		//setting these values if it doesn't error out
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	//getter methods
	public String getContactId() {
		return contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	//setter methods
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		this.address = address;
	}	
}


