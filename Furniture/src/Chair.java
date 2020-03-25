
public class Chair extends Furniture {

	private int numberOfLegs;

	public Chair() {
		super();
		this.numberOfLegs = 4;
	}
	
	public void drawChair() {
		System.out.println(" i______i");
		System.out.println(" I______I");
		System.out.println(" I      I");
		System.out.println(" I______I");
		System.out.println(" /     /I");
		System.out.println("(______( ");
		System.out.println("I I   I I");
		System.out.println("I     I");
	}
	
	public void displayChair() {
		System.out.println("Chair: color " + getColor() + "; hight: " + getHeight() + "; length: " + getLength() + "; width: "
				+ getWidth() + "; number of legs: " + getNumberOfLegs());
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Chair ";
	}

}
