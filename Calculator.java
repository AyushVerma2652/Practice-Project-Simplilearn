import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter two numbers to be calculated");
		
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		
		operations obj =new operations();
		
		
		System.out.println("Enter operator");
		char ch = sc.next().charAt(0);
		
		
		
		switch(ch) {
		case '+':
			System.out.println("Addition of two numbers:"+obj.add(first, second));
			break;
		case '-':
			System.out.println("Subtraction of two numbers:"+obj.subtract(first, second));
			break;
		case '*':
			System.out.println("Multiplication of two numbers:"+obj.multiply(first, second));
			break;
		case '/':
			System.out.println("Division of two numbers:"+obj.division(first, second));
			break;
			default:
				System.out.println("Operator entered is not correct");
				return;
		}
		
		

	}

}
