package ifelse;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int no=sc.nextInt();
		if(no%2==0) {
			System.out.println(no+" The no is even");
		}
		else
		{
			System.out.println(no+" The no is odd");
		}
		
	}

}
