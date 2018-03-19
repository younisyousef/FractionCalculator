import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class FracCalc extends JFrame implements WindowListener, ActionListener {
	private static int y = 0;
	private static int z = 0;
	private boolean x = false;
	Button enter;
	Button b0;
	Button b1; 
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9; 
	Button plus;
	Button minus;
	Button multiply;
	Button divide;
	Button fractionBar;
	Button underscore;
	Button clear;
	JTextField text = new JTextField();
	
	

	public FracCalc() {
		super("Calculator");
		setLayout(new FlowLayout());
		addWindowListener(this);
		enter = new Button("Enter");
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		plus = new Button("+");
		divide = new Button("÷");
		multiply = new Button("x");
		minus = new Button("-");
		fractionBar = new Button("/");
		underscore = new  Button("_");
		clear = new Button("AC");
		Font font = text.getFont().deriveFont(Font.BOLD, 30f);
		text.setFont(font);
		text.setEditable(false);
		text.setPreferredSize(new Dimension(220,50));
		add(text);
		Button[] btn = {clear, fractionBar, underscore, b0, b1, plus, b2,b3, minus, b4,b5, divide, b6,b7, multiply, b8,b9,enter};
		for(Button btns : btn) {
			btns.setPreferredSize(new Dimension(66,40));
			add(btns);
			btns.addActionListener(this);
			
		}
	
	}

	public String getText() {
		return text.getText();
	}

	public void setText(String x) {
		text.setText(x);
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowClosing(WindowEvent arg0) {
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == enter) {
		
		y = 0;
		if (z==0) {
			text.setText("");
			
		}
		else{
			this.x = true;
			z=0;
		}
		
		}
		if (e.getSource() == b1) {
			text.setText(text.getText() + "1");
			}
		if (e.getSource() == b2) {
			text.setText(text.getText() + "2");
			}
		if (e.getSource() == b3) {
			text.setText(text.getText() + "3");
			}
		if (e.getSource() == b4) {
			text.setText(text.getText() + "4");
			}
		if (e.getSource() == b5) {
			text.setText(text.getText() + "5");
			}
		if (e.getSource() == b6) {
			text.setText(text.getText() + "6");
			}
		if (e.getSource() == b7) {
			text.setText(text.getText() + "7");
			}
		if (e.getSource() == b8) {
			text.setText(text.getText() + "8");
			}
		if (e.getSource() == b9) {
			text.setText(text.getText() + "9");
			}
		if (e.getSource() == b0) {
			text.setText(text.getText() + "0");
			}
		
		
		if (y==0) {
			
		if (e.getSource() == divide ) {
			text.setText(text.getText() + " ÷ ");
			y++;
			z++;
			}
		if (e.getSource() == minus ) {
			text.setText(text.getText() + " - ");
			y++;
			z++;
			}
		if (e.getSource() == multiply ) {
			text.setText(text.getText() + " * ");
			y++;
			z++;
			}
		if (e.getSource() == plus ) {
			text.setText(text.getText() + " + ");
			y++;
			z++;
			}
	
		}
		if (e.getSource() == fractionBar ) {
			text.setText(text.getText() + "/");
			
			
			}
		if (e.getSource() == underscore ) {
			text.setText(text.getText() + "_");
			
			
			}
		
		if (e.getSource() == clear) {
			text.setText("");
			}
}

	public boolean getTrue() {
		return this.x;
	}

	public void setTrue() {
		
		this.x = false;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FracCalc window = new FracCalc();
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setSize(280, 400);
		window.setVisible(true);
		while (true) {
		while (!window.getTrue()) {
			Thread.sleep(0);
		}
			
		
		
			if (window.getTrue()) {

				String fraction = window.getText();
				String operand1 = null;
				String x = null;
				String operand2 = null;
				try {
				operand1 = fraction.substring(0, fraction.indexOf(" "));
				 x = fraction.substring(fraction.indexOf(" ") + 1, fraction.indexOf(" ") + 2);
				 operand2 = fraction.substring(fraction.indexOf(" ") + 3);
				}
				catch (Exception e) {
					System.out.println("Error");
					
				}
				
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
				try {
				if (x.equals("+")) {
					frac.add();
				}
				if (x.equals("-")) {
					frac.subtract();
				}
				if (x.equals("*")) {
					frac.multiply();
				}
				if (x.equals("÷")) {
					frac.divide();
				}
				}
				catch (Exception e){
					System.out.println("Error");
					
				}
				window.setText(frac.getAnswer());
				window.setTrue();
			}
		}
	}
}
