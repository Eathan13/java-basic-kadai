package kadai_015;

	//設計図クラス、車を作成
	class Car_Chapter15 {
		//①属性(=変数の宣言)
		//1速から5速のギアを表す
		private int gear = 1; //初期値1速
		private int nowGear = 1;  //ギアチェンジ前
		//ギアチェンジ後の速度を表す
		private int speed = 10; //初期値10km

		//②操作(=メソッドの定義)
		//ギアチェンジと速度を定義
		public void gearChange(int afterGear) {
			gear = afterGear;
			//用途：ギアの値により速度を変える
			switch(this.gear) {
				case 1:
					this.speed = 10;
					break; //速度制限
				case 2:
					this.speed = 20;
					break;
				case 3:
					this.speed = 30;
					break;
				case 4:
					this.speed = 40;
					break;
				case 5:
					this.speed = 50;
					break;
				default: //上記以外のギア
					this.speed = 10;
				}
			}
			//用途：ギアチェンジ後の速度を表示する
			public void run() { //引数なし
				System.out.println("ギア" + nowGear + "から" + this.gear + "に切り替えました");
				System.out.println("速度は時速" + this.speed + "kmです");
			}
	}
