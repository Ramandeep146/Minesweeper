package zProject_MineSweeper;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameMenu extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static final int buttonSize = 30;
	
	JButton resetButton;
	
	static Thread timerThread;
	
	gameMenu(){
		
		resetButton = new JButton();
		//resetButton.setPreferredSize(new Dimension(buttonSize,buttonSize));
		resetButton.setBounds(MyPanel.screenW/2-buttonSize/2, 10, buttonSize,buttonSize);
		resetButton.setFont(new Font("Times Roman", Font.BOLD, 10));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		this.add(resetButton);
		
		this.setPreferredSize(new Dimension(MyPanel.screenW,50));
		this.setLayout(null);
		this.setFocusable(true);
		this.setBackground(new Color(60,60,60));
	
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	private void draw(Graphics g) {
		g.setColor(new Color(255,90,90));
		g.setFont(new Font("Times Roman", Font.BOLD, 30));
		
		g.drawString("Bombs: " + MyPanel.numberOfBombs, 10, 35);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == resetButton) {
			MyFrame.panel.reset();
			repaint();
		}
	}

}
