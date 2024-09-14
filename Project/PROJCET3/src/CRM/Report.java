package CRM;
import java.util.List;
public class Report {
	private List<Sale> sales;
    private double totalSales;
	public Report(List<Sale> sales, double totalSales) {
    this.sales = sales;
	this.totalSales = totalSales;
		
	}
	 public List<Sale> getSales() {
	 return sales;
	    }
	 public double getTotalSales() {
	 return totalSales;
	    }
	 public String toString() {
	  return "Report{" +"sales=" +sales+", totalSales =" +totalSales+'}';
	 }        

}
