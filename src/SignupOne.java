import java.awt.*;//to use color
import java.util.*;//to use random 
import javax.swing.*;//to use frames
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{

	long random;
	JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
	JButton next;
	JDateChooser dateChooser;
	JRadioButton male, female, other, married, unmarried;
	SignupOne(){
		
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

		Random ran = new Random();
    	long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

		JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);

		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);

		//labels and textfields
		JLabel name = new JLabel("Name: ");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);

		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		JLabel fname = new JLabel("Father's Name: ");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);

		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);

		JLabel dob = new JLabel("Date of Birth: ");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);

		JLabel gender = new JLabel("Gender: ");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(Color.WHITE);
		add(female);

		//it will handle the selection of multiple radio buttons
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);



		JLabel email = new JLabel("Email: ");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);

		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);

		JLabel marital = new JLabel("Marital Status: ");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);

		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);

		other = new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.WHITE);
		add(other);

		//it will handle the selection of multiple radio buttons
		ButtonGroup maritalGroup = new ButtonGroup();
		maritalGroup.add(married);
		maritalGroup.add(unmarried);
		maritalGroup.add(other);
		

		JLabel address = new JLabel("Address: ");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);

		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);

		JLabel city = new JLabel("City: ");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);

		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);

		JLabel state = new JLabel("State: ");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);

		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);

		JLabel pincode = new JLabel("Pin Code: ");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);

		pincodeTextField = new JTextField();
		pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pincodeTextField.setBounds(300, 590, 400, 30);
		add(pincodeTextField);


		JButton next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);


		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

	public void actionPerformed(ActionEvent ae){
		String formno = "" + random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob =  ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;

		if(male.isSelected()){
			gender = "Male";
		}else if(female.isSelected()){
			gender = "Female";
		}

		String email = emailTextField.getText();
		String marital = null;
		if(married.isSelected()){
			marital = "Married";
		}else if(unmarried.isSelected()){
			marital = "Unmarried";
		}else if(other.isSelected()){
			marital = "Other";
		}

		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pincodeTextField.getText();


		try {
			if(name.equals("")){
				JOptionPane.showMessageDialog(null, "Name is required");//validation for name field
			}else{
				Conn c = new Conn();
				String query = "insert into signup values ('" +formno+ "', '" +name+ "', '" +fname+ "', '" +dob+ "', '" +gender+ "', '" +email+ "', '" +address+ "', '" +city+ "', '" +pin+ "', '" +state+ "', '" +marital+ "')";
				c.s.executeUpdate(query);

				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		new SignupOne();
	}
}
