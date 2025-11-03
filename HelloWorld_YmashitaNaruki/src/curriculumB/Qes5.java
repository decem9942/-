package curriculumB;

public class Qes5 {
	 public static void main(String[] args) {
		 for (int i = 1; i <= 20; i++) {
			 StringBuilder row = new StringBuilder();
			 for (int j = 1; j <= 9; j++) {
				 row.append(String.format("%02d * %02d = %03d", j ,i, j * i));
				 if (j < 9) {
					 row.append(" || ");
				}
			 }
			 System.out.println(row.toString());
		 }
	}
}
