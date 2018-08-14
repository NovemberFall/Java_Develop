public class testCopyConstructors{
	public static void main(String[] args){
		Stock company1 = new Stock("XYZ", 9.62);

		Stock company2 = new Stock(company1) ;

		System.out.println("Company 1:\n" + company1);
		System.out.println();
		System.out.println("Company 2:\n" + company2);

		if(company1 == company2){
		System.out.println("The company1 and company2 " +
			"variables reference the same object.");
		}else{
			System.out.println("The company1 and company2 " + 
				"variables reference different objects.");
		}
	}
}