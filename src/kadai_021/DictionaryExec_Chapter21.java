package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dic = new Dictionary_Chapter21 ();
		
		String[] fruit = { "apple", "banana", "grape", "orange" };
		
	    for(int i=0; i<4; i++) {
	    	dic.Dictionary();
			dic.Search(fruit[i]);
		}
	}

}
