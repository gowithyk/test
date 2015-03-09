package Sutda;

public class Player {
	private static int entry=4;
	SutdaCard[] pair=new SutdaCard[2]; // �Ҵ� ���� ��, 1��:1,11 2��:2,12 ... 10��:10,20
	//int[] card=new int[2];
	private int pos_x=0,pos_y=0; // ȭ����� ��ġ ����
	private boolean toOpen=true; // �и� ������ ������ �� ������ ����
	private int combination=0;
	private int rank=0; // boolean winner;
	private int gameCount, win, lose, giveUp; // ���� Ƚ��:gameCount, �̱� Ƚ��:win, �й��� Ƚ��:lose, ������ Ƚ��:giveUp

	String[] comment={"Olleh","Oops","Well","Terrible"};
	Player() {
		//entry++;
	}
	
		
	public static int getEntry() {
		return entry;
	}


	public static void setEntry(int entry) {
		Player.entry = entry;
	}


	public SutdaCard[] getPair() {
		return pair;
	}


	public void setPair(SutdaCard[] pair) {
		this.pair = pair;		
	}


	/*public int getWindowPosition() {
		return windowPosition;
	}


	public void setWindowPosition(int position) {
		this.windowPosition = position;
	}
*/

	public boolean isToOpen() {
		return toOpen;
	}


	public void setToOpen(boolean toOpen) {
		this.toOpen = toOpen;
	}

	
	public int getCombination() {
		return combination;
	}


	public void setCombination(int combination) {
		
		this.combination = combination;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public int getGameCount() {
		return gameCount;
	}


	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}


	public int getWin() {
		return win;
	}


	public void setWin(int win) {
		this.win = win;
	}


	public int getLose() {
		return lose;
	}


	public void setLose(int lose) {
		this.lose = lose;
	}


	public int getGiveUp() {
		return giveUp;
	}


	public void setGiveUp(int giveUp) {
		this.giveUp = giveUp;
	}


	public String[] getComment() {
		return comment;
	}


	public void setComment(String[] comment) {
		this.comment = comment;
	}
}
