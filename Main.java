package Sutda;
//package com.sist;
import java.awt.*;
import java.util.*;
import java.util.HashMap.*;

import javax.swing.*;

import oracle.net.aso.p;
class SutdaGame
{
	static final byte MAX_ENTRY=2;
	CombinationTable ctable=new CombinationTable(); // 족보 테이블 선언
	public void Game()
	{
		SutdaDeck deck = new SutdaDeck();
		//SutdaCard[] user = new SutdaCard[2];
		//SutdaCard[] com = new SutdaCard[2];
		Player[] player=new Player[MAX_ENTRY];
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			deck.shuffle();
			System.out.println("card release");
			
			for (int i = 0; i < player.length; i++) {
				player[i]=new Player();
				player[i].setPair(deck.pick(2*i));

			}
			System.out.println("open >");

			//System.out.print("computer : ");
			for (int i = 0; i < player.length; i++) {
				System.out.print("player"+i+" : ");
				System.out.print(player[i].getPair()[0].getNum() + " ");
				System.out.print(player[i].getPair()[1].getNum() + "\n");
			}
			
			System.out.println("deck >");
			for (int i = 0; i < deck.cards.length; i++) {
				System.out.print(deck.cards[i].getNum() + " ");
			}
			
			System.out.println();
			System.out.println("----------------");
			System.out.println("Combination code >");
			for(int i = 0; i < player.length; i++) {
				player[i].setCombination(CompareWithCombinationTable(player[i].getPair()));
				System.out.println("player:"+i+" :"+player[i].getCombination());
			}
						
			System.out.println();
			System.out.println("play more?");
			System.out.println("1.Yes  2.No");
			int sel = scan.nextInt();
			
			if(sel == 1)
			{
				continue;
			}
			else if(sel == 2)
			{
				System.exit(0);
			}
		}
	}
	
	public int CompareWithCombinationTable(SutdaCard[] pair) {
		
		String key="";
		if(pair[0].getNum()<pair[1].getNum())
			key+=key+pair[0].getNum()+"-"+pair[1].getNum();
		else
			key+=key+pair[1].getNum()+"-"+pair[0].getNum();
		
		int returnVal=-1;
		if(ctable.map.containsKey(key))
			returnVal=(int) ctable.map.get(key);

		else {
			int lastDigitOfSum=(pair[0].getNum()+pair[1].getNum())%10;
			returnVal=(int)(ctable.p_SUM_0)-lastDigitOfSum;
		}
		return returnVal;
	}
}



public class Main extends JFrame{
	SutdaWindow sw = new SutdaWindow();
	public Main()
	{
		setLayout(new CardLayout());
		add("SW",sw);
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("		섯다 게임		 ");		
		System.out.println("=====================");
		System.out.println("1.game start");
		System.out.println("2.quit");
		int sel = scan.nextInt();
		
		if(sel == 1)
		{
			SutdaGame sg = new SutdaGame();
			sg.Game();
		}
		else if(sel == 2)
		{
			System.exit(0);
		}*/
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
		}
		  Main m=new Main();
	}

}
