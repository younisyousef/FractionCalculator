
public class Fraction {

	private String denom1;
	private String denom2;
	private String num1;
	private String num2;

	public Fraction(String operand1, String operand2) {
		this.num1 = operand1.substring(0, operand1.indexOf("/"));
		this.denom1 = operand1.substring(operand1.indexOf("/") + 1);
		this.num2 = operand2.substring(0, operand2.indexOf("/"));
		this.denom2 = operand2.substring(operand2.indexOf("/") + 1 );

	}

	public  String add() {
		int combinedDenom = getDenom1() * getDenom2();
		int combinedNum = getNum1() * getDenom2() + getNum2() * getDenom1();
		return combinedNum + "/" + combinedDenom;
	}
	public int getNum1() {
		int num1 = Integer.parseInt(this.num1);
		return num1;
	}
	public int getNum2() {
		int num2 = Integer.parseInt(this.num2);
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
}
