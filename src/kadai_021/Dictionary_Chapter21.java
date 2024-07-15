package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	String fruit;
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	public Dictionary_Chapter21(){
		
	  dictionary.put("apple", "リンゴ");
	  dictionary.put("peach","桃");
	  dictionary.put("banana","バナナ");
	  dictionary.put("lemon","レモン");
	  dictionary.put("pear","梨");
	  dictionary.put("kiwi","キウイ");
	  dictionary.put("strawberry","イチゴ");
	  dictionary.put("grape","ブドウ");
	  dictionary.put("muscat","マスカット");
	  dictionary.put("cherry","さくらんぼ");

	}
	
	public void Search(String[] fruit) {
		
		for(int i=0; i<fruit.length; i++) {
			
		this.fruit = fruit[i];
		if(dictionary.containsKey(this.fruit)) {
			System.out.println(dictionary.get(this.fruit));	
		}
		else {
			System.out.println("辞書に存在しません");

		}
		}

	}}