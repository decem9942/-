package curriculumF;

public class main {
	public static void main(String[] args) {
		Animal animal = new Animal();

		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		System.out.println("動物名:" + animal.getName());
		System.out.println("体長:" + animal.getLength() + "m");
		System.out.println("速度:" + animal.getSpeed() + "km/h");
	}
}