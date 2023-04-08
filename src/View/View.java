package View;

import javax.swing.JFrame;
import javax.swing.JButton;

public class View extends JFrame{
	public View() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(86, 73, 89, 23);
		getContentPane().add(btnNewButton);
	}
	public void ShowWindow()
	{
		this.setVisible(true);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		
	}
}
