package Dungeon;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View
{
    static JFrame window;
    static JPanel titleScreenTitlePanel, titleScreenStartButtonPanel;
    static JLabel titleScreenTitleLabel;
    static JPanel standardScreenPanel, standardButtonPanel;
    static  JLabel standardScreenLabel;
    static JButton standardButton;
    static JButton startButton;
    
   static Font titleScreenFont = new Font("Garamond", Font.BOLD, 50);
    static Font standardFont = new Font("Garamond", Font.PLAIN, 32);
    
    public static void createTitleView()
    {
	//main window
	window = new JFrame();
	window.setSize(1200, 800);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.getContentPane().setBackground(Color.black);
	
	
	
	
	//TitleScreen
	    titleScreenTitlePanel = new JPanel();
	    titleScreenTitlePanel.setBounds(0, 100, 1200, 800);
	    titleScreenTitlePanel.setBackground(Color.black);
	    titleScreenTitleLabel = new JLabel("DUNGEON ADVENTURE: Quest for the 4 Pillars");
	    titleScreenTitleLabel.setForeground(Color.white);
	    titleScreenTitleLabel.setFont(titleScreenFont);
	    titleScreenTitlePanel.add(titleScreenTitleLabel);
	   
	    
	 //startGameButton
	    titleScreenStartButtonPanel = new JPanel();
	    titleScreenStartButtonPanel.setBounds(0, 0, 200, 200);
	    titleScreenStartButtonPanel.setBackground(Color.black);
	    startButton = new JButton("Enter the Dungeon");
	    startButton.setBackground(Color.DARK_GRAY);
	    startButton.setForeground(Color.red);
	    startButton.setFont(standardFont);
	    startButton.setFocusPainted(false);
	    titleScreenStartButtonPanel.add(startButton);
	    
	    window.add(titleScreenTitlePanel);
	    window.add(titleScreenStartButtonPanel);
	    
	    window.setVisible(true);
	}
    public static void createStandardView()
    {
	//main window
	window = new JFrame();
	window.setSize(1200, 800);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.getContentPane().setBackground(Color.black);
	
	
	
	
	//standScreen
	standardScreenPanel = new JPanel();
	standardScreenPanel.setBounds(0, 0, 1200, 800);
	standardScreenPanel.setBackground(Color.black);
	standardScreenLabel = new JLabel("STANDARDS OUTPUT");
	standardScreenLabel.setForeground(Color.white);
	standardScreenLabel.setFont(titleScreenFont);
	standardScreenPanel.add(standardScreenLabel);
	   
	    
	 //standardGameButton
	    standardButtonPanel = new JPanel();
	    standardButtonPanel .setBounds(0, 0, 800, 800);
	    standardButtonPanel .setBackground(Color.black);
	    standardButton = new JButton("Enter the Dungeon");
	    standardButton.setBackground(Color.DARK_GRAY);
	    standardButton.setForeground(Color.red);
	    standardButton.setFont(standardFont);
	    standardButton.setFocusPainted(false);
	    standardButtonPanel.add(standardButton);
	    
	    window.add(standardScreenPanel);
	    window.add(standardButtonPanel);
	    
	    window.setVisible(true);
	}
    
    
}
