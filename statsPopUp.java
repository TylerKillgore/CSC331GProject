package guessingGame;

import javax.swing.JFrame;


public class statsPopUp extends frontEnd{

	public statsPopUp(String title) {
		super(title);
		JFrame frame = new JFrame("Stats Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
