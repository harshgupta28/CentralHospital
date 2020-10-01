//SpringCore
// class name - LoginPage
package centralHospital;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() 
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		Color colorBackground = new Color(0, 51, 102);
		contentPane.setBackground(colorBackground);
		
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setBounds(306, 168, 172, 55);
		contentPane.add(loginLabel);
		
		JLabel userNameLabel ;
		userNameLabel = new JLabel("Username(Mobile.no)");
		userNameLabel.setForeground(Color.WHITE);
		userNameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		userNameLabel.setBounds(208, 229, 169, 39);
		contentPane.add(userNameLabel);
		
	    JTextField usernameField ;
	    usernameField = new JTextField();
	    usernameField.setColumns(10);
	    usernameField.setBounds(208, 266, 270, 32);
		contentPane.add(usernameField);
	
	   
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		passwordLabel.setBounds(208, 308, 169, 29);
		contentPane.add(passwordLabel);
		
		JPasswordField passwordField ;
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 334, 270, 32);
		contentPane.add(passwordField);
		
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(Color.WHITE);
		loginButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		loginButton.setBounds(296, 391, 81, 32);
		contentPane.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String username = usernameField.getText();
				String password = String.valueOf(passwordField.getPassword());
				if(username.equals("username") && password.equals("password"))
				{
					JOptionPane.showMessageDialog(contentPane,"Successfully Logined");  
					dispose();
					new Interface1().setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(contentPane,"Invalid username or password");  
				
			}
		});
		
		JLabel line2 = new JLabel("Don't have a account ? ");
		line2.setForeground(Color.WHITE);
		line2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		line2.setBounds(272, 433, 149, 29);
		contentPane.add(line2);
		
		JButton signUpButton = new JButton("Sign up");
		signUpButton.setForeground(Color.WHITE);
		signUpButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		signUpButton.setBackground(colorBackground);
		signUpButton.setBounds(296, 461, 83, 29);
		contentPane.add(signUpButton);
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//contentPane.setBackground(Color.YELLOW);
				new RegistrationPage().setVisible(true);
				
				dispose();
			}
		});
		
		  
	}
}
