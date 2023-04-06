package ifelse;

public class RversreValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=725;
		int rev=0;
		while(no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("The revrse of no:" + rev);

	}

}
