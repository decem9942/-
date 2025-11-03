package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		 Scanner  scanner = new Scanner(System.in);
		 Random random = new Random();

	        System.out.print("商品名を「、」区切りで入力してください: ");
	        String input = scanner.nextLine(); // ← コンソールから入力

	        String[] products = input.split("、");

	        for (String product : products) {
	            product = product.trim(); // 空白対策
	            int stock = random.nextInt(12); // 0〜11の乱数

	            switch (product) {
	                case "ディスプレイ":
	                    int remaining = product.equals("ディスプレイ") ? 11 - stock : stock;
	                    System.out.println(product + "の残り台数は" + remaining + "台です");
	                    break;

	                case "パソコン":
	                case "冷蔵庫":
	                case "扇風機":
	                case "洗濯機":
	                case "加湿器":
	                    System.out.println(product + "の残り台数は" + stock + "台です");
	                    break;

	                default:
	                    System.out.println("『" + product + "』は指定の商品ではありません");
	            }
	        }
	}
}
