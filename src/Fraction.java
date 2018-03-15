import javax.swing.JOptionPane;

public class Fraction {

	private String denom1;
	private String denom2;
	private String num1;
	private String num2;
	private boolean isNegative1;
	private boolean isNegative2;

	public Fraction(String operand1, String operand2, boolean isNegative1, boolean isNegative2) {
		String save = operand1;
		String save2 = operand2;
		if (operand1.contains("_")) {
			operand1 = operand1.substring(operand1.indexOf("_") + 1);
		}
		if (operand2.contains("_")) {
			operand2 = operand2.substring(operand2.indexOf("_") + 1);
		}
		this.num1 = operand1.substring(0, operand1.indexOf("/"));
		this.denom1 = operand1.substring(operand1.indexOf("/") + 1);
		this.num2 = operand2.substring(0, operand2.indexOf("/"));
		this.denom2 = operand2.substring(operand2.indexOf("/") + 1);
		this.isNegative1 = isNegative1;
		this.isNegative2 = isNegative2;
		operand1 = save;
		operand2 = save2;
	}

	public int getNum1() {
		int num1 = Integer.parseInt(this.num1);
		if (isNegative1) {
			num1 *= -1;
		}
		return num1;
	}

	public int getNum2() {
		int num2 = Integer.parseInt(this.num2);
		if (isNegative2) {
			num2 *= -1;
		}
		return num2;
	}

	public int getDenom2() {
		int denom2 = Integer.parseInt(this.denom2);
		return denom2;
	}

	public int getDenom1() {
		int denom1 = Integer.parseInt(this.denom1);
		return denom1;
	}

	public void add() {
		int combinedDenom = getDenom1() * getDenom2();
		int combinedNum = getNum1() * getDenom2() + getNum2() * getDenom1();
		reduce(combinedNum, combinedDenom);
	}

	public void subtract() {
		int combinedDenom = getDenom1() * getDenom2();
		int combinedNum = getNum1() * getDenom2() - getNum2() * getDenom1();
		reduce(combinedNum, combinedDenom);
	}

	public void multiply() {
		int Denom = getDenom1() * getDenom2();
		int Num = getNum1() * getNum2();
		reduce(Num, Denom);
	}

	public void divide() {
		int Num = getNum1() * getDenom2();
		int Denom = getNum2() * getDenom1();
		reduce(Num, Denom);
	}

	public void reduce(int numerator, int denominator) {
		int whole = 0;
		int x = denominator;
		int num = numerator;
		int denom = denominator;
		if (denom == 0) {
			JOptionPane.showMessageDialog(null, "Infinity.");
			return;
		}
		if (num > denom) {
			whole = num / denom;
			if (num % denom == 0) {
				JOptionPane.showMessageDialog(null, whole);
				return;
			} else {
				num -= denom * whole;
			}
		}
		while (x > 0) {
			if (denom % x == 0 && num % x == 0) {
				denom /= x;
				num /= x;
			}

			x--;
		}

		if (whole > 0) {
			JOptionPane.showMessageDialog(null, whole + "_" + num + "/" + denom);
			return;
		}
		if (denom == 1 || num == 0) {
			JOptionPane.showMessageDialog(null, num);
		} else {
			JOptionPane.showMessageDialog(null, num + "/" + denom);
		}
	}
}
