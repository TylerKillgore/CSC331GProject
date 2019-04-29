import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TopPanel extends JPanel{
	private JButton start;
	private JTextArea nextGuess;
	private JButton nextGuessButton;
	private TextPanel textPanel;
	
	public TopPanel() {		
		start = new JButton("Start Game Button");
		nextGuessButton = new JButton("Next Guess:");
		nextGuessButton.addActionListener(new nextGuessListener());
		nextGuess = new JTextArea("                          ");
		setLayout(new FlowLayout());
		
		add(start);
		add(nextGuessButton);
		add(nextGuess);

	}
	public void setTextPanel(TextPanel textPanel) {//adds guesses to display area
		this.textPanel = textPanel;
		
	}
	class nextGuessListener implements ActionListener{ 
		public void actionPerformed(ActionEvent ae) {
		String text = nextGuess.getText();
		textPanel.appendText(text);
	}
	}		

}
