package assigment3;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter second number");
		int inputsecond=scan.nextInt();
		
		int hours=inputsecond/3600;
		int minute=(inputsecond%3600)/60;
		int second=(inputsecond%3600)%60;
		
		System.out.println(inputsecond+" second= "+hours+" hours "+minute+" minutes "+second+" second");
		
		
		
		
	}

}
