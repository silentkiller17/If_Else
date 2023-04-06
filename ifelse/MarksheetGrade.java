package ifelse;

import java.util.Scanner;

public class MarksheetGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		float grade=s.nextFloat();
		if (grade>8 && grade<9)
		{
			System.out.println("Excellent");
		}
		else if(grade>7 && grade<8)
		{
			System.out.println("Distinction");
		}
		else if(grade>6 && grade<7)
		{
			System.out.println("First class");
		}
		else 
		{
			System.out.println("Fail");
		}

	}

}
