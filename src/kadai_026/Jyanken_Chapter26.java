package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	
	public Jyanken_Chapter26() {

	}
	
	
//	自分のじゃんけんの手を入力
	public String getMyChoice() {
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {	
			String choice =scan.next();
	    if(choice.equals("r") || choice.equals("s")|| choice.equals("p")) {
	    	return choice;
	    	}
	    else {
	    	System.err.println("正しく入力してください");
	    	continue;
	    }
	    
	}
	}
	
//	対戦相手のじゃんけんの手をランダムにする
	public String getRandom() {
		
		 String[] hand = {"グー","チョキ","パー"};
		 
		 int n =(int)Math.floor(Math.random()*3);
		 return hand[n];
		 
	}
	
//	じゃんけんを行う
	public void playGame(String myhand) {
		String hand = getRandom();
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("r","グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		System.out.println("自分の手は"+map.get(myhand)+","+"対戦相手の手は"+hand);
		
		if( myhand.equals("r")) {
	    switch(hand) {
	    case "グー" -> System.out.println("あいこです");
	    case "チョキ" -> System.out.println("自分の勝ちです");
	    case "パー" -> System.out.println("自分の負けです");
	    }
	    }
		if( myhand.equals("s")) {
		 switch(hand) {
		    case "グー" -> System.out.println("自分の負けです");
		    case "チョキ" -> System.out.println("あいこです");
		    case "パー" -> System.out.println("自分の勝ちです");
		    }
		    }
		if( myhand.equals("p")) {
		 switch(hand) {
		    case "グー" -> System.out.println("自分の勝ちです");
		    case "チョキ" -> System.out.println("自分の負けです");
		    case "パー" -> System.out.println("あいこです");
		    }
		    }
	}
}

