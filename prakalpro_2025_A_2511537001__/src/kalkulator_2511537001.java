package pekan9_2511537001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator_2511537001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnPlus_2511537001;
	private JButton btnSub_2511537001;
	private JButton btnMul_2511537001;
	private JButton btnDivide_2511537001;
	private JButton btnPercent_2511537001;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_2511537001 frame = new kalkulator_2511537001();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public kalkulator_2511537001() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 249, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) 
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					textField.setText(backspace);
					
				}
			}
			
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(0, 83, 65, 55);
		contentPane.add(btnBackspace);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(0, 138, 65, 55);
		contentPane.add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(0, 193, 65, 55);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(0, 250, 65, 55);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(0, 303, 65, 55);
		contentPane.add(btn0);
		
		btnClear = new JButton("C\r\n");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(65, 83, 65, 55);
		contentPane.add(btnClear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(65, 138, 65, 55);
		contentPane.add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(65, 193, 65, 55);
		contentPane.add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(65, 250, 65, 55);
		contentPane.add(btn2);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(65, 303, 65, 55);
		contentPane.add(btnDot);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(130, 83, 65, 55);
		contentPane.add(btn00);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 138, 65, 55);
		contentPane.add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 193, 65, 55);
		contentPane.add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 250, 65, 55);
		contentPane.add(btn3);
		
		btnEqual = new JButton("=\r\n");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String anwer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
				     result=first+second;
				     answer=String.format("%.2f", result);
				     textField.setText(answer);
				}
				else if(operation=="-") 
				{
				     result=first-second;
				     answer=String.format("%.2f", result);
				     textField.setText(answer);
				}
				else if(operation=="*") 
				{
				     result=first*second;
				     answer=String.format("%.2f", result);
				     textField.setText(answer);
				}
				else if(operation=="/") 
				{
				     result=first/second;
				     answer=String.format("%.2f", result);
				     textField.setText(answer);
				}
				if(operation=="%") 
				{
				     result=first%second;
				     answer=String.format("%.2f", result);
				     textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(130, 303, 65, 55);
		contentPane.add(btnEqual);
		
		btnPlus_2511537001 = new JButton("+");
		btnPlus_2511537001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus_2511537001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus_2511537001.setBounds(195, 83, 65, 55);
		contentPane.add(btnPlus_2511537001);
		
		btnSub_2511537001 = new JButton("-");
		btnSub_2511537001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub_2511537001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub_2511537001.setBounds(195, 138, 65, 55);
		contentPane.add(btnSub_2511537001);
		
		btnMul_2511537001 = new JButton("*");
		btnMul_2511537001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul_2511537001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul_2511537001.setBounds(195, 193, 65, 55);
		contentPane.add(btnMul_2511537001);
		
		btnDivide_2511537001 = new JButton("/\r\n");
		btnDivide_2511537001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide_2511537001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide_2511537001.setBounds(195, 250, 65, 55);
		contentPane.add(btnDivide_2511537001);
		
		btnPercent_2511537001 = new JButton("%");
		btnPercent_2511537001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent_2511537001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent_2511537001.setBounds(195, 303, 65, 55);
		contentPane.add(btnPercent_2511537001);

	}
}
