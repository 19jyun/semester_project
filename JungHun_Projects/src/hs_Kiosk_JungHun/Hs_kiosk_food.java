package hs_Kiosk_JungHun;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import java.util.Calendar;
import java.util.Date;

public class Hs_kiosk_food extends JFrame {

	private JPanel contentPane;
	static int total = 0;
	private JTextArea list;
	private JLabel lbltotalCost;
	private JTextField textField;
	static int iter1 = 0;
	static int iter2 = 0;
	static int iter3 = 0;
	static int iter4 = 0;
	static int iter5 = 0;
	static int iter6 = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hs_kiosk_food frame = new Hs_kiosk_food();
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
	public Hs_kiosk_food() {
		
		Calendar calendar = Calendar.getInstance();//enabling calendar
		int index = calendar.get(Calendar.DAY_OF_WEEK)-2;
		
		
		setTitle("HS Kiosk");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltotalCost = new JLabel("Rs. ");
		lbltotalCost.setBounds(330, 207, 97, 24);
		contentPane.add(lbltotalCost);
		
		
		JButton btnItem1 = new JButton(Hs_kiosk_Main.foodList.get(0).getFname());
		{
		if (Hs_kiosk_Main.foodList.get(0).getAvailable()[index]==false)
			btnItem1.setEnabled(false);
		}
		btnItem1.setToolTipText("");
		btnItem1.setBounds(28, 70, 129, 44);
		contentPane.add(btnItem1);
		btnItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iter1++;
				total+=Hs_kiosk_Main.foodList.get(0).getFprice();
				lbltotalCost.setText("Rs. " + total);
				list.append(Hs_kiosk_Main.foodList.get(0).getFname()+ "\n");
			}
		});
		
		JButton btnItem2 = new JButton(Hs_kiosk_Main.foodList.get(1).getFname());
		if (Hs_kiosk_Main.foodList.get(1).getAvailable()[index]==false)
			btnItem2.setEnabled(false);
		btnItem2.setToolTipText("");
		btnItem2.setBounds(160, 69, 130, 44);
		contentPane.add(btnItem2);
		btnItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iter2++;
				total+=Hs_kiosk_Main.foodList.get(1).getFprice();
				lbltotalCost.setText("Rs. " + total);
				list.append(Hs_kiosk_Main.foodList.get(1).getFname()+ "\n");
			}
		});
		
		
		JButton btnItem3 = new JButton(Hs_kiosk_Main.foodList.get(2).getFname());
		if (Hs_kiosk_Main.foodList.get(2).getAvailable()[index]==false)
			btnItem3.setEnabled(false);
		btnItem3.setToolTipText("");
		btnItem3.setBounds(30, 116, 128, 54);
		contentPane.add(btnItem3);
		btnItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iter3++;
				
				total+=Hs_kiosk_Main.foodList.get(2).getFprice();
				lbltotalCost.setText("Rs. " + total);
				list.append(Hs_kiosk_Main.foodList.get(2).getFname()+ "\n");
			}
		});
		
		JButton btnItem4 = new JButton(Hs_kiosk_Main.foodList.get(3).getFname());
		if (Hs_kiosk_Main.foodList.get(3).getAvailable()[index]==false)
			btnItem4.setEnabled(false);
		btnItem4.setToolTipText("Rs. 70");
		btnItem4.setBounds(159, 115, 130, 48);
		contentPane.add(btnItem4);	
		btnItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iter4++;
				total+= Hs_kiosk_Main.foodList.get(3).getFprice();
				lbltotalCost.setText("Rs. " + total);
				list.append(Hs_kiosk_Main.foodList.get(3).getFname()+ "\n");
			}
		});
		
		
		JButton btnItem5 = new JButton(Hs_kiosk_Main.foodList.get(4).getFname());
		if (Hs_kiosk_Main.foodList.get(4).getAvailable()[index]==false)
			btnItem5.setEnabled(false);
		btnItem5.setToolTipText("Rs. 90");
		btnItem5.setBounds(32, 168, 127, 44);
		contentPane.add(btnItem5);		
		btnItem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iter5++;
				total+= Hs_kiosk_Main.foodList.get(4).getFprice();
				lbltotalCost.setText("Rs. " + total);
				list.append(Hs_kiosk_Main.foodList.get(4).getFname()+ "\n");
			}
		});
		
	
		JButton btnItem6 = new JButton(Hs_kiosk_Main.foodList.get(5).getFname());
		if (Hs_kiosk_Main.foodList.get(5).getAvailable()[index]==false)
			btnItem6.setEnabled(false);
		btnItem6.setToolTipText("Rs. 120");
		btnItem6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iter6++;
				total+= Hs_kiosk_Main.foodList.get(5).getFprice();
				lbltotalCost.setText("Rs. " + total);
				list.append(Hs_kiosk_Main.foodList.get(5).getFname()+ "\n");
				
			}
		});
		btnItem6.setBounds(160, 163, 129, 52);
		contentPane.add(btnItem6);

		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(310, 243, 117, 29);
		contentPane.add(btnDone);
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				for(int i = 0; i<Hs_kiosk_Main.studentList.size()+1; i++)
				{
					if(Hs_kiosk_Main.studentList.size()==1)//if there already is a student item
					{
					if(name.equalsIgnoreCase(Hs_kiosk_Main.studentList.get(i).getname()))
					{
						int used = Hs_kiosk_Main.studentList.get(i).getspentMoney() + total;//if name overlap, only update total money spent 
						Student q = new Student(name, used);
						Hs_kiosk_Main.studentList.set(i, q);
						break;
					}
					else
					{
						Student s = new Student(name, total);//if name doesnt overlap, create a new student and add to list
						Hs_kiosk_Main.studentList.add(s);
						break;
					}
					}
					else//if there arent any student items, just add a new student
					{
						Student s = new Student(name, total);//if name doesnt overlap, create a new student and add to list
						Hs_kiosk_Main.studentList.add(s);
						break;
					}
				}
				
				list.append("\n" + name +"\n" + "Thank you for " + "\n" + "your purchase!");
			}
		});
		
		JLabel lblFood = new JLabel("Food");
		lblFood.setBounds(82, 37, 61, 16);
		contentPane.add(lblFood);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(214, 37, 61, 16);
		contentPane.add(lblDrink);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(29, 243, 117, 29);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total= 0;
				lbltotalCost.setText("Rs. " + total);
				list.setText("");
			}
		});
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(349, 186, 42, 21);
		contentPane.add(lblTotal);
	
		
		list = new JTextArea();
		list.setBounds(310, 17, 117, 166);
		contentPane.add(list);
		
		textField = new JTextField();
		textField.setBounds(82, 225, 117, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(39, 223, 42, 20);
		contentPane.add(lblName);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(158, 243, 117, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Food q1 = new Food(Hs_kiosk_Main.foodList.get(0).getFname(),Hs_kiosk_Main.foodList.get(0).getFprice(),
						Hs_kiosk_Main.foodList.get(0).getType(), Hs_kiosk_Main.foodList.get(0).getAvailable(), iter1);
				Hs_kiosk_Main.foodList.set(0,q1);//change iteration
						
				Food q2 = new Food(Hs_kiosk_Main.foodList.get(1).getFname(),Hs_kiosk_Main.foodList.get(1).getFprice(),
						Hs_kiosk_Main.foodList.get(1).getType(), Hs_kiosk_Main.foodList.get(1).getAvailable(), iter2);
				Hs_kiosk_Main.foodList.set(1,q2);//change iteration
				
				Food q3 = new Food(Hs_kiosk_Main.foodList.get(2).getFname(),Hs_kiosk_Main.foodList.get(2).getFprice(),
						Hs_kiosk_Main.foodList.get(2).getType(), Hs_kiosk_Main.foodList.get(2).getAvailable(), iter3);
				Hs_kiosk_Main.foodList.set(2,q3);//change iteration
				
				Food q4 = new Food(Hs_kiosk_Main.foodList.get(3).getFname(),Hs_kiosk_Main.foodList.get(3).getFprice(),
						Hs_kiosk_Main.foodList.get(3).getType(), Hs_kiosk_Main.foodList.get(3).getAvailable(), iter4);
				Hs_kiosk_Main.foodList.set(3,q4);//change iteration
				
				Food q5 = new Food(Hs_kiosk_Main.foodList.get(4).getFname(),Hs_kiosk_Main.foodList.get(4).getFprice(),
						Hs_kiosk_Main.foodList.get(4).getType(), Hs_kiosk_Main.foodList.get(4).getAvailable(), iter5);
				Hs_kiosk_Main.foodList.set(4,q5);//change iteration
				
				Food q6 = new Food(Hs_kiosk_Main.foodList.get(5).getFname(),Hs_kiosk_Main.foodList.get(5).getFprice(),
						Hs_kiosk_Main.foodList.get(5).getType(), Hs_kiosk_Main.foodList.get(5).getAvailable(), iter6);
				Hs_kiosk_Main.foodList.set(5,q6);//change iteration
				
				dispose();
				Hs_kiosk_Main m = new Hs_kiosk_Main();
				m.setVisible(true);
			}
		});
		
		
		
		
	}
}
