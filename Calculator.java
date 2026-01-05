import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Choose an operation:");
		System.out.println("+ for Addition");
		System.out.println("- for Subtraction");
		System.out.println("* for Multiplication");
		System.out.println("/ for Division");
		System.out.println("s Square Root");
		System.out.println("^ Power");
		System.out.println("n Sin");
		System.out.println("c Cosine");
		System.out.println("t Tangent");
		
		char operator = scanner.next().charAt(0);
		double result;
		
		switch (operator) {
		case '+':
		result = num1 + num2;
		System.out.println("Result: " + result);
		break;
		
		case '-':
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
			
		case '*':
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
			
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result " + result);
			} else {
				System.out.println("Error");
			}
			break;
			
		case '^': result = Math.pow(num1, num2); 
			System.out.println("Result: " + result);
			break; 
			
		case 's':
			System.out.println("Enter number: ");
			double x = scanner.nextDouble();
			System.out.println("Result: " + Math.sqrt(x));
			break;
		
		 case 'n':
             System.out.print("Enter angle in degrees: ");
             double angle = scanner.nextDouble();
             System.out.println("Result: " + Math.sin(Math.toRadians(angle)));
             break;
        
		 case 'c':
             System.out.print("Enter angle in degrees: ");
             angle = scanner.nextDouble();
             System.out.println("Result: " + Math.cos(Math.toRadians(angle)));
             break;
             
		 case 't':
             System.out.print("Enter angle in degrees: ");
             angle = scanner.nextDouble();
             System.out.println("Result: " + Math.tan(Math.toRadians(angle)));
             break;
             
         default:
			System.out.println("Invalid operation");
				
		}
	scanner.close();
	}
}