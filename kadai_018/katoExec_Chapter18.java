package kadai_018;
	//実行クラス
	public class katoExec_Chapter18 {
		public static void main(String[] args) {
			katoTaro_Chapter18 taro = new katoTaro_Chapter18();
			taro.setGivenName();
			taro.execIntroduce();
			
			katoIchiro_Chapter18 ichiro = new katoIchiro_Chapter18();
			ichiro.setGivenName();
			ichiro.execIntroduce();
			
			katoHanako_Chapter18 hanako = new katoHanako_Chapter18();
			hanako.setGivenName();
			hanako.execIntroduce();
		}
	}