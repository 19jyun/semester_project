package hs_Kiosk_JungHun;

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
import javax.swing.JList;
import javax.swing.JTextArea;

public class Hs_kiosk_studentSpending extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hs_kiosk_studentSpending frame = new Hs_kiosk_studentSpending();
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
	public Hs_kiosk_studentSpending() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(20, 24, 61, 16);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(67, 18, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTotalSpending = new JLabel("Total Spending:");
		lblTotalSpending.setBounds(19, 113, 98, 16);
		contentPane.add(lblTotalSpending);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 107, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(20, 52, 117, 29);
		contentPane.add(btnEnter);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<Hs_kiosk_Main.studentList.size(); i++)
				{
					if(textField.getText().equals(Hs_kiosk_Main.studentList.get(i).getname()))
						{
							textField_1.setText(Hs_kiosk_Main.studentList.get(i).getspentMoney() + "");
						}
				}
			}
		});
		
		
		JLabel lblStudentsWhoUsed = new JLabel("Students who used Kiosk");
		lblStudentsWhoUsed.setBounds(283, 12, 158, 28);
		contentPane.add(lblStudentsWhoUsed);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 230, 117, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Hs_kiosk_Main f = new Hs_kiosk_Main();
				f.setVisible(true);
			}
		});
		
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBounds(279, 38, 110, 28);
		contentPane.add(btnDisplay);
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i<Hs_kiosk_Main.studentList.size(); i++)
				{
				textArea.append(Hs_kiosk_Main.studentList.get(i).getname() + "\n");
				}
			}
		});
		
		textArea = new JTextArea();
		textArea.setBounds(283, 78, 141, 179);
		contentPane.add(textArea);
		
		

		
		
	}
}
