// class name - Interface1
package centralHospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface1 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface1 frame = new Interface1();
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
	public Interface1() {
		getContentPane().setBackground(new Color(216, 191, 216));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0 , 0, 700, 800);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("  A Comprehensive Healthcare..");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(313, 56, 231, 73);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("  +");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 53));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(0, 0, 99, 60);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Central Hospital");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(109, 0, 445, 73);
		getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 84, 685, 666);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("View Status");
		btnNewButton_1.setBounds(215, 397, 231, 40);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton = new JButton("Register Patient");
		btnNewButton.setBounds(215, 241, 231, 40);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//double click the button after that there is  new screen available
				
				new PatientDetails().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}
}