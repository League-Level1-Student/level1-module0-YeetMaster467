package _04_gui_from_scratch._4_cuteness_tv;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public void showButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		button1.setText("Ducks");
		button2.setText("Frog");
		button3.setText("Fluffy Unicorns");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		frame.setTitle("Cuteness TV");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		panel.setVisible(true);
		
	}
}
