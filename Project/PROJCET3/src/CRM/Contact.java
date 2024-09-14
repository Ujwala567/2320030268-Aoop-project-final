package CRM;

public class Contact {
	private static final String saleId = null;
	private static final String contact = null;
	private static final String amount = null;
	private static final String date = null;
	private String id;
    private String name;
    private String email;
    private String phoneNumber;
	public Contact(String id, String name, String email, String phoneNumber) {
		 this.id = id;
	     this.name = name;
	     this.email = email;
	     this.phoneNumber = phoneNumber;
		}
	public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    } 
    public String toString() {
return "Contact{" + "id='" +id + '\'' +", name='" + name + '\'' +", email='" + email + '\'' +", phoneNumber='" + phoneNumber + '\'' + '}';
    }
}



