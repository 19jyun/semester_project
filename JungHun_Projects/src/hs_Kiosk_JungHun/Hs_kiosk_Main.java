package hs_Kiosk_JungHun;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;

public class Hs_kiosk_Main extends JFrame {

	private JPanel contentPane;
	static ArrayList<Food> foodList = new ArrayList<Food>();
	static ArrayList <Student> studentList = new ArrayList<Student>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hs_kiosk_Main frame = new Hs_kiosk_Main();
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
	public Hs_kiosk_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnBuyfood = new JButton("Buy food");
		btnBuyfood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					readListToFile();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				dispose();
				Hs_kiosk_food f = new Hs_kiosk_food();
				f.setVisible(true);
			}
		});	
		btnBuyfood.setBounds(32, 56, 180, 47);
		contentPane.add(btnBuyfood);
		
		JButton btnKnowPeople = new JButton("Know people");
		btnKnowPeople.setBounds(241, 53, 180, 50);
		contentPane.add(btnKnowPeople);
		btnKnowPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Hs_kiosk_people p = new Hs_kiosk_people();
				p.setVisible(true);
			}
		});
		
		JLabel lblSelectionAnOption = new JLabel("Selection an option:");
		lblSelectionAnOption.setBounds(152, 6, 125, 33);
		contentPane.add(lblSelectionAnOption);

		JButton btnAddfood = new JButton("Addfood");
		btnAddfood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				InputData ind = new InputData();
				ind.setVisible(true);
			}
		});
		btnAddfood.setBounds(32, 195, 180, 59);
		contentPane.add(btnAddfood);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(32, 127, 180, 56);
		contentPane.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Hs_kiosk_search s = new Hs_kiosk_search();
				s.setVisible(true);
			}
		});
		
		JButton btnStudentUsage = new JButton("Student Usage");
		btnStudentUsage.setBounds(241, 127, 180, 59);
		contentPane.add(btnStudentUsage);
		btnStudentUsage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Hs_kiosk_studentSpending s = new Hs_kiosk_studentSpending();
				s.setVisible(true);
			}
		});
		
		JButton btnFoodStatistics = new JButton("Food Statistics");
		btnFoodStatistics.setBounds(241, 195, 180, 59);
		contentPane.add(btnFoodStatistics);
		btnFoodStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Hs_kiosk_foodStatistics m = new Hs_kiosk_foodStatistics();
				m.setVisible(true);
			}
		});
		
		
	}
	
	 //method to read file and create the list
	 public static ArrayList<Food> readListToFile() throws ClassNotFoundException
	 {
		 //read food list to file
		 try{
			 ObjectInputStream in = new ObjectInputStream (new FileInputStream("fList.dat"));
			foodList = (ArrayList<Food>) in.readObject();
			 in.close();
		 }catch (IOException e) {e.printStackTrace();}
			 catch (ClassNotFoundException e1){}
		 return foodList;

	 }
}
