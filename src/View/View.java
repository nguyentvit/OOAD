package View;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class View extends JFrame{
	private JTextField textField;
	public View() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(230, 122, 89, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(159, 234, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(80, 81, 85, 21);
		getContentPane().add(btnNewButton_1);
	}
	public void ShowWindow()
	{
		this.setVisible(true);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		
	}
}
