public class Stock{
	private String symbol;
	private double sharePrice;

	public Stock(String sym, double price){
		symbol = sym;
		sharePrice = price;
	}

	public String getSymbol(){
		return symbol;
	}

	public double getSharePrice(){
		return sharePrice;
	}

	public String toString(){
		String str = "Trading symbol: "+symbol+
		"\nShare price: "+sharePrice;

		return str;
	}

	public boolean equals(Stock object2){
		boolean status;

		if(symbol.equals(object2.symbol) && sharePrice==object2.sharePrice){
			status = true;
		}else{
			status = false;
		}
		return status;
	}

	public Stock copy(){
		Stock copyObject = new Stock(symbol, sharePrice);

		return copyObject;
	}

	public Stock(Stock obj){
		this.symbol = obj.symbol;
		this.sharePrice = obj.sharePrice;
	}

}




