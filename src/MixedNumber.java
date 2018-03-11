
public class MixedNumber extends Fraction{
private String whole1;
private String whole2;
	public MixedNumber(String operand1, String operand2, boolean isNegative1, boolean isNegative2) {
		super(operand1, operand2, isNegative1, isNegative1);
		this.whole1 = operand1.substring(0, operand1.indexOf("_"));
		this.whole2 = operand2.substring(0, operand2.indexOf("_"));
	}
public int getNum1() {
	int whole1 = Integer.parseInt(this.whole1);
	if (super.getNum1()<0) {
		return super.getNum1() + (whole1*-1)*super.getDenom1();
	}
	return super.getNum1() + whole1* super.getDenom1();
}

public int getNum2() {
	int whole2 = Integer.parseInt(this.whole2);
	if (super.getNum2()<0) {
		return super.getNum2() + (whole2*-1)*super.getDenom2();
	}
	return super.getNum2() + whole2* super.getDenom2();
}

	

}
