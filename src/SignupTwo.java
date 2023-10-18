import java.awt.*;//to use color
import javax.swing.*;//to use frames
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

	JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField, pan, aadhar;
	JButton next;
	JRadioButton syes, sno, eyes, eno;
	JComboBox religion, category, income, education, occupation;
	String formno;
	SignupTwo(String formno){
		
		this.formno = formno;
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

		JLabel additionalDetails = new JLabel("Page 1: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);

		//labels and textfields
		JLabel name = new JLabel("Religion: ");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);

		String[] ValReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
		religion = new JComboBox(ValReligion);
		religion.setBackground(Color.WHITE);
		religion.setBounds(300, 140, 400, 30);
		add(religion);

		JLabel fname = new JLabel("Category: ");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);

		String[] valCategory = {"General", "OBC", "SC", "ST", "Others"};
		category = new JComboBox(valCategory);
		category.setBackground(Color.WHITE);
		category.setBounds(300, 190, 400, 30);
		add(category);

		JLabel dob = new JLabel("Income: ");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);

		String[] valIncome = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "< 10, 00, 000", "Upto 10,00,000"};
		income = new JComboBox(valIncome);
		income.setBackground(Color.WHITE);
		income.setBounds(300, 240, 400, 30);
		income.setForeground(new Color(105, 105, 105));
		add(income);


		JLabel gender = new JLabel("Educational");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);


		JLabel email = new JLabel("Qualification: ");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 315, 200, 30);
		add(email);

		String[] educationValues = {"Non Graduate", "Graduate", "Post Graudation", "Doctrate", "Other"};
		education = new JComboBox(educationValues);
		education.setBackground(Color.WHITE);
		education.setBounds(300, 315, 400, 30);
		education.setForeground(new Color(105, 105, 105));
		add(education);

		JLabel marital = new JLabel("Occupation: ");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);

		String[] occupationValues = {"Salaried", "Self-employed", "Business Man", "Student", "Retired", "Others"};
		occupation = new JComboBox(occupationValues);
		occupation.setBackground(Color.WHITE);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setForeground(new Color(105, 105, 105));
		add(occupation);
		

		JLabel address = new JLabel("PAN Number: ");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);

		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD, 14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		

		JLabel city = new JLabel("Aadhar Number: ");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);

		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);

		JLabel state = new JLabel("Senior Citizen: ");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);

		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.WHITE);
		add(syes);

		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setBackground(Color.WHITE);
		add(sno);

		ButtonGroup YN = new ButtonGroup();
		YN.add(syes);
		YN.add(sno);
	

		JLabel pincode = new JLabel("Existing Account: ");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);


		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.WHITE);
		add(eyes);

		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setBackground(Color.WHITE);
		add(eno);

		ButtonGroup EYN = new ButtonGroup();
		EYN.add(eyes);
		EYN.add(eno);

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
	
		String sReligion = (String) religion.getSelectedItem();
		String sCategory =  (String) category.getSelectedItem();
		String sIncome =  (String) income.getSelectedItem();
		String sEducation =  (String) education.getSelectedItem();
		String sOccupation = (String) occupation.getSelectedItem();
		String seniorCitizen = null;

		if(syes.isSelected()){
			seniorCitizen = "Yes";
		}else if(sno.isSelected()){
			seniorCitizen = "No";
		}

		String existingAccount = null;
		if(eyes.isSelected()){
			existingAccount = "Yes";
		}else if(eno.isSelected()){
			existingAccount = "No";
		}
 
		String sPan = pan.getText();
		String sAadhar = aadhar.getText();

		try {
				Conn c = new Conn();
				String query = "insert into signuptwo values ('" +formno+ "', '" +sReligion+ "', '" +sCategory+ "', '" +sIncome+ "', '" +sEducation+ "', '" +sOccupation+ "', '" +sPan+ "', '" +sAadhar+ "', '" +seniorCitizen+ "', '" +existingAccount+ "')";
				c.s.executeUpdate(query);


				//signup 3 frame

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		new SignupTwo("");
	}
}
