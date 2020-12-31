package hs_Kiosk_JungHun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Hs_kiosk_foodStatistics extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;
	
//	private static 
//	private static 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hs_kiosk_foodStatistics frame = new Hs_kiosk_foodStatistics();
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
	public Hs_kiosk_foodStatistics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPriceOfFood = new JLabel("Price of Food:");
		lblPriceOfFood.setBounds(16, 16, 98, 29);
		contentPane.add(lblPriceOfFood);
		
		JLabel lblMostPopular = new JLabel("Most popular");
		lblMostPopular.setBounds(252, 22, 154, 22);
		contentPane.add(lblMostPopular);
		
		JLabel lblLeastPopular = new JLabel("Least popular");
		lblLeastPopular.setBounds(252, 141, 154, 29);
		contentPane.add(lblLeastPopular);
		
		textField_1 = new JTextField();
		textField_1.setBounds(252, 179, 154, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(252, 47, 160, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iterationsort();
				priceSort();
				
			}
		});
		btnDisplay.setBounds(155, 116, 117, 29);
		contentPane.add(btnDisplay);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(162, 229, 117, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Hs_kiosk_Main f = new Hs_kiosk_Main();
				f.setVisible(true);
				
			}
		});
		
		
		textArea = new JTextArea();
		textArea.setBounds(16, 46, 127, 212);
		contentPane.add(textArea);
		
	}
	
	public void iterationsort()
	{
		int[]iterArray = new int [Hs_kiosk_Main.foodList.size()];
		
		for(int i = 0; i<Hs_kiosk_Main.foodList.size();i++)
		{
			iterArray[i] = Hs_kiosk_Main.foodList.get(i).getIteration();
		}
		
		for(int k = iterArray.length; k>0; k--)//smallest to largest
		{
			for(int i = 0; i < k - 1; i++)
			{
			if (iterArray[i] < iterArray[i+1])
			{
				iterArray[i] = iterArray[i] + iterArray[i+1];
				iterArray[i+1] = iterArray[i] - iterArray[i+1];
				iterArray[i] = iterArray[i] - iterArray[i+1];		
			}
			}
		}	
		
		for(int p = 0; p<Hs_kiosk_Main.foodList.size(); p++)
		{
			if(iterArray[0]==Hs_kiosk_Main.foodList.get(p).getIteration())//largest value display
			{
				textField_2.setText(Hs_kiosk_Main.foodList.get(p).getFname() + "");
			}
			if(iterArray[iterArray.length-1]==Hs_kiosk_Main.foodList.get(p).getIteration())//smallest value display
			{
				textField_1.setText(Hs_kiosk_Main.foodList.get(p).getFname() + "");
			}
		}
		
	}
	
	public void priceSort()
	{
		int[]priceArray = new int[Hs_kiosk_Main.foodList.size()];
		
		for(int i = 0; i<Hs_kiosk_Main.foodList.size();i++)
		{
			priceArray[i] = Hs_kiosk_Main.foodList.get(i).getFprice();
		}
		
		for(int k = priceArray.length; k>0; k--)
		{
			for(int i = 0; i < k - 1; i++)
			{
			if (priceArray[i] > priceArray[i+1])
			{
				priceArray[i] = priceArray[i] + priceArray[i+1];
				priceArray[i+1] = priceArray[i] - priceArray[i+1];
				priceArray[i] = priceArray[i] - priceArray[i+1];		
			}
			}
		}	
		
		for(int p = 0; p<Hs_kiosk_Main.foodList.size(); p++)
		{
			for(int i = 0; i<Hs_kiosk_Main.foodList.size(); i++)
			{
			if(priceArray[p]==Hs_kiosk_Main.foodList.get(i).getFprice())//Start displaying from smallest price value
			{
				textArea.append(Hs_kiosk_Main.foodList.get(i).getFname() + ": Rs " + Hs_kiosk_Main.foodList.get(i).getFprice() + "\n");
				break;
			}
		}

	}
	
}
}


