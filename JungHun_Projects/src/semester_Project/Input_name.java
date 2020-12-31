package semester_Project;

import hs_Kiosk_JungHun.Food;
import hs_Kiosk_JungHun.Hs_kiosk_Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Input_name extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public static String name1;
	public static String name2;
	public static int numGames = -1;//so that first game, it becomes 0 for index of game
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input_name frame = new Input_name();
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
	public Input_name() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(283, 127, 227, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 230, 227, 53);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNext = new JButton("");
		btnNext.setBounds(600, 305, 101, 96);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					readListToFile();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				name1=textField.getText();
				name2=textField_1.getText();
				
				dispose();
				Game_menu g = new Game_menu();
				g.setVisible(true);
			}
});
		btnNext.setOpaque(false);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		
		btnBack = new JButton("");
		btnBack.setBounds(1, 296, 107, 105);
		contentPane.add(btnBack);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(Input_name.class.getResource("/semester_Project/Input_menu.jpg")));
		lblImg.setBounds(1, 0, 700, 401);
		contentPane.add(lblImg);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Main_menu m = new Main_menu();
				m.setVisible(true);
			}
		});
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
}
	public static ArrayList<Leaderboard_data> readListToFile() throws ClassNotFoundException
	 {
		 //read food list to file
		 try{
			 ObjectInputStream in = new ObjectInputStream (new FileInputStream("lList.dat"));
			Main_menu.ranks = (ArrayList<Leaderboard_data>) in.readObject();
			 in.close();
		 }catch (IOException e) {e.printStackTrace();}
			 catch (ClassNotFoundException e1){}
		 return Main_menu.ranks;

	 }
}

