
public class Bed extends Furniture {

	private Boolean isDouble;

	public Bed() {
		super();
		this.isDouble = setIsDouble();
	}

	public void drawBed() {
		System.out.println("   ||");
		System.out.println("   ||                    ||");
		System.out.println("||/||____                ||");
		System.out.println("|| /`   )_____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/  |");
		System.out.println("||(___)/_/_/_/_/_/_/_||   |");
		System.out.println("||      |_|_|_|_|_|_|_|| /|");
		System.out.println("||      | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                    ||");

	}

	public void displayBed() {
		System.out.println("Bed: color: " + getColor() + "; hight: " + getHeight() + "; width: " + getWidth() + "; length: "
				+ getLength() + "; double: " + getIsDouble());

	}

	public Boolean getIsDouble() {
		return isDouble;
	}

	public boolean setIsDouble() {
		int x = random.nextInt(2);
		if (x == 1) {
			return  true;
		} else {
			return  false;
		}
		

	}

	@Override
	public String toString() {
		return "Bed ";
	}

}
