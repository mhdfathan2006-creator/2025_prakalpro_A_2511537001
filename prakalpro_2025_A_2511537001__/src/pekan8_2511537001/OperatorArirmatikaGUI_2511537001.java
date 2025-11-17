package pekan8_2511537001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class OperatorArirmatikaGUI_2511537001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "eror",JOptionPane.WARNING_MESSAGE);
	}
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorArirmatikaGUI_2511537001 frame = new OperatorArirmatikaGUI_2511537001();
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
	public OperatorArirmatikaGUI_2511537001() {
		setTitle("OPERATORARITMATIKA_2511537001");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Hasil");
		lblNewLabel_2.setBounds(8, 172, 24, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(8, 131, 44, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("BIlangan 2");
		lblNewLabel_1.setBounds(8, 81, 53, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBilangan = new JLabel("Bilangan 1");
		lblBilangan.setBounds(10, 45, 51, 14);
		lblBilangan.setBackground(new Color(240, 240, 240));
		lblBilangan.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblBilangan);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(248, 10, 132, 14);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(70, 42, 96, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(71, 78, 96, 20);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(46, 169, 96, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Silakan Input bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()) {
						pesanPeringatan("Silakan input bilangan 2");
				} else if (txtBil2.getText().trim().startsWith("0")) {
					pesanPeringatan("Bilangan Tidak Boleh 0");
					
				} else {
					try {
				int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				if (c==0) {
					hasil = a+b;
				}
				if (c==1) {
					hasil = a-b;
				}
				if (c==2) {
					hasil = a*b;
				}
				if (c==3) {
					hasil = a/b;
				}
				if (c==4) {
					hasil = a%b;
					}
				
			} catch (NumberFormatException ex) {
				pesanEror("bilangan 1 dan dua harus angka");
				
			}
				
		}
			txtHasil.setText(String.valueOf(hasil));
			}
			
		
		});
		btnNewButton.setBounds(166, 127, 88, 22);
		contentPane.add(btnNewButton);
		
		  
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(62, 127, 53, 22);
		contentPane.add(cbOperator);

	}
}
