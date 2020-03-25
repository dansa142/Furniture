import java.util.Random;

public abstract class Furniture {

	private int length;
	private int width;
	private int height;
	private String color;
	static Random random = new Random();

	public Furniture() {
		this.length = random.nextInt(6) + 1;
		this.width = random.nextInt(10) + 1;
		this.height = random.nextInt(3) + 1;
		this.color = setColor();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public String setColor() {
		int x = random.nextInt(4) + 1;
		switch (x) {
		case 1:
			 color = "Black";
			break;
		case 2:
			 color = "Blue";
			break;
		case 3:
			 color = "Yellow";
			break;
		case 4:
			 color = "Brown";
			break;
		case 5:
			 color = "Green";
			break;

		default:
			break;
		}
		return color;}
		

	@Override
	public String toString() {
		return "Furniture [length=" + length + ", width=" + width + ", height=" + height + ", color=" + color + "]";
	}

}
