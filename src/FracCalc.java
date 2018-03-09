import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String x = null;
		String fraction = userInput.nextLine();
		if (fraction.contains("+")) {
			x = "+";
		} else if (fraction.contains("-")) {
			x = "-";
		}
		String operand1;
		String operand2;
		operand1 = fraction.substring(0, fraction.indexOf(x) - 1);
		operand2 = fraction.substring(fraction.indexOf(x) + 2);
		Fraction result = new Fraction(operand1, operand2);
		System.out.println(result.add());

	}
}
