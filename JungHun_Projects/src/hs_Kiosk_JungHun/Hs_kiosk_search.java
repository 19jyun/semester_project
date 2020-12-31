package hs_Kiosk_JungHun;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.util.Calendar;
import java.util.Date;

public class Hs_kiosk_search extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private int i;

	
	
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
					Hs_kiosk_search frame = new Hs_kiosk_search();
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
	public Hs_kiosk_search() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(23, 17, 61, 16);
		contentPane.add(lblSearch);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 35, 109, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDoneEditing = new JButton("Done Editing");
		btnDoneEditing.setBounds(23, 136, 117, 29);
		contentPane.add(btnDoneEditing);
		
		chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.setBounds(156, 192, 87, 23);
		contentPane.add(chckbxMonday);
	
		chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(156, 231, 87, 23);
		contentPane.add(chckbxTuesday);

		chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(235, 192, 102, 23);
		contentPane.add(chckbxWednesday);
		
		chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(240, 231, 97, 23);
		contentPane.add(chckbxThursday);
		
		chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(342, 192, 70, 23);
		contentPane.add(chckbxFriday);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(23, 64, 117, 29);
		contentPane.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(i = 0; i<Hs_kiosk_Main.foodList.size(); i++)
				{
									
					if(textField_1.getText().equalsIgnoreCase(Hs_kiosk_Main.foodList.get(i).getFname()))
					{
						textField.setText((Hs_kiosk_Main.foodList.get(i).getFname()));
						textField.setEditable(false);//disabled edit
						textField_2.setText((Hs_kiosk_Main.foodList.get(i).getType()) + "");
						textField_2.setEditable(false);//disabled edit
						textField_3.setText((Hs_kiosk_Main.foodList.get(i).getFprice()) + "");
						textField_3.setEditable(false);//disabled edit
											
						
						if (Hs_kiosk_Main.foodList.get(i).getAvailable()[0]==true)
						{
							chckbxMonday.setSelected(true);
						}
						else if (Hs_kiosk_Main.foodList.get(i).getAvailable()[0]==false)
						{
							chckbxMonday.setSelected(false);
						}
						if (Hs_kiosk_Main.foodList.get(i).getAvailable()[1]==true)
						{
							chckbxTuesday.setSelected(true);
						}
						else if (Hs_kiosk_Main.foodList.get(i).getAvailable()[1]==false)
						{
							chckbxTuesday.setSelected(false);
						}
						if (Hs_kiosk_Main.foodList.get(i).getAvailable()[2]==true)
						{
							chckbxWednesday.setSelected(true);
						}
						else if (Hs_kiosk_Main.foodList.get(i).getAvailable()[2]==false)
						{
							chckbxWednesday.setSelected(false);
						}
						if (Hs_kiosk_Main.foodList.get(i).getAvailable()[3]==true)
						{
							chckbxThursday.setSelected(true);
						}
						else if (Hs_kiosk_Main.foodList.get(i).getAvailable()[3]==false)
						{
							chckbxThursday.setSelected(false);
						}
						if (Hs_kiosk_Main.foodList.get(i).getAvailable()[4]==true)
						{
							chckbxFriday.setSelected(true);
						}
						else if (Hs_kiosk_Main.foodList.get(i).getAvailable()[4]==false)
						{
							chckbxFriday.setSelected(false);
						}
						
						break;
					}

				}
			}
		});
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(15, 230, 117, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Hs_kiosk_Main f = new Hs_kiosk_Main();
				f.setVisible(true);
			}
		});
		
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(23, 101, 117, 29);
		contentPane.add(btnEdit);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						textField.setEditable(true);//enabled edit
						textField_2.setEditable(true);//enabled edit
						textField_3.setEditable(true);//enabled edit
			}
		});
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(167, 41, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(167, 89, 61, 16);
		contentPane.add(lblType);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(167, 131, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel lblDayAvailable = new JLabel("Day available:");
		lblDayAvailable.setBounds(167, 164, 87, 16);
		contentPane.add(lblDayAvailable);
		
		textField = new JTextField();
		textField.setBounds(240, 35, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 83, 134, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(240, 123, 134, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(49, 177, 61, 16);
		contentPane.add(label);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(23, 201, 117, 29);
		contentPane.add(btnRemove);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						Hs_kiosk_Main.foodList.remove(i);
						
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						
						textField.setEditable(false);//enabled edit
						textField_2.setEditable(false);//enabled edit
						textField_3.setEditable(false);//enabled edit
						
						label.setText("Removed!");
			}
		});
		
		
		btnDoneEditing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean fa2[] = {chckbxMonday.isSelected(), chckbxTuesday.isSelected(), chckbxWednesday.isSelected(), chckbxThursday.isSelected(), chckbxFriday.isSelected()};
				
				Food q = new Food(textField.getText(),Integer.parseInt(textField_3.getText()),
						textField_2.getText().charAt(0), fa2, Hs_kiosk_Main.foodList.get(i).getIteration());
				
						Hs_kiosk_Main.foodList.set(i,q);

				
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						
						textField.setEditable(false);//enabled edit
						textField_2.setEditable(false);//enabled edit
						textField_3.setEditable(false);//enabled edit
						
						label.setText("Edited!");
			}
		});
		
		
		
	}
}
