package ifelse;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
char op;
Scanner sc=new Scanner(System.in);
//take two numbers as input from user
System.out.println("Enter Two Numbers");
a=sc.nextInt();
b=sc.nextInt();

//Taking operator as input from user
System.out.println("Enter an operator");
op=sc.next().charAt(0);

switch(op) {
case '+':
	System.out.println(a+"+ "+ b+"=" +(a+b));
	//System.out.format("%d + %d =%\n", a,b,a+b);
	break;
case '-':
	System.out.println(a+"- "+ b+"=" +(a-b));
	break;
case '*':
	System.out.println(a+"* "+ b+"=" +(a*b));
	break;
case '/':
	System.out.println(a+"/ "+ b+"=" +(a/b));
	break;
	default:
		System.out.println("ERROR: Unsupported Operation");
}

}

}
