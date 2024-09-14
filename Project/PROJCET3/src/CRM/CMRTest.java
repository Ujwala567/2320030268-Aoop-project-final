package CRM;

import java.util.List;

public class CMRTest {

	private static final List<Sale> LocalDate = null;

	public static void main(String[] args) {
		 ContactManager contactManager = new ContactManager();
	        SalesManager salesManager = new SalesManager();
	        ReportGenerator reportGenerator = new ReportGenerator(salesManager);
	        Contact contact1 = new Contact("1","gayathri","gayathri@example.com","1234567890");
	        Contact contact2 = new Contact("2","pranathi","pranathi@example.com","0987654321");
	        contactManager.addContact(contact1);
	        contactManager.addContact(contact2);
	        Sale sale1 = new Sale("1", contact1, 150.0, LocalDate.of(2024, 8, 1));
	        Sale sale2 = new Sale("2", contact1, 250.0, LocalDate.of(2024, 8, 2));
	        Sale sale3 = new Sale("3", contact2, 300.0, LocalDate.of(2024, 8, 3));
	        salesManager.addSale(sale1);
	        salesManager.addSale(sale2);
	        salesManager.addSale(sale3);
	        Report report = reportGenerator.generateSalesReport();
	        System.out.println("Sales Report:");
	        System.out.println("Total Sales: $" + report.getTotalSales());
	        report.getSales().forEach(System.out::println);
	        System.out.println("\nAll Contacts:");
	        contactManager.getAllContacts().values().forEach(System.out::println);
    }
	}

