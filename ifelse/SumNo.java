package ifelse;

public class SumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,sum=0;
		int m=1256778;
		while(m>0) {
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("Sum of Digits:"+sum);
       
      }
	}


