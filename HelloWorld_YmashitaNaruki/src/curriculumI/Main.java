package curriculumI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] masterData = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};

		Scanner scanner = new Scanner(System.in);

		System.out.println("数字をカンマ区切りで入力してください");
		String idInput = scanner.nextLine();

		System.out.println("ソート方向を入力してください (1:昇順 / 2:降順)");
		String orderInput = scanner.nextLine();

		String[] idStrings = idInput.split(",");
		List<Integer> selectedIds = new ArrayList<>();
		for (String idStr : idStrings) {
			selectedIds.add(Integer.parseInt(idStr.trim()));

		}

		if (orderInput.equals("1") || orderInput.contains("昇順")) {
			Collections.sort(selectedIds);
		} else if (orderInput.equals("2") || orderInput.contains("降順")) {
			Collections.sort(selectedIds, Collections.reverseOrder());
		}

		System.out.println("\\n--- ソート結果 ---");
		for (int id : selectedIds) {
			if (id >= 0 && id < masterData.length) {
				Prefecture pref = new Prefecture(masterData[id]);

				System.out.println(":" + pref.getName());
				System.out.println(":" + pref.getCapital());
				System.out.println(":" + pref.getArea() + "km2");
				System.out.println();
			} else {
				System.out.println("ID" + id + "に対するデータはありません。\\n");
			}

			scanner.close();
		}
	}

}