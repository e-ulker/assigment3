package assigment3;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name=scan.next();
		
		System.out.println("please enter your birth year");
		int year=scan.nextInt();
	
		int currentyear=2020;
		
		System.out.println("Hello,"+name+"! Based on your input,your age is "+(currentyear-year));
		
	}

}
