package ifelse;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=121;
		int rev=0;
		int n=no;
		while(no>0) {
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("The revrse of no is:" + rev);
		System.out.println(n);
		if(n==rev)
		{
			System.out.println(n +" Palindrome");
			
		}
		else
		{
			System.out.println(n +" is not palindrome ");
		}
	}
}
