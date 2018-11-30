package contact;

public class ContactManager {
	//Fields
	Contact[] myFriends;
	int friendsCount;
	
	//Constructor
	public ContactManager() {
		this.myFriends = new Contact[500];
		this.friendsCount = 0;
	}
	
	//Method
	void addContact(Contact contact) {
		myFriends[friendsCount] = contact;
		friendsCount++;
	}
	
	Contact searchContact(String searchName) {
		for (int i = 0; i <= friendsCount; i++) {
			if(myFriends[i].name.equals(searchName)) {
				return myFriends[i];
			}
		}
		return null;
	}
}
