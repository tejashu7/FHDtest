package contact;

public class main {
	
	public static void main(String[] args) {
		
		//Create a Contact Manager
		ContactManager myContactsManager = new ContactManager();
		
		//Create new contact (Object)
		Contact Chang = new Contact();
		
		//Set new contact info
		Chang.name = "Chang";
		Chang.email = "Duongthuytrang216@gmail.com";
		Chang.phoneNumber = "036 267 0890";
		
		//Create more contact
		Contact A = new Contact();
		A.name = "1";
		A.email = "1";
		A.phoneNumber ="1";
		
		Contact B = new Contact();
		B.name = "1";
		B.email = "1";
		B.phoneNumber ="1";
		
		//Add contacts using method addContact from class ContactManager
		myContactsManager.addContact(Chang);
		myContactsManager.addContact(A);
		myContactsManager.addContact(B);
		
		myContactsManager.searchContact(Contact.Chang);
	}
	
}
