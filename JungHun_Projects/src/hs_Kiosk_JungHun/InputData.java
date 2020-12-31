package hs_Kiosk_JungHun;

import java.awt.BorderLayout;

import java.io.Serializable;  
import java.util.ArrayList;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import programList7.Student;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InputData extends JFrame {

	private JPanel contentPane;
	JTextField name;
	private JTextField nameField;
	private JTextField textField_1;
	private JTextField txtType;
	private JCheckBox chckbxMonday;
	private JCheckBox chckbxTuesday;
	private JCheckBox chckbxWednesday;
	private JCheckBox chckbxThursday;
	private JCheckBox chckbxFriday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputData frame = new InputData();
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
	public InputData(){
		setTitle("Input New Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		name = new JTextField(10);
		contentPane.add(name);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean fa[] ={chckbxMonday.isSelected(), chckbxTuesday.isSelected(), chckbxWednesday.isSelected(), chckbxThursday.isSelected(), chckbxFriday.isSelected()};
				
				Food f = new Food(nameField.getText(),Integer.parseInt(textField_1.getText()),
						txtType.getText().charAt(0), fa, 0);
				Hs_kiosk_Main.foodList.add(f);
				nameField.setText("");
				textField_1.setText("");
				txtType.setText("");
			}

		});
		btnNext.setBounds(132, 227, 117, 29);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveListToFile(Hs_kiosk_Main.foodList);
				dispose();
				Hs_kiosk_Main f = new Hs_kiosk_Main();
				f.setVisible(true);
			}
		});
		btnBack.setBounds(290, 227, 117, 29);
		contentPane.add(btnBack);
		
		nameField = new JTextField(10);
		nameField.setBounds(140, 45, 130, 26);
		contentPane.add(nameField);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 83, 122, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(51, 50, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(51, 89, 61, 16);
		contentPane.add(lblPrice);
		
		chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.setBounds(51, 128, 84, 23);
		contentPane.add(chckbxMonday);
		
		chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(51, 151, 84, 23);
		contentPane.add(chckbxTuesday);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(297, 50, 61, 16);
		contentPane.add(lblType);
		
		chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(140, 128, 109, 23);
		contentPane.add(chckbxWednesday);
		
		chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(140, 151, 90, 23);
		contentPane.add(chckbxThursday);
		
		chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(247, 128, 128, 23);
		contentPane.add(chckbxFriday);
		
		txtType = new JTextField();
		txtType.setToolTipText("Drink(D)/ Snack(S)/Lunch(L)");
		txtType.setBounds(370, 45, 61, 26);
		contentPane.add(txtType);
		txtType.setColumns(10);
	}
	
	public static void saveListToFile(ArrayList<Food> foodList) { //puts data into files
		try {ObjectOutputStream out = new ObjectOutputStream 
				(new FileOutputStream("fList.dat"));
				out.writeObject(foodList);
				out.close();
		}	catch (IOException e)
				{e.printStackTrace();}				
		
	}

}
