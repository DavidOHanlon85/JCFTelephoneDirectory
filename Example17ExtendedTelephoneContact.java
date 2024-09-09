/**
 * 
 */
package slideDeckChallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Test Driver class for Telephone Class
 */
public class Example17ExtendedTelephoneContact {

	public static void main(String[] args) {
		
		Contact c1 = new Contact("Annie", "Hall", "08292929292", "annie.hall@qub.ac.uk");
		Contact c2 = new Contact("Jim", "Jame", "07272728282", "james.jim@qub.ac.uk");
		Contact c3 = new Contact("Aidan", "McG", "07828282828", "aidan.mcgowan@qub.ac.uk");
		
		Map<String, Contact> contacts = new HashMap<String, Contact>();
		
		contacts.put("annie.hall@qub.ac.uk", c1);
		contacts.put("james.jim@qub.ac.uk", c2);
		contacts.put("aidan.mcgowan@qub.ac.uk", c3);
		
		for (String email : contacts.keySet()) {
			
		Contact c = contacts.get(email);
		System.out.println(c.toString());
			
		}
		
		System.out.println();
		
		String searchEmail = "aidan.mcgowan@qub.ac.uk";
		
		searchForContact(contacts, searchEmail);
		
		System.out.println();
		
		searchForContact(contacts, "davidohanlon85@googlemail.com");
		
		System.out.println();
		
		searchForContact(contacts, "annie.hall@qub.ac.uk");
		
		
		
	}

	/**
	 * This method searches for a contact based on email address and prints full details of the contact to the console
	 * @param contacts
	 * @param searchEmail
	 */
	public static void searchForContact(Map<String, Contact> contacts, String searchEmail) {
		if (contacts.containsKey(searchEmail)) {
			Contact c = contacts.get(searchEmail);
			System.out.println("Searching for " + searchEmail);
			System.out.println();
			System.out.println("First name : " + c.getFirstName());
			System.out.println("Last name  : " + c.getLastName());
			System.out.println("Email      : " + c.getEmail());
			System.out.println("Mobile     : " + c.getMobile());
		} else {
			System.out.println("No contact found for: " +searchEmail);
		}
	}

}
