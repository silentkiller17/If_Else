package ifelse;

import java.util.Arrays;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int [][] no= new int[2][2];
		no[0][0]=15;
		no[0][1]=23;
		no[1][0]=30;
		no[1][1]=45;
		System.out.println("No[0][0]="+no[0][0]);
		System.out.println("No[0][0]="+no[0][1]);
		System.out.println("No[0][0]="+no[1][0]);
		System.out.println("No[0][0]="+no[1][1]);
		System.out.println("Printing two D array using Arrays.deepToString() method: ");
		System.out.println(Arrays.deepToString(no));
	}

}
