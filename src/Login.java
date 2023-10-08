import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JButton login, signup, clear;
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login(){
		setTitle("Automated Teller Machine"); //set the title for the frame
		setLayout(null); //removing the default layout so that we can add our custom layouts to the frame


		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); //scaling the image size
		ImageIcon i3 = new ImageIcon(i2); // we cannot directly place i2 Image into Jlabel so we have to pass it to ImageIcon then pass.
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100); //setting location for logo after setting layouts to null
		add(label); //adding image to frame

		JLabel text = new JLabel("Welcome to ATM");//setting text to frame
		text.setFont(new Font("Osward", Font.BOLD, 38));//setting font and size 
		text.setBounds(200, 40, 400, 40); //bounds to set location of text
		add(text); //adding text

		JLabel cardNo = new JLabel("Card No: ");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		cardNo.setBounds(120, 150, 400, 30);
		add(cardNo);

		cardTextField = new JTextField(); //created text field for card number
		cardTextField.setBounds(300, 150, 250, 30); //setting bounds to field
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField); //adding text field to the frame

		JLabel pin = new JLabel("PIN: ");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 400, 30);
		add(pin);

		pinTextField = new JPasswordField(); //created text field for card number
		pinTextField.setBounds(300, 220, 250, 30); //setting bounds to field
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField); //adding text field to the frame

		//creating buttons for login frame
		login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);

		clear = new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);

		signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);


		setSize(800, 480); //set the height and width of frame 
		setVisible(true); //frame will be visible if it is true
		setLocation(350, 200); //frame will open at these coordinates 

	}

	//when button is clicked this function will be triggered and we can add functionalities into it
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == clear){
			cardTextField.setText("");
			pinTextField.setText("");
		}else if(ae.getSource() == login){

		}else if(ae.getSource() == signup){

		}
	}

	public static void main(String[] args) {
		new Login(); //as constructor will be invoked while creating the object so we will write our entire code into that constructor
	}
}
