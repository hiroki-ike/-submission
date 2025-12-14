package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		Scanner hand = new Scanner(System.in);
		String input;
		do {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			input = hand.next();
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			}else{
				System.out.println("正しい値を入力してください");
			}
		}while(!(input.equals("r") || input.equals("s") || input.equals("p")));
		
		return input;
	}
	public String getRandom() {
		String[] rsp = {"r","s","p"}; 
		String ehand = rsp[(int)(Math.floor(Math.random()*3))];
		return ehand;
	}
	public void playGame(String p1,String p2) {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("r","グー");
		map.put("s","チョキ");
		map.put("p","パー");
		
		System.out.println("自分の手は" + map.get(p1) + "、対戦相手の手は" + map.get(p2));
		if(p1.equals(p2)) {
			System.out.println("あいこです");
		}else if((p1.equals("r") && p2.equals("s"))||(p1.equals("s") && p2.equals("p"))||(p1.equals("p") && p2.equals("r"))){
			System.out.println("自分の勝ちです");
		}else if((p1.equals("r") && p2.equals("p"))||(p1.equals("s") && p2.equals("r"))||(p1.equals("p") && p2.equals("s"))){
			System.out.println("自分の負けです");
		}
	}
}


