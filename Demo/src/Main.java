
public class Main {

	public static void main (String args[]){
		
		int firstNumber = 56;
		int secondNumber = 87;
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + 
		calculator_add(firstNumber, secondNumber));
		
		System.out.println(firstNumber + " * " + secondNumber + " = " + 
				calculator_mul(firstNumber, secondNumber));
	}
	
	public static int calculator_add(int a, int b){
		int result = a+b;
		return result;
	}
	
	public static int calculator_mul(int a, int b){
		int result = a*b;
		return result;
	}
}
