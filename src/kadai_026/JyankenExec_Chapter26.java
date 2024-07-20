package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		jyanken.playGame(jyanken.getMyChoice());
		
	}

}
