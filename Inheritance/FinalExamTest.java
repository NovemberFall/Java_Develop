import java.util.Scanner;
public class FinalExamTest{
	public static void main(String[] args){
		String str;
		int questions;
		int missed;

		System.out.println("How many " +
"questions are on the final exam?");
		Scanner input = new Scanner(System.in);
		str = input.nextLine();
		questions = Integer.parseInt(str);

		System.out.println("How many " +
"questions did the student miss?");
		str = input.nextLine();
		missed = Integer.parseInt(str);

		FinalExam exam = new FinalExam(questions, missed);

		System.out.println("Each question counts " + exam.getPointsEach() + 
			" points.\nThe exam score is " +
			exam.getScore() + "\nThe exam grade is " + 
			exam.getGrade());

		System.exit(0);
	}
}