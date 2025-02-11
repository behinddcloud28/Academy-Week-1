package mspts_CompanyInformation;

public class StockData {
	private String date;
	private String ticker;
	private double open;
	private double high;
	private double low;
	private double close;
	private double volume;
	
	public StockData (String date, String ticker, double open, double high, double low, double close, double volume) {
		this.date =date;
		this.ticker =ticker;
		this.open =open;
		this.high =high;
		this.low =low;
		this.close =close;
		
	}
	
	public String toCSVFromat() {
		return String.format("%s,%s,%.2f,%.2f,%.2f,%.2f,%d", date, ticker, open, high, low, close, volume) ;
	}
	
}
