package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarConvert(double dollarPrice, double dollarBuying) {
		double taxa = dollarBuying * IOF;
		return (dollarBuying + taxa) * dollarPrice;
	}

}
