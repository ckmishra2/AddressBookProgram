package addressbook;

import java.util.Scanner;

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

	void askDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name ");
		this.firstName = sc.next();
		System.out.println("Enter Last Name ");
		this.lastName = sc.next();
		System.out.println("Entre Date of Birth");
		this.dateOfBirth = sc.nextInt();
		System.out.println("Enter Phone Number ");
		this.phnNumber = sc.nextInt();
		System.out.println("Enter City Name");
		this.city = sc.next();
		System.out.println("Enter State Name ");
		this.state=sc.next();
		System.out.println("Enter Zip");
		this.zip= sc.nextInt();
		System.out.println("Enter email ");
		this.email=sc.next();
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
		PersonDetails P1 = new PersonDetails();
		PersonDetails P2 = new PersonDetails();
		P1.askDetails();
		P1.PrintDetails();
		P2.askDetails();
		P2.PrintDetails();
		

	}
}
