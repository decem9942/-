package curriculumA;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte byteVar;
		short shortVar;
		int intVar;
		long longVar;

		float floatVar;
		double doubleVar;

		char charVar;
		String stringVar;

		boolean booleanVar;
		
	// Qes2それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 byteVar = 0;
		 shortVar = 0;
		 intVar = 0;
		 longVar = 0L;

	     floatVar = 0.0f;
		 doubleVar = 0.0;

		 charVar = '\u0000'; 
		 stringVar = "null"; 
		
		 booleanVar = false;
		 
     // Qes3 初期化をしたそれぞれの変数に下記の値を代入してください
         byteVar = 10;

         shortVar = 1000;

         intVar = 100000;

         longVar = 10000000000L;

         floatVar = 3.14f;

         doubleVar = 2.71828;

         charVar = 'A';

         stringVar = "こんにちは";

         booleanVar = true;
         
         //Qes4  下記の通りにコンソール出力されるようにしてください
               //上記で作成した変数を必ず使用すること
         System.out.println(byteVar + shortVar / 100 + intVar / 10000);

         // 2行目：20
         System.out.println(byteVar * 2);

         // 3行目：a ハロー true
         System.out.println((char)(charVar + 32) + " ハロー " + booleanVar);

         // 4行目：11130
         System.out.println(byteVar + shortVar / 100 + intVar / 10000 + 20);

         // 5行目：10000000000
         System.out.println(longVar);

         // 6行目：0.105
         System.out.println(floatVar / 30);

         // 7行目：-90
         System.out.println(byteVar * -9);
	        
	     //Qes5  次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	          //「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	        String num = "20";
			int num1 = 23;
			System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
			
		//Qes6  『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
			   //ローカル変数に代入し○○に入れてください
			 // 『山田太郎 18歳 170.5cm 62.2kg 寿司』をそれぞれ変数に代入
	        String name = "山田太郎";
	        int age = 18;
	        double height = 170.5;
	        double weight = 62.2;
	        String food = "寿司";

	        // format通りに出力
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");
	        
	    //Qes7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
	     // 『山田太郎 18歳 170.5cm 62.2kg 寿司』を変数に代入
	        name = "山田太郎";
	        age = 18;
	        height = 170.5;
	        weight = 62.2;
	        food = "寿司";

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // BMIの計算（cm → m へ変換）
	        double heightInMeters = height / 100;
	        double bmi = weight / (heightInMeters * heightInMeters);

	        // BMIの出力
	        System.out.println("BMIは" + bmi + "です");
	        
	    //Qes8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
	     // 『山田太郎 18歳 170.5cm 62.2kg 寿司』を変数に代入
	        name = "山田太郎";
	        age = 18;
	        height = 170.5;
	        weight = 62.2;
	        food = "寿司";

	        // ---- 再代入 ----
	        name = "鈴木一郎";
	        age = 24;
	        height = 168.5;
	        weight = 64.2;
	        food = "オムライス";

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // BMI計算 (cm → m)
	        heightInMeters = height / 100;
	        bmi = weight / (heightInMeters * heightInMeters);

	        // BMI出力（小数第1位まで）
	        System.out.printf("BMIは%.1fです%n", bmi);
	        
	     //Qes9  8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
	        name = "鈴木一郎";
	        age = 24;
	        height = 168.5;
	        weight = 64.2;
	        food = "オムライス";

	        // 数値を和算で自己代入
	        age += 14;          // 24 + 30 = 48
	        height += 166.5;    // 168.5 + 168.5 = 337.0
	        weight += 64.2;     // 64.2 + 64.2 = 128.4

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // BMI計算（cm→mに変換）
	        heightInMeters = height / 100;
	        bmi = weight / (heightInMeters * heightInMeters);

	        // BMIを小数点第2位まで表示
	        System.out.printf("BMIは%.2fです%n", bmi);
	        
	      //Qes10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
	     // []で与えられた情報を変数に代入
	        name = "山田太郎";
	        age = 18;
	        height = 170.5;
	        weight = 62.2;
	        food = "寿司";

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // 年齢が25歳以上かを出力（if文を使わず直接ブール式）
	        System.out.println(age >= 25);
	        
	     //Qes11  8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
	     // []で与えられた情報を変数に代入
	        name = "山田太郎";
	        age = 18;
	        height = 170.5;
	        weight = 62.2;
	        food = "寿司";

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // 年齢・身長・体重を文字列に変換して連結して出力
	        String result1 = String.valueOf(age) + String.valueOf(height) + String.valueOf(weight);
	        System.out.println(result1);
	        
	     //Qes12 11で変換した【年齢・身長】を整数型に変換して出力してください
	     // 元の数値
	        age = 18;
	        height = 170.5;

	        // 文字列に変換
	        String ageStr = String.valueOf(age);
	        String heightStr = String.valueOf(height);

	        // 年齢を整数型に戻す
	        int ageInt = Integer.parseInt(ageStr);

	        // 身長はdoubleなので、いったんdouble型に変換してからintにキャスト
	        int heightInt = (int) Double.parseDouble(heightStr);

	        // 出力
	        System.out.println("年齢（整数）: " + ageInt);
	        System.out.println("身長（整数）: " + heightInt);
	        
	     //Qes13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
	           //ただしif文は使わないでください
	     // 数値を文字列に変換
	        ageStr = "18";
	        heightStr = "170.5";

	        // 再び整数に変換
	        age = Integer.parseInt(ageStr);
	        height = (int) Double.parseDouble(heightStr);

	        // 条件判定（if文を使わず、論理式を直接出力）
	        System.out.println(age >= 25 || height >= 160);
	}
}

