package summatives;

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

public class PlayersInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayersInfo frame = new PlayersInfo();
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
	public PlayersInfo() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(17, 17, 61, 16);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(17, 96, 61, 16);
		contentPane.add(lblPlayer_1);
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setBounds(17, 181, 61, 16);
		contentPane.add(lblPlayer_2);
		
		textField = new JTextField();
		textField.setBounds(17, 36, 410, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(17, 116, 410, 53);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(17, 199, 410, 48);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(17, 243, 117, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				LearnMath_JungHun f = new LearnMath_JungHun();
				f.setVisible(true);
			}
		});
		
		btnDisplay = new JButton("Display");
		btnDisplay.setBounds(271, 4, 117, 29);
		contentPane.add(btnDisplay);
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Name :" + LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-3).getName() + "\n" + "Total Score: "+  LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-3).getScore());//third last player
				textField_1.setText("Name :" + LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-2).getName() + "\n" + "Total Score: "+  LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-2).getScore());//second last
				textField_2.setText("Name :" + LearnMath_JungHun.playerList.get(LearnMath_JungHun.playerList.size()-1).getName() + "\n" + "Total Score: "+  LearnMath_JungHun.playerList.get((LearnMath_JungHun.playerList.size()-1)).getScore());//last player

			}
		});
	}

}
