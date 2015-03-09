package Sutda;

import java.awt.*;

import javax.swing.*;

public class PlayerWindow extends JPanel{
	JPanel PWPanel;
	JLabel pa;//= new ImageIcon("c:\\download\\m1.jpg");
	public PlayerWindow()
	{
		PWPanel=new JPanel();
		pa = new JLabel(new ImageIcon("c:\\download\\m1.jpg"));
		pa.setBounds(0,0,100,150);
		PWPanel.add(pa);
		add(PWPanel);
	}
	
}
