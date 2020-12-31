package hs_Kiosk_JungHun;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Hs_kiosk_people extends JFrame {

	private JPanel contentPane;
	private JTextField nameEnter;
	private static JTextArea infoList;
	private static JLabel lblName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hs_kiosk_people frame = new Hs_kiosk_people();
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
	public Hs_kiosk_people() {
		setTitle("HS Kiosk Staffs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStaffList = new JLabel("Staff List:");
		lblStaffList.setBounds(16, 6, 85, 21);
		contentPane.add(lblStaffList);
		
		JButton btnAladin = new JButton("Aladin");
		btnAladin.setBounds(26, 42, 117, 29);
		contentPane.add(btnAladin);
		btnAladin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				infoList.setText("Age: 32 \nGender: Male \nMarrige: Married \nWorked Time: \n4 years");
			
			}
		});
		
		JButton btnAlex = new JButton("Alex");
		btnAlex.setBounds(164, 42, 117, 29);
		contentPane.add(btnAlex);
		btnAlex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				infoList.setText("Age: 23 \nGender: Male \nMarrige: Single \nWorked Time: \n2 years");
			
			}
		});
		
		JButton btnSonya = new JButton("Sonya");
		btnSonya.setBounds(300, 42, 117, 29);
		contentPane.add(btnSonya);
		btnSonya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				infoList.setText("Age: 30 \nGender: Female \nMarrige: Single \nWorked Time: \n9 years");
				
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(16, 232, 117, 29);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				infoList.setText("");
				nameEnter.setText("");
			}
		});
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setBounds(16, 28, 107, 16);
		contentPane.add(lblInformation);
		
		lblName = new JLabel("Name:");
		lblName.setBounds(136, 8, 45, 16);
		contentPane.add(lblName);
		
		nameEnter = new JTextField();
		nameEnter.setBounds(178, 2, 107, 28);
		contentPane.add(nameEnter);
		nameEnter.setColumns(10);
		
		infoList = new JTextArea();
		infoList.setBounds(26, 80, 194, 132);
		contentPane.add(infoList);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(300, 3, 117, 29);
		contentPane.add(btnDone);
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = nameEnter.getText();
				nameEnter.setText("Welcome " + name + "!");
			
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						dispose();
						Hs_kiosk_Main m = new Hs_kiosk_Main();
						m.setVisible(true);
			}
		});
		btnBack.setBounds(318, 236, 99, 21);
		contentPane.add(btnBack);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(232, 76, 194, 29);
		contentPane.add(comboBox);
		
	}
}
