//import javax.swing.JOptionPane;

import java.util.Scanner;
public class MetricDemo{
	public static void main(String[] args){
		/*String input;*/
		double miles;
		double kilos;

/*		input = JOptionPane.showInputDialog("Enter " +
"a distance in miles.");*/
		System.out.println("Enter " +"a distance in miles.");
		Scanner input = new Scanner(System.in);
		miles = input.nextDouble();
		kilos = Metric.milesToKilometers(miles);

		System.out.printf("%.2f miles equals %.2f kilometers.\n",
			miles,kilos);

	/*	input = JOptionPane.showInputDialog("Enter " +
"a distance in kilometers: ");*/
		System.out.println("Enter " +
"a distance in kilometers: ");
		kilos = input.nextDouble();
		miles = Metric.kilometersToMiles(kilos);
		System.out.printf("%.2f kilometers equals %.2f miles.",
			kilos,miles);
		input.close();
		System.exit(0);

	}
}