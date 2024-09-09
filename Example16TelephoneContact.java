package slideDeckChallenges;

import java.util.HashMap;
import java.util.Map;

public class Example16TelephoneContact {

	public static void main(String[] args) {

		Map<String, String> contacts = new HashMap<String, String>();
		
		contacts.put("Annie", "0772222222222");
		contacts.put("Aidan", "077888888888");
		contacts.put("Una", "07773939393");
		
		System.out.println("Number for Annie : " + contacts.get("Annie"));
		
		for (String contact : contacts.keySet()) {
			System.out.println("Number for " + contact + " : " + contacts.get(contact));
		}
	}

}
