package CRM;
import java.util.ArrayList;
import java.util.List;
public class SalesManger {
	    private List<Sale> sales = new ArrayList<>();
	    public void addSale(Sale sale) {
	    sales.add(sale);
	    }
	    public List<Sale> getSalesByContactId(String contactId) {
	    List<Sale> result = new ArrayList<>();
	    for (Sale sale : sales) {
	    if (sale.getContact().getId().equals(contactId)) {
	                result.add(sale);
  }
    }
	    return result;
	    }
	    public List<Sale> getAllSales() {
	    return sales;
	    }
	    public double getTotalSalesAmount() {
	    return sales.stream().mapToDouble(Sale::getAmount).sum();
	    }
}



