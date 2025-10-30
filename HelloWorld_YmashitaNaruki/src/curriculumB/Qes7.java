package curriculumB;

import java.util.Scanner;

public class Qes7 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("生徒の人数を入力してください(2 以上): ");
    int n = sc.nextInt();

    double[][] scores = new double[n][4];
    String[] subjects = {"英語", "数学", "理科", "社会"};

     for (int i = 0; i < n; i++) {
         for (int j = 0; j < 4; j++) {
              System.out.printf("%d人目の『%s』の点数を入力してください: ", i + 1, subjects[j]);
              scores[i][j] = sc.nextDouble();
         }
     }


     for (int i = 0; i < n; i++) {
          double avg = (scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]) / 4.0;
          System.out.printf("%d人目の平均点は %.2f 点です。%n", i + 1, avg);
     }


     double total = 0;
            for (int j = 0; j < 4; j++) {
                double sum = 0;
            for (int i = 0; i < n; i++) sum += scores[i][j];
                double avg = sum / n;
                total += sum;
     System.out.printf("%sの平均点は %.2f 点です。%n", subjects[j], avg);
     }

     System.out.printf("全体の平均点は %.2f 点です。%n", total / (n * 4));
    }
}
