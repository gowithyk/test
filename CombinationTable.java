package Sutda;

import java.util.HashMap;

public class CombinationTable {
	// �� �� 
	static final int P_KWANG_3_8=11; // 38���� : 3��+8��
	static final int P_TWIN_KWANG=12; // ���� : 1��+3�� or 1��+8�� 
	static final int P_TWIN_10=13; // �嶯 : 10��+10��
	static final int P_TWIN_9=14; // ����
	static final int P_TWIN_8=15; // �ȶ�
	static final int P_TWIN_7=16; // ĥ��
	static final int P_TWIN_6=17; // ����
	static final int P_TWIN_5=18; // ����
	static final int P_TWIN_4=29; // �綯
	static final int P_TWIN_3=20; // �ﶯ
	static final int P_TWIN_2=21; // �̶�
	static final int P_TWIN_1=22; // �涯 : 1��+1��
	static final int P_1_2=23; // �˸� : 1��+2��
	static final int P_1_4=24; // ����(���) : 1��+4��
	static final int P_1_9=25; // ���� : 1��+9��
	static final int P_1_10=26; // ��� : 1��+10��
	static final int P_4_10=27; // ��� : 4��+10��
	static final int P_4_6=28; // ���� :4�� +6��
	static final int P_SUM_9=29; // ����(9��) : 2���� ���� ������ 9
	static final int p_SUM_8=30; // 8��
	static final int p_SUM_7=31; // ��
	static final int p_SUM_6=32; // ��
	static final int p_SUM_5=33; // ��
	static final int p_SUM_4=34; // ��
	static final int p_SUM_3=35; // ��
	static final int p_SUM_2=36; // ��
	static final int p_SUM_1=37; // ��
	static final int p_SUM_0=38; // ��
	// Ư����� ���� 
	static final int P_3_7=1; // ������ : ����, 38������ ���� �ø� �����Ͽ� ���� �Ѹ��̶� ���� ��� ������ �̱�� 
	static final int P_9_4=2; // ���� : �˸� ������ ������ ���� �Ҽ� �ִ�.
	static final int P_9_4_0=3; // ���ֱ��� ���� : 9���� 4�� ��� ���ֱ��� �϶� �� ������ ���Ѵ�. �嶯������ ������ ���⸦ �� �� �ִ� 
	static final int P_4_7=4; // ������ : 38������ ���� 13-18������ ���� ��� �¸�
	
	static HashMap map = new HashMap();  // <key Ŭ����, value Ŭ����>
	CombinationTable() {
		map.put("3-8",P_KWANG_3_8);
		map.put("1-3",P_TWIN_KWANG);
		map.put("1-8",P_TWIN_KWANG);
		map.put("10-20",P_TWIN_10);
		map.put("9-19",P_TWIN_9);
		map.put("8-18",P_TWIN_8);
		map.put("7-17",P_TWIN_7);
		map.put("6-16",P_TWIN_6);
		map.put("5-15",P_TWIN_5);
		map.put("4-14",P_TWIN_4);
		map.put("3-13",P_TWIN_3);
		map.put("2-12",P_TWIN_2);
		map.put("1-11",P_TWIN_1);
		map.put("1-11",P_TWIN_1);
		map.put("1-2",P_1_2);
		map.put("1-12",P_1_2);
		map.put("11-2",P_1_2);
		map.put("11-12",P_1_2);
		map.put("1-4",P_1_4);
		map.put("1-14",P_1_4);
		map.put("11-4",P_1_4);
		map.put("11-14",P_1_4);
		map.put("1-9",P_1_9);
		map.put("1-19",P_1_9);
		map.put("11-9",P_1_9);
		map.put("11-19",P_1_9);
		map.put("1-10",P_1_10);
		map.put("1-20",P_1_10);
		map.put("11-10",P_1_10);
		map.put("11-20",P_1_10);
		map.put("4-10",P_4_10);
		map.put("4-20",P_4_10);
		map.put("14-10",P_4_10);
		map.put("14-20",P_4_10);
		map.put("4-6",P_4_6);
		map.put("4-16",P_4_6);
		map.put("14-6",P_4_6);
		map.put("14-16",P_4_6);
		map.put("3-17",P_3_7);
		map.put("13-7",P_3_7);
		map.put("13-7",P_3_7);
		map.put("13-17",P_3_7);
		map.put("4-19",P_9_4);
		map.put("14-9",P_9_4);
		map.put("14-19",P_9_4);
		map.put("4-9",P_9_4_0);
		map.put("4-7",P_4_7);
	}
	

}
