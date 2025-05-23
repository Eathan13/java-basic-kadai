package kadai_021;
import java.util.HashMap;

// 辞書を定義
public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary = new HashMap<String, String>();

    // 辞書データ(英単語)
    public Dictionary_Chapter21() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 辞書を検索
    public void search(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println(word + "の意味は" + dictionary.get(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
    }
}