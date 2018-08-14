/*import javax.swing.jOptionPane;*/

import java.util.Scanner;

public class ReturnObject{
	public static void main(String[] args){
		BankAccount account;
		
		// Get a reference to a BankAccount object.
		account = getAccount();

		/*JOptionPane.showMessageDialog(null,
	"The account has a balance of $" + account.getBalance());*/
		System.out.println("The account has a balance of $" 
			+ account.getBalance());
		System.exit(0);
	}

	public static BankAccount getAccount(){
		//String input;
		String str;
		double balance;

		/*input = JOptionPane.showInputDialog("Enter " +
"the account balance.");*/
		System.out.println("Enter " +
"the account balance.");
		Scanner input = new Scanner(System.in);
		str = input.nextLine();

		balance = Double.parseDouble(str);

		return new BankAccount(balance);
		
	}
}