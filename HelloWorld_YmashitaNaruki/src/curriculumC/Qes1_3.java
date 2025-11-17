package curriculumC;

public class Qes1_3 {
	// Q1：引数に文字列型と整数型をいれて
	// コンソールに「Hello JavaSE 11」と出力するメソッド
	public static void printHello(String text, int number) {
		System.out.println("Hello JavaSE " + number);
	}

	// Q2：３の倍数のときだけ true を返すメソッド
	public static boolean isMultipleOfThree(int num) {
		return num % 3 == 0;
	}

	// Q3：引数に文字列を渡すと挨拶するメソッド
	public static void greet(String name) {
		System.out.println("こんにちは" + name + "さん");
	}

	public static void main(String[] args) {

		// Q1 呼び出し
		printHello("JavaSE", 11);

		// Q2 呼び出し
		System.out.println(isMultipleOfThree(9)); // true
		System.out.println(isMultipleOfThree(10)); // false

		// Q3 呼び出し
		greet("太郎");
	}
}

