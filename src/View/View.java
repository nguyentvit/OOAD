package View;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class View extends JFrame{
	private JTextField textField;
	public View() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(86, 73, 89, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(63, 167, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
	public void ShowWindow()
	{
		this.setVisible(true);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		
	}
}
