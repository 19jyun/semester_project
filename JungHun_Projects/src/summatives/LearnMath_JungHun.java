package summatives;

import hs_Kiosk_JungHun.Food;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JLabel;

public class LearnMath_JungHun extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	static ArrayList<Player> playerList = new ArrayList<Player>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LearnMath_JungHun frame = new LearnMath_JungHun();
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
	public LearnMath_JungHun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.setBounds(6, 39, 190, 64);
		contentPane.add(btnSolve);
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LearnMath_Solve.problems = 0;
				LearnMath_Solve.right = 0;
				LearnMath_Solve.wrong = 0;
				
				dispose();
				LearnMath_Solve s = new LearnMath_Solve();
				s.setVisible(true);
			}
		});
		
		JButton btnSummary = new JButton("Summary");
		btnSummary.setBounds(205, 39, 214, 64);
		contentPane.add(btnSummary);
		btnSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				LearnMath_Summary s = new LearnMath_Summary();
				s.setVisible(true);
			}
		});
		
		JButton btnPlayers = new JButton("Players");
		btnPlayers.setBounds(6, 167, 190, 64);
		contentPane.add(btnPlayers);
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				PlayersInfo s = new PlayersInfo();
				s.setVisible(true);
			}
		});
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(205, 167, 214, 64);
		contentPane.add(btnQuit);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Thank you for learning Math, you may close the window now");
			}
		});
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(16, 115, 403, 54);
		contentPane.add(lblNewLabel);
		
		
	}
}
