package assigment3;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sorudan anlad���m 1$ a tamamlamak.yani 100 cent(� understood that question expectation is copleting 100cent(1$).)
		
		
		/*
		 
		 nicel 5
		 dime 10
		 quarter 25
		 
		 */
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your money");
		int money=scan.nextInt();
		
		int a=100-money;
		int cent=a/25;
		int dime=(a%25)/10;
		int nickel=(a%25)%10;
		
		System.out.println("cent "+cent);
		System.out.println("dime "+dime);
		System.out.println("nickel "+nickel);
		
			
	}

}
