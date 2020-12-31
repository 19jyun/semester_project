package summatives;

import hs_Kiosk_JungHun.Hs_kiosk_Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LearnMath_Solve extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	int x = 1 + (int)(Math.random()*10);
	int y = 1 + (int)(Math.random()*10);
	int z = (int)(Math.random()*2);//for + and -
	static int right = 0;
	static int wrong = 0;
	static int score = 0;
	static int problems = 0;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LearnMath_Solve frame = new LearnMath_Solve();
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
	public LearnMath_Solve() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInteger = new JLabel("Integer1");
		lblInteger.setBounds(31, 77, 93, 25);
		contentPane.add(lblInteger);
		
		JLabel lblInteger_1 = new JLabel("Integer 2");
		lblInteger_1.setBounds(225, 77, 93, 25);
		contentPane.add(lblInteger_1);
		
		JLabel lblSign = new JLabel("Sign");
		lblSign.setBounds(135, 81, 32, 16);
		contentPane.add(lblSign);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(31, 131, 61, 16);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(135, 131, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(225, 131, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblAnswer = new JLabel("Answer = ");
		lblAnswer.setBounds(31, 182, 74, 16);
		contentPane.add(lblAnswer);
		
		textField = new JTextField();
		textField.setBounds(95, 176, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Player p = new Player(textField_1.getText(), score);
				LearnMath_JungHun.playerList.add(p);
				
				score = 0;
				
				dispose();
				LearnMath_JungHun f = new LearnMath_JungHun();
				f.setVisible(true);
			}
		});
		btnBack.setBounds(31, 225, 117, 29);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(299, 225, 117, 29);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x = 1 + (int)(Math.random()*10);//random again
				y = 1 + (int)(Math.random()*10);
				z = (int)(Math.random()*2);
								
				lblNewLabel.setText(x + "");
				lblNewLabel_2.setText(y + "");
				
				if(z == 0)
				{
					lblNewLabel_1.setText("+");
				}
				
				if(z == 1)
				{
					lblNewLabel_1.setText("-");
				}
				label.setText("");
			}
		});
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(299, 138, 117, 29);
		contentPane.add(btnCheck);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				problems++;
				if(z == 0)
				{
				if(x + y == Integer.parseInt(textField.getText()))
				{
					right++;
					score = score + 5;
					label.setText("Correct!");
				}
				else
				{
					wrong++;
					label.setText("Try Again");
				}
				}
				
				if(z == 1)
				{
				if(x - y == Integer.parseInt(textField.getText()))
				{
					right++;
					score = score + 5;
					label.setText("Correct!");
				}
				else
				{
					wrong++;
					label.setText("Try Again");
				}
				}
				
			}
		});
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(31, 34, 61, 16);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 28, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(299, 36, 117, 29);
		contentPane.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblNewLabel.setText(x+"");
				lblNewLabel_2.setText(y+"");
				
				if(z == 0)
				{
					lblNewLabel_1.setText("+");
				}
				if(z == 1)
				{
					lblNewLabel_1.setText("-");
				}
			}
		});
		
		label = new JLabel("");
		label.setBounds(309, 182, 61, 16);
		contentPane.add(label);
		
		
		
	}
}
