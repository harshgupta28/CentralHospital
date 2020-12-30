package centralHospital;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
					// frame.setBounds(0,0,700,800);
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
	Container c = new Container();

	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		Color colorBackground = new Color(0, 51, 102);
		contentPane.setBackground(colorBackground);

		JLabel createAccLabel = new JLabel("Create Account");
		createAccLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		createAccLabel.setForeground(Color.WHITE);
		createAccLabel.setBounds(259, 20, 172, 55);
		contentPane.add(createAccLabel);

		JLabel lineLabel;
		lineLabel = new JLabel("Get started with your free account");
		lineLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lineLabel.setForeground(Color.WHITE);
		lineLabel.setBounds(220, 59, 258, 45);
		contentPane.add(lineLabel);

		JLabel fullNameLabel;
		fullNameLabel = new JLabel("Full name");
		fullNameLabel.setForeground(Color.WHITE);
		fullNameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		fullNameLabel.setBounds(208, 114, 85, 39);
		contentPane.add(fullNameLabel);

		JTextField fullNameField;
		fullNameField = new JTextField();
		fullNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		fullNameField.setColumns(10);
		fullNameField.setBounds(208, 151, 270, 32);
		contentPane.add(fullNameField);
		String fullName = fullNameField.getText();

		JLabel emailLabel;
		emailLabel = new JLabel("Email address");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		emailLabel.setBounds(208, 188, 128, 27);
		contentPane.add(emailLabel);

		JTextField emailField;
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(208, 229, 270, 32);
		contentPane.add(emailField);
		String email = emailField.getText();

		JLabel mobileLabel = new JLabel("Mobile no.");
		mobileLabel.setForeground(Color.WHITE);
		mobileLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mobileLabel.setBounds(208, 272, 99, 27);
		contentPane.add(mobileLabel);

		JTextField mobileField;
		mobileField = new JTextField();
		mobileField.setColumns(10);
		mobileField.setBounds(208, 309, 270, 32);
		contentPane.add(mobileField);
		String mobile = mobileField.getText();

		JLabel addressLabel = new JLabel("Address");
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		addressLabel.setBounds(208, 361, 99, 13);
		contentPane.add(addressLabel);

		JTextArea addressArea;
		addressArea = new JTextArea();
		addressArea.setBounds(208, 394, 270, 32);
		contentPane.add(addressArea);
		String address = addressArea.getText();

		JLabel dobLabel = new JLabel("DOB");
		dobLabel.setForeground(Color.WHITE);
		dobLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		dobLabel.setBounds(208, 448, 45, 13);
		contentPane.add(dobLabel);

		String[] dateArray = new String[31];
		for (int i = 0; i < 31; i++)
			dateArray[i] = Integer.toString(i + 1);

		JComboBox dateComboBox = new JComboBox();
		dateComboBox.setModel(new DefaultComboBoxModel(dateArray));
		dateComboBox.setMaximumRowCount(5);
		dateComboBox.setBounds(262, 448, 45, 17);
		contentPane.add(dateComboBox);
		String date = dateComboBox.getSelectedItem().toString();

		JComboBox monthComboBox = new JComboBox();
		monthComboBox.setMaximumRowCount(5);
		String [] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December" };
		monthComboBox.setModel(new DefaultComboBoxModel(months));

		String month = monthComboBox.getSelectedItem().toString();

		monthComboBox.setBounds(316, 448, 90, 17);
		contentPane.add(monthComboBox);

		String[] yearArray = new String[121];
		for (int i = 0; i < 121; i++)
			yearArray[i] = Integer.toString(2020 - i);

		JComboBox yearComboBox = new JComboBox();
		yearComboBox.setMaximumRowCount(5);
		yearComboBox.setModel(new DefaultComboBoxModel(yearArray));
		yearComboBox.setBounds(418, 448, 60, 17);
		contentPane.add(yearComboBox);
		String year = yearComboBox.getSelectedItem().toString();

		JLabel genderLabel = new JLabel("Gender");
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		genderLabel.setBounds(208, 489, 60, 13);
		contentPane.add(genderLabel);

		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setForeground(Color.WHITE);
		maleRadioButton.setBackground(colorBackground);
		maleRadioButton.setFont(new Font("Ink Free", Font.PLAIN, 13));
		maleRadioButton.setBounds(275, 485, 61, 25);
		contentPane.add(maleRadioButton);

		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setForeground(Color.WHITE);
		femaleRadioButton.setBackground(colorBackground);
		femaleRadioButton.setFont(new Font("Ink Free", Font.PLAIN, 13));
		femaleRadioButton.setBounds(335, 491, 71, 13);
		contentPane.add(femaleRadioButton);

		JRadioButton otherRadioButton = new JRadioButton("Other");
		otherRadioButton.setForeground(Color.WHITE);
		otherRadioButton.setBackground(colorBackground);
		otherRadioButton.setFont(new Font("Ink Free", Font.PLAIN, 13));
		otherRadioButton.setBounds(406, 491, 72, 13);
		contentPane.add(otherRadioButton);

		ButtonGroup genderButtonGroup = new ButtonGroup();
		genderButtonGroup.add(maleRadioButton);
		genderButtonGroup.add(femaleRadioButton);
		genderButtonGroup.add(otherRadioButton);

		JLabel createPasswordLabel = new JLabel("Create password");
		createPasswordLabel.setForeground(Color.WHITE);
		createPasswordLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		createPasswordLabel.setBounds(208, 513, 169, 29);
		contentPane.add(createPasswordLabel);

		JPasswordField passwordField;
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 552, 270, 32);
		contentPane.add(passwordField);

		JLabel reEnterpasswordLabel = new JLabel("Re-enter password");
		reEnterpasswordLabel.setForeground(Color.WHITE);
		reEnterpasswordLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		reEnterpasswordLabel.setBounds(208, 594, 149, 29);
		contentPane.add(reEnterpasswordLabel);

		JPasswordField reEnterpasswordField;
		reEnterpasswordField = new JPasswordField();
		reEnterpasswordField.setBounds(208, 633, 270, 32);
		contentPane.add(reEnterpasswordField);

		JButton createAccountButton = new JButton("Create Account");
		createAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String gen;
					if (maleRadioButton.isSelected() == true)
						gen = "M";
					else if (femaleRadioButton.isSelected() == true)
						gen = "F";
					else
						gen = "O";
					
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/central_hospital?autoReconnect=true&useSSL=false";
					String username = "root";
					String password = "2802";
					
					// creating connection
					Connection con = DriverManager.getConnection(url, username, password);

					String query = "INSERT INTO central_hospital.user_details(FULL_NAME, EMAIL, CONTACT, DOB, GENDER, PASS_WORD) VALUES(?,?,?,?,?,?)";
				//	String q = "INSERT INTO central_hospital.user_details(FULL_NAME, EMAIL, CONTACT, DOB, GENDER, PASS_WORD) VALUES(?,?,?,?,?,?)";
					PreparedStatement pstmt = con.prepareStatement(query);
					// set the values to query
					pstmt.setString(1, fullNameField.getText());
					pstmt.setString(2, emailField.getText());
					pstmt.setString(3, mobileField.getText());

					int i;
						for(i=0;i<months.length;i++)
							if(month.equals(months[i]))
								break;
							
					pstmt.setString(4, year + "-" + i+1 + "-"+ date);
					pstmt.setString(5, gen);
					pstmt.setString(6, String.valueOf(passwordField.getPassword()));
					
					
//					pstmt.setString(4, "2000-02-28");

					pstmt.executeUpdate();
					con.close();

					JOptionPane.showMessageDialog(contentPane, "Successfully Registered");
					dispose();
					new LoginPage().setVisible(true);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(contentPane, "Invalid Details");
				}

			}
		});
		createAccountButton.setBackground(Color.WHITE);
		createAccountButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		createAccountButton.setBounds(259, 676, 160, 43);
		contentPane.add(createAccountButton);

		JLabel line2 = new JLabel("All fields are madatory .");
		line2.setForeground(Color.WHITE);
		line2.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		line2.setBounds(282, 729, 149, 29);
		contentPane.add(line2);

	}
}
