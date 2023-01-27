package zProject_MineSweeper;

import javax.swing.*;

public class MyFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static MyPanel panel = new MyPanel();
	static gameMenu game = new gameMenu();

	MyFrame(){
		
		JPanel allPanels = new JPanel();
		allPanels.setLayout(new BoxLayout(allPanels, BoxLayout.Y_AXIS));
		allPanels.add(game);
		allPanels.add(panel);
		
		this.add(allPanels);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
}
