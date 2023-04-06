package ifelse;
import java.util.*;

public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb= new StringBuilder();

System.out.println("String capacity = "+ sb.capacity());

StringBuilder sbm= new StringBuilder();
System.out.println("String capacity = "+ sbm.capacity());

//StringBuilder - insert ->returns string
 System.out.println("Insert :"+sbm.insert(0,"Hello"));
 
//StringBuilder - delete ->returns string
 System.out.println("Delete :"+sbm.delete(6,11));
 
//StringBuilder - append ->returns string
 System.out.println("Append :"+sbm.insert(0,"World"));
}

	private String delete(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private String insert(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] capacity() {
		// TODO Auto-generated method stub
		return null;
	}
}
