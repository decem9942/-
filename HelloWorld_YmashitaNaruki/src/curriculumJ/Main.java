package curriculumJ;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

		person1.print();

		System.out.println("合計" + Person.count + "人です");
	}
}