package Sutda;

import java.awt.*;

import javax.swing.*;

public class SutdaWindow extends JPanel {
	//JPanel[] playerPanel = new JPanel[5];
	PlayerWindow pw;
	JPanel CombiPanel; 
	JButton[] b = new JButton[4]; 
	Image back;
	
	public SutdaWindow()
	{
		
		setLayout(null);
		/*for(int i=0;i<5;i++ )
		{
			playerPanel[i] = new JPanel();
			playerPanel[i].setBackground(Color.black);
		}*/
		pw = new PlayerWindow();
		CombiPanel = new JPanel();
		CombiPanel.setBackground(Color.black);
		b[0] = new JButton("방만들기");
		b[1] = new JButton("방들어가기");
		b[2] = new JButton("게임신청");
		b[3] = new JButton("쪽지보내기");
		back = Toolkit.getDefaultToolkit().getImage("c:\\download\\SutdaBack.jpg");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2));
		for(int i=0;i<4;i++)
		{
			//b[i].setIcon(new ImageIcon("c:\\image\\b"+i+".png"));
			p.add(b[i]);
		}
		
		p.setBounds(530,350,250,200);
		/*playerPanel[0].setBounds(10,15,200,150);
		playerPanel[1].setBounds(10,170,200,150);
		playerPanel[2].setBounds(580,15,200,150);
		playerPanel[3].setBounds(580,170,200,150);
		playerPanel[4].setBounds(300,400,200,150);*/
		CombiPanel.setBounds(10,350,250,200);
		pw.setBounds(10,15,200,150);
		/*for(int i=0;i<5;i++)
		{
			add(playerPanel[i]);
		}*/
		
		add(CombiPanel);
		add(p);
		add(pw);
		
	}
	public void paintComponent(Graphics g)
	{
		g.drawImage(back, 0, 0,this);
		setOpaque(false);
	}
}
