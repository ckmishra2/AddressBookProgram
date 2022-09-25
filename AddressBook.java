package addressbook;

import java.util.LinkedList;
import java.util.Scanner;



class PersonDetails{
String firstName, lastName,city, state,email;
int dateOfBirth, phnNumber,zip;
//creating a Contacts in Address Book with first and last names, address,city, state, zip, phone number and email...
PersonDetails(String first, String Last, int dob, int phnnum,String yourcity, String yourState,int pincode,String emal){
	this.firstName=first;
	this.lastName=Last;
	this.dateOfBirth=dob;
	this.phnNumber=phnnum;
	this.city=yourcity;
	this.state=yourState;
	this.zip=pincode;
	this.email=emal;
}
public PersonDetails() {
}
void PrintDetails() {
	System.out.println("Printing Details:");
	System.out.println("First Name is: "+this.firstName);
	System.out.println("Last Name is: "+this.lastName);
	System.out.println("Date of birth is: "+this.dateOfBirth);
	System.out.println("Phone number is: "+this.phnNumber);
	System.out.println("City name is: "+ this.city);
	System.out.println("Enter State Name "+this.state);
	System.out.println("State Name is: "+this.city);
	System.out.println("Zip is: "+ this.zip);
	System.out.println("email is "+this.email);
}

void AskDetails() {
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

}
public class AddressBook{
LinkedList<PersonDetails> LLPA;
int sizeOfAB;
String name;


void fillDetails()
{
	Scanner sc = new Scanner(System.in);		
	System.out.println("Enter the number of addresses to be stored in "+this.name);
	int num = sc.nextInt();
	this.sizeOfAB = num;
	this.LLPA = new LinkedList<PersonDetails>();

	for(int i=0; i<num; i++)
	{
		PersonDetails p = new PersonDetails();
		p.AskDetails();
		LLPA.add(p);
	}
}
void deleteAddress()
{
	Scanner sc = new Scanner(System.in);		
	System.out.println("Enter the first name of Person to be removed");
	boolean bFound = false;
	while(!bFound)
	{
		String readName = sc.next();
		for(int i=0; i<this.LLPA.size(); i++)
		{
			if(this.LLPA.get(i).firstName.equals(readName))
			{
				bFound = true;
				LLPA.remove(i);
				break;
			}
		}
	}
}
void printDetails()
{
	System.out.println(this.name+" address book has "+this.LLPA.size()+" addresses");
	for(int i=0; i<this.LLPA.size(); i++)
	{
		this.LLPA.get(i).PrintDetails();
	}	
}

public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program");
	LinkedList<AddressBook> LLAB = new LinkedList<AddressBook>();
	
	System.out.println("Enter number of Address books to be created");
	Scanner sc = new Scanner(System.in);
	int numAB = sc.nextInt();
	int i=0;
	while(i<numAB)
	{
		String readName = null;
		Boolean isUnique = false;
		while(!isUnique)
		{
			System.out.println("Enter name of Address book");
			readName = sc.next();
			isUnique = true;
			for(int j=0; j<LLAB.size(); j++)
			{
				if(LLAB.get(j).name.equals(readName))
				{
					isUnique = false;
					System.out.println(readName+" Address book exists. Enter unique name");
				}
				else if(j== LLAB.size()-1)
					break;
					
			}
		}
		AddressBook AB = new AddressBook();
		AB.name = readName;
		AB.fillDetails();
		AB.printDetails();
		LLAB.add(AB);
		i++;
	}
	
	boolean bFound = false;
	while(!bFound)
	{
		System.out.println("Enter the name of Address book to be modified");
		String AddBookToBeMod = sc.next();
		for(int k=0; k<LLAB.size();k++)
		{
			if(LLAB.get(k).name.equals(AddBookToBeMod))
			{
				bFound = true;
				LLAB.get(k).deleteAddress();
				break;
			}
		}
	}
	for(int k=0; k<LLAB.size();k++)
	{
		System.out.println("Address book========"+LLAB.get(k).name);
		LLAB.get(k).printDetails();
	}

}
}
