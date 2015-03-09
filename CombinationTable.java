package Sutda;

import java.util.HashMap;

public class CombinationTable {
	// Á· º¸ 
	static final int P_KWANG_3_8=11; // 38±¤¶¯ : 3±¤+8±¤
	static final int P_TWIN_KWANG=12; // ±¤¶¯ : 1±¤+3±¤ or 1±¤+8±¤ 
	static final int P_TWIN_10=13; // Àå¶¯ : 10¿ù+10¿ù
	static final int P_TWIN_9=14; // ±¸¶¯
	static final int P_TWIN_8=15; // ÆÈ¶¯
	static final int P_TWIN_7=16; // Ä¥¶¯
	static final int P_TWIN_6=17; // À°¶¯
	static final int P_TWIN_5=18; // ¿À¶¯
	static final int P_TWIN_4=29; // »ç¶¯
	static final int P_TWIN_3=20; // »ï¶¯
	static final int P_TWIN_2=21; // ÀÌ¶¯
	static final int P_TWIN_1=22; // »æ¶¯ : 1¿ù+1¿ù
	static final int P_1_2=23; // ¾Ë¸® : 1¿ù+2¿ù
	static final int P_1_4=24; // µ¶»ç(»ç»æ) : 1¿ù+4¿ù
	static final int P_1_9=25; // ±¸»æ : 1¿ù+9¿ù
	static final int P_1_10=26; // Àå»æ : 1¿ù+10¿ù
	static final int P_4_10=27; // Àå»ç : 4¿ù+10¿ù
	static final int P_4_6=28; // ¼¼·ú :4¿ù +6¿ù
	static final int P_SUM_9=29; // °©¿À(9³¡) : 2ÆÐÀÇ ÇÕÀÇ ³¡¼ö°¡ 9
	static final int p_SUM_8=30; // 8²ý
	static final int p_SUM_7=31; // ²ý
	static final int p_SUM_6=32; // ²ý
	static final int p_SUM_5=33; // ²ý
	static final int p_SUM_4=34; // ²ý
	static final int p_SUM_3=35; // ²ý
	static final int p_SUM_2=36; // ²ý
	static final int p_SUM_1=37; // ²ý
	static final int p_SUM_0=38; // ²ý
	// Æ¯¼ö±â´É Á·º¸ 
	static final int P_3_7=1; // ¶¯ÀâÀÌ : ±¤¶¯, 38±¤¶¯ÀÌ ¾øÀ» ½Ã¸¦ °¡Á¤ÇÏ¿© ¶¯ÀÌ ÇÑ¸íÀÌ¶óµµ ÀÖÀ» °æ¿ì ¹«Á¶°Ç ÀÌ±ä´Ù 
	static final int P_9_4=2; // ±¸»ç : ¾Ë¸® ÀÌÇÏÀÇ Á·º¸¿Í Àç°æ±â ÇÒ¼ö ÀÖ´Ù.
	static final int P_9_4_0=3; // ¸ÛÅÖ±¸¸® ±¸»ç : 9¿ù°ú 4¿ù ¸ðµÎ ¸ÛÅÖ±¸¸® ÀÏ¶§ ÀÌ Á·º¸¿¡ ¼ÓÇÑ´Ù. Àå¶¯ÀÌÇÏÀÇ Á·º¸¿Í Àç°æ±â¸¦ ÇÒ ¼ö ÀÖ´Ù 
	static final int P_4_7=4; // ¾ÏÇà¾î»ç : 38±¤¶¯ÀÌ ¾ø°í 13-18±¤¶¯ÀÌ ÀÖÀ» °æ¿ì ½Â¸®
	
	static HashMap map = new HashMap();  // <key Å¬·¡½º, value Å¬·¡½º>
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
