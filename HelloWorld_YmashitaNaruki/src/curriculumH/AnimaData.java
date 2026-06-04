package curriculumH;
import java.util.Scanner;

public class AnimaData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();

		String[] animalList = input.split(",");
		for (String animalData : animalList) {
			String[] details = animalData.split(":");
			String name = details[0];
			String length = details[1];
			String speed = details[2];

			String scientificName = switch (name) {
			case "ライオン" -> "パンテラ　レオ";
			case "ゾウ" -> "ロキソドンタ・サイクロティス";
			case "パンダ" -> "アイルロポダ・メラノレウカ";
			case "チンパンジー" -> "パン・トゥログロディテス";
			case "シマウマ" -> "チャップマンシマウマ";
			default -> "不明";
			};

			System.out.println("動物名" + name);
			System.out.println("体長" + length + "m");
			System.out.println("速度" + speed + "km/h");
			System.out.println("学名" + scientificName);
			System.out.println();
		}

		scanner.close();
	}
}