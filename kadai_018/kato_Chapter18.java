package kadai_018;
	//親クラス
	public abstract class kato_Chapter18 {
		//属性、親クラス
		public String familyName = "加藤"; //姓
		public String givenName; //名
		public String address = "東京都中野区〇×"; //住所
		//操作、メソッド
		public void commonIntroduce() { //共通の紹介を出力
			System.out.println("名前は"+ familyName + givenName +"です");
			System.out.println("住所は"+ address+ "です");	
		}
		public abstract void eachIntroduce(); //個別の紹介を出力
		
		public void execIntroduce() { //紹介を実行
			commonIntroduce(); //共通
			eachIntroduce(); //個別
			System.out.println(); //改行
		}
	}