import javax.swing.JOptionPane;

public class FracCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fraction = JOptionPane.showInputDialog("Enter your operation.");
		String operand1 = fraction.substring(0, fraction.indexOf(" "));
		String x = fraction.substring(fraction.indexOf(" ") + 1, fraction.indexOf(" ") + 2);
		String operand2 = fraction.substring(fraction.indexOf(" ") + 3);
		boolean isNegative1 = false;
		boolean isNegative2 = false;
		if (operand1.contains("-")) {
			operand1 = operand1.substring(1);
			isNegative1 = true;
		}
		if (operand2.contains("-")) {
			operand2 = operand2.substring(1);
			isNegative2 = true;
		}
		if (!operand1.contains("/")) {
			operand1 += "/1";
		}

		if (!operand2.contains("/")) {
			operand2 += "/1";
		}
		Fraction frac = new Fraction(operand1, operand2, isNegative1, isNegative2);
		if (operand1.contains("_") || operand2.contains("_")) {

			if (!operand1.contains("_")) {
				operand1 = "0_" + operand1;
			}
			if (!operand2.contains("_")) {
				operand2 = "0_" + operand2;
			}
			frac = new MixedNumber(operand1, operand2, isNegative1, isNegative2);
		}
		String answer = null;
		if (x.equals("+")) {
			answer = frac.add();
		}
		System.out.println(answer);

	}
}
