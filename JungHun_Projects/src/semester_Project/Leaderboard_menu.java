package semester_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Leaderboard_menu extends JFrame {

	private JPanel contentPane;
	private JTextArea txtR;
	private JLabel lblImg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leaderboard_menu frame = new Leaderboard_menu();
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
	public Leaderboard_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtR = new JTextArea();
		txtR.setFont(new Font("Bauhaus 93", Font.PLAIN, 22));
		txtR.setBounds(31, 83, 547, 283);
		contentPane.add(txtR);		
		
		JButton btnMainMenu = new JButton("");
		btnMainMenu.setBounds(592, 287, 108, 107);
		contentPane.add(btnMainMenu);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(Leaderboard_menu.class.getResource("/semester_Project/Leaderboard.jpg")));
		lblImg.setBounds(0, 0, 700, 394);
		contentPane.add(lblImg);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Main_menu m = new Main_menu();
				m.setVisible(true);
			}
		});
		btnMainMenu.setOpaque(false);
		btnMainMenu.setContentAreaFilled(false);
		btnMainMenu.setBorderPainted(false);
		
		bubblesort();
		
		display();
	}
	
	public static void bubblesort()
	{
		
	for(int k = Main_menu.ranks.size(); k>0; k--)
	{
		for(int q = 0; q < k - 1; q++)
		{
		if (Main_menu.ranks.get(q).getTime()< Main_menu.ranks.get(q+1).getTime())
		{
			Main_menu.ranks.add(Main_menu.ranks.get(q));//smaller is added at the last
			Main_menu.ranks.set(q,Main_menu.ranks.get(q+1));//q+1 with larger time is set forward
			Main_menu.ranks.set(q+1, Main_menu.ranks.get(Main_menu.ranks.size()-1));//collects the last object and replaces
			Main_menu.ranks.remove(Main_menu.ranks.size()-1);

		}
		}
	}
}
	public void display (){
		for(int i =0;i<Main_menu.ranks.size();i++)
		{
			txtR.append((i+1) + ". " + Main_menu.ranks.get(i).getName()+ "\t" + Main_menu.ranks.get(i).getTime() + "s" + "\n");
		}
	}
}
