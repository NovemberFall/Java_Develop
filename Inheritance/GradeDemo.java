import javax.swing.JOptionPane;
import java.util.Scanner;

public class GradeDemo{
	public static void main(String[] args){
		//String input;
		double testScore;

		GradeActivity grade = new GradeActivity();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " +"a numeric test score.");
		testScore = input.nextDouble();

		grade.setScore(testScore);

		System.out.println("The grade for that test is "+
			grade.getGrade());

		System.exit(0);

	}
}

