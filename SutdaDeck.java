package Sutda;

public class SutdaDeck {
	final int Card_Num = 20;
	
	SutdaCard[] cards = new SutdaCard[Card_Num];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i; 
			
			//boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			//i가 10보다 작은 경우일때만 1,3,8이 광이되도록 한다.
			cards[i] = new SutdaCard(num);
		}
		
	}
	public void shuffle()
	{
		int[] data = new int[20];
		int su = 0;
		
		boolean bDash = false;
		for(int i=0;i<data.length;i++){
			bDash=true;
			while(bDash){
				su = (int)(Math.random()*20);
				bDash = false;
				for(int j=0;j<i;j++){
					if(su==data[j])
					{
						bDash = true;
						break;
					}
				}
			}
			data[i] = su;
		}//0~19까지의 중복 없는 무작위 난수를 data배열에 저장
		
		for(int i=0;i<data.length;i++)
		{	//data배열에 들어간 무작위 값의 위치의 cards객체를 i번째 cards객체와 스왑
			SutdaCard temp = cards[i];
			cards[i] = cards[data[i]];
			cards[data[i]] = temp;
		}
	}
	
	public SutdaCard[] pick(int index)
	{
		SutdaCard[] pair= new SutdaCard[2];
		pair[0]=cards[index];
		pair[1]=cards[index+1];
		return pair;
	}
	
}
