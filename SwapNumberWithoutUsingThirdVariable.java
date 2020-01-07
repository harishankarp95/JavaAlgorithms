package algorithim;

public class SwapNumberWithoutUsingThirdVariable {

public static void main(String[] args) {
		
		int a=4, b=8;
		System.out.println("a:- "+a+" b:- "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:- "+a+" b:- "+b);
	}
}
