import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

	JButton deposit, withdrawl, miniStatement, fastcash, balanceEnquiry, pinChange, exit;
	String pinNumber;
	Transactions(String pinNumber){
		this.pinNumber = pinNumber;
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);

		JLabel text = new JLabel("Please select your Transactions");
		text.setBounds(210, 300, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);

		deposit = new JButton("Deposit");
		deposit.setBounds(170, 415, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);

		withdrawl = new JButton("Cash Withdrawl");
		withdrawl.setBounds(355, 415, 150, 30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);

		fastcash = new JButton("Fast Cash");
		fastcash.setBounds(170, 450, 150, 30);
		fastcash.addActionListener(this);
		image.add(fastcash);

		miniStatement = new JButton("Mini Statement");
		miniStatement.setBounds(355, 450, 150, 30);
		miniStatement.addActionListener(this);
		image.add(miniStatement);

		pinChange = new JButton("Pin Change");
		pinChange.setBounds(170, 485, 150, 30);
		pinChange.addActionListener(this);
		image.add(pinChange);

		balanceEnquiry = new JButton("Balance Enquiry");
		balanceEnquiry.setBounds(355, 485, 150, 30);
		balanceEnquiry.addActionListener(this);
		image.add(balanceEnquiry);

		exit = new JButton("Exit");
		exit.setBounds(355, 520, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exit){
			System.exit(0);
		}
	}


	public static void main(String[] args) {
		new Transactions("");
	}
}
