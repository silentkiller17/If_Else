package ifelse;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
  for(int i=1;i<=row;i++) {
	  for(int j=1;j<row-i;j++) {
		  System.out.print(" ");
	  }
	  for(int k=1;k<=i;k++)
	  {
		  System.out.print("*");
	  }
		System.out.println();
  }
	  
	}

}
