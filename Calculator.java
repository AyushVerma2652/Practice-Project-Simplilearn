import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter two numbers to be calculated");
		
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		
		
		System.out.println("Enter operator");
		char ch = sc.next().charAt(0);
		
		double result;
		
		switch(ch) {
		case '+':
			result = first+second;
			System.out.println(result);
			break;
		case '-':
			result = first-second;
			System.out.println(result);
			break;
		case '*':
			result = first*second;
			System.out.println(result);
			break;
		case '/':
			result = first/second;
			System.out.println(result);
			break;
			default:
				System.out.println("Operator entered is not correct");
				return;
		}
		
		

	}

}
