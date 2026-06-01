package curriculumG;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String name = scanner.nextLine();

		Hero hero = new Hero(name);

		System.out.println();
		System.out.println("こんにちは｢" + hero.getName() + "｣さん");
		System.out.println("ステータス:");
		System.out.println("HP:" + hero.getHp());
		System.out.println("MP:" + hero.getMp());
		System.out.println("攻撃力:" + hero.getAttack());
		System.out.println("素早さ:" + hero.getSpeed());
		System.out.println("防御力:" + hero.getDefense());

		System.out.println();
		System.out.println("さあ冒険に出かけよう!");

		scanner.close();
	}
}