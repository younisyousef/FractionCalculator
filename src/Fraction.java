
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
			operand1  = operand1.substring(operand1.indexOf("_") + 1);
		}
		if (operand2.contains("_")) {
			operand2  = operand2.substring(operand2.indexOf("_") + 1);
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

	public String add() {
		int combinedDenom = getDenom1() * getDenom2();
		int combinedNum = getNum1() * getDenom2() + getNum2() * getDenom1();
		return combinedNum + "/" + combinedDenom;
	}

	public String subtract() {
		int combinedDenom = getDenom1() * getDenom2();
		int combinedNum = getNum1() * getDenom2() - getNum2() * getDenom1();
		return combinedNum + "/" + combinedDenom;
	}

	public String multiply() {
		int Denom = getDenom1() * getDenom2();
		int Num = getNum1() * getNum2();
		return Num + "/" + Denom;
	}

	public String divide() {
		int Num = getNum1() * getDenom2();
		int Denom = getNum2() * getDenom1();
		return Num + "/" + Denom;
	}
}
