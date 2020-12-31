package semester_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JCheckBox;
import java.applet.*;
//import sun.audio.*;

public class Settings_menu extends JFrame {

	private JPanel contentPane;
	private JCheckBox two;
	private JCheckBox four;
	private JCheckBox six;
	private JCheckBox easy;
	private JCheckBox hard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings_menu frame = new Settings_menu();
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
	public Settings_menu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		two = new JCheckBox("");//200 seconds
		two.setBounds(47, 124, 193, 23);
		contentPane.add(two);
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				four.setSelected(false);
				six.setSelected(false);
			}
		};
		two.addActionListener(actionListener);

		four = new JCheckBox("");//400 seconds
		four.setBounds(47, 156, 209, 23);
		contentPane.add(four);
		ActionListener actionListener1 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				two.setSelected(false);
				six.setSelected(false);
			}
		};
		four.addActionListener(actionListener1);

		six = new JCheckBox("");//600 seconds
		six.setBounds(47, 190, 193, 23);
		contentPane.add(six);
		ActionListener actionListener2 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				two.setSelected(false);
				four.setSelected(false);
			}
		};
		six.addActionListener(actionListener2);

		JButton btnMainmenu = new JButton("");
		btnMainmenu.setBounds(600, 290, 101, 110);
		contentPane.add(btnMainmenu);
		btnMainmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(two.isSelected()){
					Game_menu.timesaver=200;
				}
				if(four.isSelected()){
					Game_menu.timesaver=400;
				}
				if(six.isSelected()){
					Game_menu.timesaver=600;
				}
				if(easy.isSelected()){
					Game_menu.num3 = (int)(Math.random()*2);//+ or -
				}
				if(hard.isSelected()){
					Game_menu.num3 = 2;// *
				}

				dispose();
				Main_menu m = new Main_menu();
				m.setVisible(true);
			}
		});
		btnMainmenu.setOpaque(false);
		btnMainmenu.setContentAreaFilled(false);
		btnMainmenu.setBorderPainted(false);

		easy = new JCheckBox("");
		easy.setBounds(47, 290, 128, 23);
		contentPane.add(easy);
		ActionListener actionListener4 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				hard.setSelected(false);
			}
		};
		easy.addActionListener(actionListener4);

		hard = new JCheckBox("");
		hard.setBounds(47, 325, 128, 23);
		contentPane.add(hard);
		ActionListener actionListener5 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				easy.setSelected(false);
			}
		};
		hard.addActionListener(actionListener5);

		JLabel lblBackground = new JLabel("Background");
		lblBackground.setIcon(new ImageIcon(Settings_menu.class.getResource("/semester_Project/Settings.jpg")));
		lblBackground.setBounds(0, 0, 701, 400);
		contentPane.add(lblBackground);
		
		check();

	}

	public void check() {//if options are already saved, load the options
		if(Game_menu.timesaver == 200) {
			two.setSelected(true);
		}
		else if(Game_menu.timesaver == 400) {
			four.setSelected(true);
		}
		else if(Game_menu.timesaver == 600) {
			six.setSelected(true);
		}

		if(Game_menu.num3 == 0||Game_menu.num3 == 1) {//easy setting
			easy.setSelected(true);
		}
		else if(Game_menu.num3 == 2) {//hard setting
			hard.setSelected(true);
		}
	}

	//	public void music (){
	//		AudioPlayer MGP = AudioPlayer.player;
	//	    AudioStream BGM;
	//	    AudioData MD;
	//	    
	//	    ContinuousAudioDataStream loop = null;
	//	    
	//	    try{
	//	    	BGM = new AudioStream(new FileInputStream("C:\\test\\ha.wav"));
	//	    	MD = BGM.getData();
	//	    	loop = new ContinuousAudioDataStream(MD);
	//	    	}catch(IOException error){
	//	    	System.out.print("file not found");
	//	    	}
	//	    	MGP.start(loop);
	//	    	}
	//	}
}
