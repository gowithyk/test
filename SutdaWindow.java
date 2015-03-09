package Sutda;

import java.awt.*;

import javax.swing.*;

public class SutdaWindow extends JPanel {
	//JPanel[] playerPanel = new JPanel[5];
	PlayerWindow[] pw = new PlayerWindow[5];
	JPanel CombiPanel;
	JTextPane ta;
	JTextField tf;
	JScrollBar bar; 
	JButton[] b = new JButton[4]; 
	Image back;
	
	public SutdaWindow()
	{
		
		setLayout(null);
		for(int i=0;i<5;i++ )
		{
			pw[i] = new PlayerWindow();
		}
		
		CombiPanel = new JPanel();
		CombiPanel.setBackground(Color.black);
		
		ta = new JTextPane();
		JScrollPane js1 = new JScrollPane(ta);
		bar = js1.getVerticalScrollBar(); 
		
		tf = new JTextField(); 		
		
		b[0] = new JButton("콜");
		b[1] = new JButton("다이");
		b[2] = new JButton(" ");
		b[3] = new JButton("나가기");
		back = Toolkit.getDefaultToolkit().getImage("c:\\download\\SutdaBack.jpg");
		
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(4,1));
		for(int i=0;i<4;i++)
		{
			//b[i].setIcon(new ImageIcon("c:\\image\\b"+i+".png"));
			p1.add(b[i]);
		}		
		
		CombiPanel.setBounds(10,330,270,220);
				
		p1.setBounds(490,400,80,150);
		js1.setBounds(580,330,200,200);
		tf.setBounds(580,530,200,20);
		
		pw[0].setBounds(10,15,200,150);
		pw[1].setBounds(10,170,200,150);
		pw[2].setBounds(580,15,200,150);
		pw[3].setBounds(580,170,200,150);
		pw[4].setBounds(290,400,200,150);
		
		for(int i=0;i<5;i++)
		{
			add(pw[i]);
		}
				
		add(CombiPanel);
		add(js1);
		add(tf);
		add(p1);
		
	}
	public void paintComponent(Graphics g)
	{
		g.drawImage(back, 0, 0,this);
		setOpaque(false);
	}
}
