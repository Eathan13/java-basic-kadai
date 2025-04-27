package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		//課題では次の4つの英単語の意味を辞書で調べましょう。
		dictionary.search("apple");
		dictionary.search("banana");
		dictionary.search("grape");
		//orangeの意味は辞書に追加されていません。
		dictionary.search("orange");
	}
}