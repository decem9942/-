package curriculumD;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Qes1_3 {
	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
		Dog dog1 = new Dog();
		System.out.println("動物の名前：" + dog1.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
		Dog dog2 = new Dog();
		System.out.println("動物の数：" + dog2.count);

		// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で出力
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");

		String formatted = now.format(fmt);
		System.out.println("現在の日時：" + formatted);
	}
}