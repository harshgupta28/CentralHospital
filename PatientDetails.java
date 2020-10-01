//SpringFramework
// class name - PatientDetails
package centralHospital;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PatientDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDetails frame = new PatientDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public PatientDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(new Color(175, 238, 238));
		
		
		JLabel lblNewLabel = new JLabel("Patient's Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(245, 36, 208, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(39, 163, 93, 25);
		contentPane.add(lblNewLabel_1);
		
		JTextField textField;
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBounds(274, 165, 225, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Department");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(37, 440, 179, 40);
		contentPane.add(lblNewLabel_2);
		
		JComboBox doctorsComboBox = new JComboBox();
		doctorsComboBox.setBounds(274, 537, 225, 32);
		contentPane.add(doctorsComboBox);
		doctorsComboBox.disable();
		
		String[] departementList = { "Dental" , "ENT" , "General Surgery" , 
									"General Medicine" , "Cardiology" , "Psychiatry" ,
									"Gynaecology & Obstetrics" };
		
		JComboBox departementComboBox = new JComboBox(departementList);
		departementComboBox.setForeground(Color.BLACK);
		departementComboBox.setSelectedItem(null);
		departementComboBox.setBounds(274, 446, 225, 32);
		contentPane.add(departementComboBox);
		departementComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				doctorsComboBox.enable();
				String dpmt = departementComboBox.getSelectedItem().toString();
				doctorsComboBox.removeAllItems();

				if(dpmt.equals("Dental"))
				{
					doctorsComboBox.addItem("Dr. VINAY TIWARI");
					doctorsComboBox.addItem("Dr. VIKAS KATIYAR");
				}
				else if(dpmt.equals("ENT"))
				{
					doctorsComboBox.addItem("Dr. SUSHMA PANDEY");
					doctorsComboBox.addItem("Dr. KRISHNA GUPTA");
				}
				else if(dpmt.equals("General Surgery"))
				{
					doctorsComboBox.addItem("Dr. AARTI AGARWAL");
					doctorsComboBox.addItem("Dr.GAURI");
					doctorsComboBox.addItem("DR.DP SINGHANIA");
				}
				else if(dpmt.equals("General Medicine"))
				{
					doctorsComboBox.addItem("Dr.JP");
					doctorsComboBox.addItem("Dr.MAHESH");
					doctorsComboBox.addItem("Dr.ALOK DUBEY");
				}
				else if(dpmt.equals("Cardiology"))
					doctorsComboBox.addItem("Dr.KIRTI");
				else if(dpmt.equals("Psychiatry"))
					doctorsComboBox.addItem("Dr.ANAND TYAGI");
				else if(dpmt.equals("Gynaecology & Obstetrics"))
					doctorsComboBox.addItem("Dr.ALIA ALI");
		
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel(" Availability");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(36, 601, 180, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Patient's Age");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(44, 252, 127, 62);
		contentPane.add(lblNewLabel_4);
		
		Button button = new Button("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setBounds(248, 673, 148, 32);
		contentPane.add(button);
		JRadioButton one = new JRadioButton("0 - 12  yrs.");
		JRadioButton two = new JRadioButton("13 - 50 yrs.");
		JRadioButton three = new JRadioButton("above 50 yrs.");
		
		ButtonGroup bg  = new ButtonGroup();
		bg.add(one);
		bg.add(two);
		bg.add(three);
		
		one.setBounds(274, 274, 179, 23);
		contentPane.add(one);
		
		two.setBounds(274, 328, 179, 25);
		contentPane.add(two);
		
		three.setBounds(274, 379, 179, 23);
		contentPane.add(three);
		
		JLabel lblNewLabel_2_1 = new JLabel("Doctor");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(39, 525, 179, 40);
		contentPane.add(lblNewLabel_2_1);
		
		
		
		
	}
}
