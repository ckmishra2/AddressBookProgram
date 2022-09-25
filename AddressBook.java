package addressbook;

class PersonDetails {
	String firstName, lastName, city, state, email;
	int dateOfBirth, phnNumber, zip;

	// creating a Contacts in Address Book with first and last names, address,city,
	// state, zip, phone number and email...
	PersonDetails(String first, String Last, int dob, int phnnum, String yourcity, String yourState, int pincode,
			String emal) {
		this.firstName = first;
		this.lastName = Last;
		this.dateOfBirth = dob;
		this.phnNumber = phnnum;
		this.city = yourcity;
		this.state = yourState;
		this.zip = pincode;
		this.email = emal;
	}

	public PersonDetails() {
	}

	void PrintDetails() {
		System.out.println("Printing Details:");
		System.out.println("First Name is: " + this.firstName);
		System.out.println("Last Name is: " + this.lastName);
		System.out.println("Date of birth is: " + this.dateOfBirth);
		System.out.println("Phone number is: " + this.phnNumber);
		System.out.println("City name is: " + this.city);
		System.out.println("Enter State Name " + this.state);
		System.out.println("State Name is: " + this.city);
		System.out.println("Zip is: " + this.zip);
		System.out.println("email is " + this.email);
	}
}

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		PersonDetails P = new PersonDetails();
		P.PrintDetails();

	}
}
