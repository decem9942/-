package curriculumB;

import java.util.Random;

public class Qes6 {
	public static void main(String[] args) {
		 String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
	        String[] products = input.split("、");
	        Random random = new Random();

	        for (String product : products) {
	            int stock = random.nextInt(12); // 0-11
	            switch (product) {
	                case "テレビ":
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

