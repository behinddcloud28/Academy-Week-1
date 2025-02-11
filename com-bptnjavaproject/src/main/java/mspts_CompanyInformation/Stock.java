package mspts_CompanyInformation;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Stock {
	private String ticker;
	private long timeStamp;
	private double price;
	private double open;
	private double high;
	private double low;
	private double close;
	private double volume;
	
	
	public Stock(String ticker, long timeStamp, double price, double open, double high, double low, double close, double volume) { // constructor with needed parameters 
		this.ticker = ticker; 
		this.timeStamp = timeStamp;
		this.price = price;
		this.open =open;
		this.high = high;
		this.low=low;
		this.close =close;
		this.volume =volume;
		
	}
	// call the string method
	public String toString() {
		return String.format("%s (%s) - Price: $%.2f", ticker, timestamp, price, open, high, low, close, volume);
	}
	
	public String getTicker() {return ticker; }
	public double getPrice() {return price; }
	
	
}
