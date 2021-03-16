package Gruver.Heather.Chapter7.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField txtNumerator;
	private JTextField txtDenominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtNumerator = new JTextField();
		txtNumerator.setText("numerator");
		txtNumerator.setBounds(6, 123, 130, 26);
		panel.add(txtNumerator);
		txtNumerator.setColumns(10);
		
		txtDenominator = new JTextField();
		txtDenominator.setToolTipText("");
		txtDenominator.setText("denominator");
		txtDenominator.setBounds(6, 46, 130, 26);
		panel.add(txtDenominator);
		txtDenominator.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("result");
		lblNewLabel.setBounds(29, 89, 61, 16);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		
		btnNewButton.setBounds(0, 0, 117, 29);
		panel.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			double numerator = Double.parseDouble(txtNumerator.getText());
			double denominator = Double.parseDouble(txtDenominator.getText());
			
			SimpleMath simpleMath = new SimpleMath();
			Double result = simpleMath.divide(numerator, denominator);
			
			try {
				lblNewLabel.setText(result.toString());
			} catch(ArithmeticException k) {
				lblNewLabel.setText("Cannot divide by 0");
			}
			}
		});
	}
}
