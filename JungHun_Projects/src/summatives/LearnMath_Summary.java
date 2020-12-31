package summatives;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LearnMath_Summary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LearnMath_Summary frame = new LearnMath_Summary();
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
	public LearnMath_Summary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(19, 16, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblNumberOfProblems = new JLabel("Number of \nproblems solved");
		lblNumberOfProblems.setBounds(19, 72, 188, 16);
		contentPane.add(lblNumberOfProblems);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(19, 44, 61, 16);
		contentPane.add(lblScore);
		
		JLabel lblCorrectProblems = new JLabel("Correct problems");
		lblCorrectProblems.setBounds(19, 105, 109, 16);
		contentPane.add(lblCorrectProblems);
		
		textField = new JTextField();
		textField.setBounds(110, 10, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField.setText(LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-1).getName());//last player name display
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 38, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_1.setText(LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-1).getScore()+"");//score display
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 66, 134, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_2.setText(LearnMath_Solve.problems + "");
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 100, 134, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_3.setText(LearnMath_Solve.right + "");
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(11, 232, 117, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				LearnMath_JungHun f = new LearnMath_JungHun();
				f.setVisible(true);
			}
		});
	}

}
