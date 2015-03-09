package Sutda;

import java.awt.*;

import javax.swing.*;

public class PlayerWindow extends JPanel{
	JPanel PWPanel;
	JLabel pa;//= new ImageIcon("c:\\download\\m1.jpg");
	public PlayerWindow()
	{
		ImageIcon icon = new ImageIcon("c:\\download\\m1.jpg");
		PWPanel=new JPanel();
		pa = new JLabel("",icon,JLabel.EAST);
		//pa.setIcon(icon);
		PWPanel.setLayout(null);
		
		//pa.setBounds(0,0,100,150);
		PWPanel.add(pa);
		add(PWPanel);		
	}	
}
