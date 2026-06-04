package curriculumI;

public class Prefecture {
	private String name;
	private String capital;
	private double area;

	public Prefecture(String rawData) {
		String[] details = rawData.split(":");
		this.name = details[0];
		this.capital = details[1];
		this.area = Double.parseDouble(details[2]);
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

}