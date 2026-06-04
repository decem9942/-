package curriculumJ;

class Person {
	// インスタンスフィールド（問題1、問題4）
	String name;
	int age;
	double height;
	double weight;

	// クラスフィールド（問題10：全員で共有するカウンター）
	static int count = 0;

	// コンストラクタ（問題2、問題3、問題4）
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// BMIを計算して返すメソッド（問題6、問題7）
	double bmi() {
		return this.weight / (this.height * this.height);
	}

	// 自己紹介を表示するメソッド（問題8、問題9）
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです\n", this.bmi());
	}
}