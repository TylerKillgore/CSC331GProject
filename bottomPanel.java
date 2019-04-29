import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class bottomPanel extends JPanel{
	private JButton clear;
	private JRadioButton difficultViewOption;
	private JButton displayStats;
	
	public bottomPanel() {
		setLayout(new GridLayout(2,2));
		
		
		clear = new JButton("Clear Display Button");
		
		displayStats = new JButton("Display Statistics");
		
		//String[] mostDiff = {"Most Difficult Level"};
				difficultViewOption = new JRadioButton("Most Difficult");
		
		//add buttons
		add(clear);
		add(new StatsOptionsPanel());
		add(displayStats);
		add(difficultViewOption);
		
		
	}

}
