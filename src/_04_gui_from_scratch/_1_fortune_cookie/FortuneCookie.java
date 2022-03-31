package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		frame.setTitle("Fortune Teller");
		button.setText("Get Fortune");
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You will gain great wisdom from an unlikley source.");
		}else if(rand==1) {
			JOptionPane.showMessageDialog(null, "You will find love and happiness in the near future.");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will suffer a great loss.");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will find success that will bring you rewards.");
		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "Nothing will really change. Your life will be boring and repetitive.");
		}
	}
}
