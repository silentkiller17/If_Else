package ifelse;

public class tempSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] arr =new int[] { 10,100,50,1,75};
				for (int i=0; i<arr.length; i++)
				{
					for (int j=i +1; j<arr.length; j++)
					{
						int tmp =0;
						if(arr[i]>arr[j])
						{
							tmp =arr [i];
							arr[i]=arr[j];
							arr[j]=tmp;
							
						}
					}
				}
				     System.out.println("Ascending Order");       
				for (int i=0; i<arr.length;i++) {
					System.out.println(arr[i]+" ");
				}
				
				
				//for descending
				for (int i=0; i<arr.length; i++)
				{
					for (int j=i +1; j<arr.length; j++)
					{
						int tmp =0;
						if(arr[i]<arr[j])
						{
							tmp =arr [i];
							arr[i]=arr[j];
							arr[j]=tmp;
							
						}
					}
				}
				     System.out.println("Descending Order");       
				for (int i=0; i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}

			}
		
	}


