package CRM;
import java.util.HashMap;
import java.util.Map;
public class ContactManager {
	 private Map<String, Contact> contacts = new HashMap<>();
	 public void addContact(Contact contact) {
	 contacts.put(contact.getId(), contact);
	    }
	 public void removeContact(String id) {
	 contacts.remove(id);
	    }
	 public Contact getContact(String id) {
	 return contacts.get(id);
	    }
	 public Map<String, Contact> getAllContacts() {
	 return contacts;
	    }
			
	}
	
