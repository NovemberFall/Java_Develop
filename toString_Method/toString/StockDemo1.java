public class StockDemo1{
	public static void main(String[] args){

		Stock xyzCompany = new Stock("XYZ", 9.62);

		System.out.println("Display the description of this company first time: ");
		System.out.println(xyzCompany);

		System.out.println("Display the description of this company second time: ");
		System.out.println(xyzCompany.toString());

		System.out.println("Display the description of this company third time: ");
		System.out.println("The stock data is: " + xyzCompany);
	}
}