import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


public class CalcGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInvestmentAmount.setBounds(55, 35, 122, 32);
		frame.getContentPane().add(lblInvestmentAmount);
		
		textField = new JTextField();
		textField.setBounds(241, 42, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYears.setBounds(55, 78, 57, 25);
		frame.getContentPane().add(lblYears);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 81, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnnualInterestRate.setBounds(55, 114, 122, 32);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 121, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFutureValue.setBounds(55, 199, 86, 20);
		frame.getContentPane().add(lblFutureValue);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(238, 157, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}
	
	String investment = textField.getText();
	String years = textField_1.getText();
	String interestRate = textField_2.getText();
}
