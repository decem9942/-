package curriculumE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Them2 {

	private String country;
	private String food;
	private String category;

	public Them2(String country, String food, String category) {
		this.country = country;
		this.food = food;
		this.category = category;
	}

	public void display() {

		System.out.println("こんにちは！ここは" + this.country + "です！");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.category + "です");

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		System.out.println("今の現在日時は" + now.format(format) + "です");
	}
}