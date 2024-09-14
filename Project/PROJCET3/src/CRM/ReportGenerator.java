package CRM;

public class ReportGenerator {
	private SalesManger salesManager;
		private ReportGenerator(SalesManager salesManager2) {
		// TODO Auto-generated constructor stub
	}
	public Report generateSalesReport() {
	 return new Report(salesManager.getAllSales(), salesManager.getTotalSalesAmount());
	    }
	 

}


