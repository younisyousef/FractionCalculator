import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String x = null;
		String fraction = userInput.nextLine();
		if (fraction.contains("+")) {
			x = "+";
			
		} 
		else if (fraction.contains("-")) {
			x = "-";
		}
		
		else if (fraction.contains("*")) {
			x = "*";
		}
		 
		else {
			x = "/";
		}
		boolean isNegative1 = false; 
		boolean isNegative2 = false; 
		String operand1 = null;
		String operand2 = null;
		if (x.equals("-")) {
			 operand1 = fraction.substring(0, fraction.indexOf(x, fraction.indexOf(x) + 1) - 1);
			 operand2 = fraction.substring(fraction.indexOf(x, fraction.indexOf(x) + 1) + 2);
		}
		else {
			 operand1 = fraction.substring(0, fraction.indexOf(x) - 1);	
			 operand2 = fraction.substring(fraction.indexOf(x) + 2);
			
		}
		
		if (operand1.contains("-")){
			operand1 = operand1.substring(1);
			isNegative1 = true;
		}
		if (operand2.contains("-")){
			operand2 = operand2.substring(1);
			isNegative2 = true;
		}
		if (!operand1.contains("/")) {
			operand1+="/1";
		}
		
		if (!operand2.contains("/")) {
			operand2+="/1";
		}
		System.out.println(operand1);
		System.out.println(operand2);
		Fraction result = new Fraction(operand1, operand2, isNegative1, isNegative2);
		if (x.equals("+")) {
			System.out.println(result.add());
		}
		if (x.equals("-")) {
			System.out.println(result.subtract());
		}
		
		

	}
	}
