package CRM;

import java.time.LocalDate;
import java.util.List;

public class Sale {
	private String saleId;
    private Contact contact;
    private double amount;
    private int date;
    public Sale(String saleId, Contact contact, double amount, int string, int date) {
    this.saleId = saleId;
    this.contact = contact;
    this.amount = amount;
    this.date = date;
    }
	public Sale(String saleId2, Contact contact1, double amount2, List<Integer> of) {
		}
	public Sale(String saleId2, Contact contact2, double amount2, LocalDate now) {
		}
	public String getSaleId() {
     return saleId;
    }
    public Contact getContact() {
    return contact;
    }
    public double getAmount() {
     return amount;
    }
    public int getDate() {
     return date;
    }
    public String toString() {
    return  "Sale{" + "saleId='" +saleId + '\'' +",contact=" + contact + ",amount=" + amount +", date=" + date + '}';
    }
}
    	


