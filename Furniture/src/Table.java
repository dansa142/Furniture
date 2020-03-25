
public class Table extends Furniture {

	private int numberOfSeats;

	public Table() {
		super();
		this.numberOfSeats = random.nextInt(7) + 1;
	}

	public void drawTable() {
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
	}

	public void displayTable() {
		System.out.println("Table:  color: " + getColor() + "; hight: " + getHeight() + "; width: " + getWidth() + "; length: "
				+ getLength() + "; number of seats: " + getNumberOfSeats());
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Table ";
	}

}
