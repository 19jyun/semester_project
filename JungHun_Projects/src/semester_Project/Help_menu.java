package semester_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Help_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help_menu frame = new Help_menu();
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
	public Help_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMainMenu = new JButton("");
		btnMainMenu.setBounds(594, 326, 139, 70);
		contentPane.add(btnMainMenu);
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
		
		JLabel lblBackground = new JLabel("Background");
		lblBackground.setIcon(new ImageIcon(Help_menu.class.getResource("/semester_Project/How-To-Play.jpg")));
		lblBackground.setBounds(0, 0, 700, 407);
		contentPane.add(lblBackground);
	}
}
