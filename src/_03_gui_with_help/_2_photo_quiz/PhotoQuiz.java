package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String imageURL = "https://pbs.twimg.com/profile_images/1414439092373254147/JdS8yLGI_400x400.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image = createImage(imageURL);
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String input = JOptionPane.showInputDialog("What company does that man own?");
		// 7. print "CORRECT" if the user gave the right answer
		if(input.equalsIgnoreCase("microsoft")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		imageURL = "https://res.cloudinary.com/sagacity/image/upload/c_crop,h_800,w_643,x_0,y_0/c_scale,w_640/v1397420398/space-needle-seattle_udup63.jpg";
		image = createImage(imageURL);
		// 11. add the second image to the quiz window
		quizWindow.add(image);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		input = JOptionPane.showInputDialog("What US state is this monument located in?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(input.equalsIgnoreCase("washington") || input.equalsIgnoreCase("washington state") || input.equalsIgnoreCase("WA")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		
		quizWindow.remove(image);
		imageURL = "https://mappingthejourney.com/wp-content/uploads/2017/08/james_gosling.jpg";
		image = createImage(imageURL);
		quizWindow.add(image);
		quizWindow.pack();
		input = JOptionPane.showInputDialog("What coding language did this man create?");
		if(input.equalsIgnoreCase("Java")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		
		JOptionPane.showMessageDialog(null, "Your score was a " + score + " out of a possible 3.");
		
		System.exit(0);
		
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
