package semester_Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Game_menu extends JFrame implements ActionListener {

	private JButton[][] coordinates = new JButton[9][9];//1to1 button layout for user interaction
	private int x = 0;//player 1 starts off
	private int [][] checked = new int[9][9];//actual 2d array used to track where the player played
	private JLabel lblPlayer;
	private int row = 0;
	private int column = 0;
	private JPanel contentPane;
	private GridLayout bt;
	private JPanel panel = new JPanel();
	private JLabel lblArithmeticEquation;//where math equations are displayed
	private JLabel lblPlayer_1;
	private JLabel lblPlayer_2;
	private Timer timer1 = new Timer();
	private Timer timer2 = new Timer();
	private TimerTask tsk1;
	private TimerTask tsk2;
	private JButton btnStart;


	public static int num1;//random number 1
	public static int num2;//random number 2
	int finalnum;
	public static int num3=-1;//for + and - or *

	public static int timesaver=0;//so that if the game finishes, time is set to what it originally was
	private int p1time = timesaver;//seconds given for player 1
	private int p2time = timesaver;


	private JTextField txtAnswer;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_menu frame = new Game_menu();
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
	public Game_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(230, 18, 361, 361);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(9, 9, -2, -2));
		panel.setOpaque(false);
		add_button();

		JButton btnSurrender = new JButton("");
		btnSurrender.setBounds(595, 0, 105, 108);
		contentPane.add(btnSurrender);
		btnSurrender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Player " + (2-x) + " Wins!");
				String n=null;
				int finaltime = 0;

				if(x == 0)//if player 1 surrenders, player 2 wins
				{
					n = Input_name.name2;
					finaltime = p2time;
				}
				else if(x==1)//if player 2 surrenders, player 1 wins
				{
					n = Input_name.name1;
					finaltime = p1time;
				}

				Leaderboard_data p2 = new Leaderboard_data(n, finaltime);
				Main_menu.ranks.add(p2);
				saveListToFile(Main_menu.ranks);
				dispose();
				Main_menu m= new Main_menu();
				m.setVisible(true);
			}
		});
		btnSurrender.setOpaque(false);
		btnSurrender.setContentAreaFilled(false);
		btnSurrender.setBorderPainted(false);

		JButton btnBack = new JButton("");
		btnBack.setBounds(595, 288, 105, 108);
		contentPane.add(btnBack);
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

		lblPlayer = new JLabel("1");
		lblPlayer.setForeground(Color.BLACK);
		lblPlayer.setFont(new Font("Phosphate", Font.PLAIN, 30));
		lblPlayer.setBounds(104, 6, 15, 42);
		contentPane.add(lblPlayer);

		lblArithmeticEquation = new JLabel("");
		lblArithmeticEquation.setForeground(new Color(0, 0, 0));
		lblArithmeticEquation.setFont(new Font("Phosphate", Font.PLAIN, 25));
		lblArithmeticEquation.setBounds(115, 169, 105, 31);
		contentPane.add(lblArithmeticEquation);

		btnStart = new JButton("");
		btnStart.setBounds(16, 126, 172, 42);
		contentPane.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new_equation();
				renewTimer1();
				btnStart.setEnabled(false);
			}
		});
		btnStart.setOpaque(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);

		JButton btnCheckAnswer = new JButton("");
		btnCheckAnswer.setBounds(16, 254, 172, 33);
		contentPane.add(btnCheckAnswer);
		btnCheckAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check_equation();
			}
		});
		btnCheckAnswer.setOpaque(false);
		btnCheckAnswer.setContentAreaFilled(false);
		btnCheckAnswer.setBorderPainted(false);

		for(int i = 0; i<9;i++)
		{
			for(int q = 0; q<9;q++)
			{
				checked[i][q] = 2;
			}
		}

		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		label.setBounds(16, 299, 192, 93);
		contentPane.add(label);

		txtAnswer = new JTextField();
		txtAnswer.setBounds(16, 212, 192, 28);
		contentPane.add(txtAnswer);
		txtAnswer.setColumns(10);

		lblPlayer_2 = new JLabel("");
		lblPlayer_2.setForeground(Color.BLUE);
		lblPlayer_2.setFont(new Font("Phosphate", Font.PLAIN, 20));
		lblPlayer_2.setBounds(97, 98, 36, 24);
		contentPane.add(lblPlayer_2);

		lblPlayer_1 = new JLabel("");
		lblPlayer_1.setForeground(Color.RED);
		lblPlayer_1.setFont(new Font("Phosphate", Font.PLAIN, 20));
		lblPlayer_1.setBounds(97, 73, 36, 24);
		contentPane.add(lblPlayer_1);

		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Game_menu.class.getResource("/semester_Project/Game_menu.jpg")));
		lblImage.setBounds(0, 0, 700, 396);
		contentPane.add(lblImage);

	}
	public void add_button() {
		for(row = 0; row<9; row++)
		{
			for(column = 0; column<9; column++)
			{
				coordinates[row][column] = new JButton();
				coordinates[row][column].addActionListener(this);
				coordinates[row][column].setEnabled(false);
				coordinates[row][column].setOpaque(false);
				coordinates[row][column].setContentAreaFilled(false);
				coordinates[row][column].setBorderPainted(true);
				panel.add(coordinates[row][column]);
			}
		}
	}

	public void renewTimer1(){
		timer1 = new Timer();
		tsk1 = new TimerTask(){
			public void run() {
				lblPlayer_1.setText(""+p1time);
				p1time--;				
				if(p1time == 0)
				{
					timer1.cancel();
					JOptionPane.showMessageDialog(null, "Player 2 Wins!");
					Leaderboard_data p2 = new Leaderboard_data(Input_name.name2, p2time);
					Main_menu.ranks.add(p2);
					saveListToFile(Main_menu.ranks);
					dispose();
					Main_menu m= new Main_menu();
					m.setVisible(true);
				}
			}
		};
		timer1.scheduleAtFixedRate(tsk1,1000,1000);
	}

	public void renewTimer2(){
		timer2 = new Timer();
		tsk2 = new TimerTask(){
			public void run() {
				lblPlayer_2.setText(""+p2time);
				p2time--;
				if(p2time == 0)
				{
					timer2.cancel();
					JOptionPane.showMessageDialog(null, "Player 1 Wins!");
					Leaderboard_data p1 = new Leaderboard_data(Input_name.name1, p1time);
					Main_menu.ranks.add(p1);
					saveListToFile(Main_menu.ranks);
					dispose();
					Main_menu m= new Main_menu();
					m.setVisible(true);
				}
			}
		};
		timer2.scheduleAtFixedRate(tsk2,1000,1000);
	}

	public void check_equation() {
		if(finalnum == Integer.parseInt(txtAnswer.getText()))
		{
			right();
		}
		else if(!(finalnum == Integer.parseInt(txtAnswer.getText())))
		{
			wrong();
		}
	}

	public void right() {
		label.setText("Correct!");
		for(int r=0;r<9;r++)
		{
			for(int c=0;c<9;c++)
			{
				coordinates[r][c].setEnabled(true);//enable for entering
				if(checked[r][c]!=2) {//however, if the button is already taken
//					coordinates[r][c].setDisabledIcon();
//					coordinates[r][c].setEnabled(false);
				}
			}
		}
	}

	public void wrong() {

		new_equation();
		label.setText("Wrong! The chance goes to the next Player.");
		if(x==0){
			lblPlayer.setText("2");
			timer1.cancel();
			renewTimer2();
			x = 1;
			return;}

		else if(x==1){
			lblPlayer.setText("1");
			timer2.cancel();
			renewTimer1();
			x = 0;
			return;}
	}

	public void new_equation(){
		if(num3 == 0)
		{
			num1 = 1 + (int)(Math.random()*100);//set the range to 1~100 for addition/subtraction
			num2 = 1 + (int)(Math.random()*100);
			lblArithmeticEquation.setText(num1 + " + " + num2);
			finalnum = num1+num2;
		}
		if(num3 == 1)
		{
			num1 = 1 + (int)(Math.random()*100);//set the range to 1~100 for addition/subtraction
			num2 = 1 + (int)(Math.random()*100);
			lblArithmeticEquation.setText(num1 + " - " + num2);
			finalnum = num1-num2;
		}
		if(num3 == 2)
		{
			num1 = 1 + (int)(Math.random()*20);//set the range to 1~100 for addition/subtraction
			num2 = 1 + (int)(Math.random()*20);
			lblArithmeticEquation.setText(num1 + " X " + num2);
			finalnum = num1*num2;
		}
		txtAnswer.setText("");
		label.setText("");
	}

	public void checkwin()
	{
		//System.out.println(x);//player 2 = 0 player 1 = 1
		for(int i =0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				if((checked[i][j]==x&&checked[i+1][j]==x&&checked[i+2][j]==x&&checked[i+3][j]==x&&checked[i+4][j]==x)||//horizontal win
						(checked[i][j]==x&&checked[i][j+1]==x&&checked[i][j+2]==x&&checked[i][j+3]==x&&checked[i][j+4]==x)||//vertical win
						(checked[i][j]==x&&checked[i+1][j+1]==x&&checked[i+2][j+2]==x&&checked[i+3][j+3]==x&&checked[i+4][j+4]==x)||//diagonal win
						(checked[i][j+4]==x&&checked[i+1][j+3]==x&&checked[i+2][j+2]==x&&checked[i+3][j+1]==x&&checked[i+4][j]==x))//diagonal wins
				{			//if won,

					JOptionPane.showMessageDialog(null, "Player" + (x+1) + " Wins!");//display winner

					String n = null;	
					int finaltime = 0;
					if(x==1)//if player 2 player won
					{
						n = Input_name.name2;
						finaltime = p2time;
					}
					else if(x==0)//if player 1 won
					{
						n = Input_name.name1;
						finaltime = p1time;
					}

					Leaderboard_data p1 = new Leaderboard_data(n, finaltime);
					Main_menu.ranks.add(p1);

					saveListToFile(Main_menu.ranks);
					dispose();
					Main_menu m= new Main_menu();
					m.setVisible(true);
					return;
				}
			}
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		new_equation();
		for(int r=0;r<9;r++)//after one player moves, buttons are disabled again
		{
			for(int c=0;c<9;c++)
			{
				coordinates[r][c].setEnabled(false);//disabled until one solves arithmetic question
			}
		}

		for (int i = 0; i < 9; i++)  {
			for (int j = 0; j < 9; j++)  {
				if(e.getSource()==coordinates[i][j]) //coordinates[i][j] was clicked
				{
					lblPlayer.setText(""+(2-x));//player 1 played, so its player 2's turn
					checked[i][j] = x;//player has made a move
					if(x==1)
					{
						coordinates[i][j].setIcon(new ImageIcon(Game_menu.class.getResource("/semester_Project/blackrock.png")));
						timer2.cancel();//player 2
						renewTimer1();
						checkwin();

					}
					else if(x==0)
					{
						coordinates[i][j].setIcon(new ImageIcon(Game_menu.class.getResource("/semester_Project/whiterock.png")));
						timer1.cancel();//player 1
						renewTimer2();
						checkwin();
					}			
					coordinates[i][j].removeActionListener(this);//do not gray scale, but makes the button unresponsive

					x=1-x;//player changes

				} 
			}
		}
	}

	public static void saveListToFile(ArrayList<Leaderboard_data> ranks) { //puts data into files
		try {ObjectOutputStream out = new ObjectOutputStream 
				(new FileOutputStream("lList.dat"));
		out.writeObject(ranks);
		out.close();
		}	catch (IOException e)
		{e.printStackTrace();}				

	}

}

