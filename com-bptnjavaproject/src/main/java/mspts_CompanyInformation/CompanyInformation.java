package mspts_CompanyInformation;


public class CompanyInformation {

	private String CompanyName;
	private String Ticker;
	private double StockPrice;
	private long CompanyProfileSummary;
	private long Exchange;
	
	public CompanyInformation(String CompanyName, String Tic) {
		this.CompanyName=CompanyName;
		this.Ticker =Ticker;
	}
	
	public String getCompanyName() { // get the name of the company 
		return CompanyName;
	}
	
	public String Ticker() { // get the ticker that company uses 
		return Ticker;
	}
	
	public void getExchange() { // get the exchange the company is using to trade
		
	}
	
	public void getStockPrice() { // get stock price of the company 
		
	}
	
	public void getCompanyProfileSummary() {
		
	}

}
