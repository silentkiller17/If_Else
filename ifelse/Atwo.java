package ifelse;

import java.util.Scanner;

public class Atwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter row length of an array: ");
        int row=sc.nextInt();
        
        System.out.println("Enter column length of an array: ");
        int column=sc.nextInt();
        
        int a[][]=new int[row][column];
        int colunm;
		System.out.println("enter "+row*column+" elements to store in arrays:\n");
        
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		a[i][j]=sc.nextInt();
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println(" ");
        }
	}

}
