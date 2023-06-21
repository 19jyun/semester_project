package semester_Project;


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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import summatives.Player;
import javax.swing.JOptionPane;
public class Main_menu extends JFrame {

	private JPanel contentPane;
	static ArrayList<Leaderboard_data> ranks  = new ArrayList<Leaderboard_data>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_menu frame = new Main_menu();
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
	public Main_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main_menu.class.getResource("/semester_Project/MainMenu.jpg")));
		lblNewLabel.setBounds(0, 0, 700, 400);
		contentPane.add(lblNewLabel);
		
		JButton btnPlay = new JButton("");
		btnPlay.setBounds(256, 321, 177, 73);
		contentPane.add(btnPlay);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Game_menu.num3==-1||Game_menu.timesaver==0) {//setting has not been set
					System.out.println("");
					JOptionPane.showMessageDialog(null, "Please customize the settings first!");
				}
				else {//setting has been set
					dispose();
					Input_name i = new Input_name();
					i.setVisible(true);
				}
			}
		});	
		btnPlay.setOpaque(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setBorderPainted(false);
		
		JButton btnHowToPlay = new JButton("");
		btnHowToPlay.setBounds(599, 0, 115, 80);
		contentPane.add(btnHowToPlay);
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Help_menu h = new Help_menu();
				h.setVisible(true);
			}
		});	
		btnHowToPlay.setOpaque(false);
		btnHowToPlay.setContentAreaFilled(false);
		btnHowToPlay.setBorderPainted(false);
		
		
		JButton btnSettings = new JButton("");
		btnSettings.setBounds(0, 302, 115, 109);
		contentPane.add(btnSettings);
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Settings_menu s = new Settings_menu();
				s.setVisible(true);
			}
		});	
		btnSettings.setOpaque(false);
		btnSettings.setContentAreaFilled(false);
		btnSettings.setBorderPainted(false);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(Main_menu.class.getResource("/semester_Project/whiterock.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(599, 302, 117, 109);
		contentPane.add(btnNewButton);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		JButton btnLeaderboard = new JButton("");
		btnLeaderboard.setBounds(-13, 0, 128, 80);
		contentPane.add(btnLeaderboard);
		btnLeaderboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					readListToFile();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dispose();
				Leaderboard_menu l = new Leaderboard_menu();
				l.setVisible(true);
			}
		});
		btnLeaderboard.setContentAreaFilled(false);
		btnLeaderboard.setBorderPainted(false);
		
	}
	
	public static ArrayList<Leaderboard_data> readListToFile() throws ClassNotFoundException
	 {
		 //read food list to file
		 try{
			 ObjectInputStream in = new ObjectInputStream (new FileInputStream("lList.dat"));
			ranks = (ArrayList<Leaderboard_data>) in.readObject();
			 in.close();
		 }catch (IOException e) {e.printStackTrace();}
			 catch (ClassNotFoundException e1){}
		 return ranks;

	 }
}
