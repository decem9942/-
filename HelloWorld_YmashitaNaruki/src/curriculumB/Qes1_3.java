package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("ユーザー名を入力してください: ");
        String username = scanner.nextLine();

        if (username == null || username.trim().isEmpty()) {
            System.out.println("名前を正しく入力してください");
            scanner.close();
            return;
        }else if (username.length() > 10) {
            System.out.println("名前が長すぎます。10文字以内で入力してください。");
            scanner.close();
            return;
        } else if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("名前は半角英数字で入力してください。");
            scanner.close();
            return;
        }

        System.out.println("ユーザー名「" + username + "」を登録しました");

        String[] hands = {"グー", "チョキ", "パー"};

        boolean win = false;
        int count = 0;

        while (!win) {
            System.out.print("0:グー, 1:チョキ, 2:パー を選んでください: ");
            int userChoice = scanner.nextInt();
            int cpuChoice = random.nextInt(3);
            count++;

            System.out.println(username + "の手は「" + hands[userChoice] + "」");
            System.out.println("相手の手は「" + hands[cpuChoice] + "」");

            if (userChoice == cpuChoice) {
                System.out.println("DRAW あいこ もう一回しましょう！\n");
            } else if ((userChoice == 0 && cpuChoice == 1) ||
                       (userChoice == 1 && cpuChoice == 2) ||
                       (userChoice == 2 && cpuChoice == 0)) {
                System.out.println("やるやん。\n次は俺にリベンジさせて");
                win = true;
            } else {
                if (cpuChoice == 0) { // CPU: グー
                    System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n");
                } else if (cpuChoice == 1) { // CPU: チョキ
                    System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
                } else if (cpuChoice == 2) { // CPU: パー
                    System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
                }
            }
        }

        System.out.println("勝つまでにかかった合計回数は" + count + "回です");

	}
}
