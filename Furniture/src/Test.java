import java.util.Random;

public class Test {
	static Random random = new Random();

	public static Furniture determineFurniture() {

		int x = random.nextInt(3);
		switch (x) {
		case 0:
			Chair c1 = new Chair();
			return c1;

		case 1:
			Table t1 = new Table();
			return t1;

		case 2:
			Bed b1 = new Bed();
			return b1;

		default:
			break;
		}
		return null;
	}

	public static void display(Furniture f1) {
		if (f1 instanceof Chair) {
			((Chair) (f1)).displayChair();
			((Chair) (f1)).drawChair();
		} else if (f1 instanceof Table) {
			((Table) (f1)).displayTable();
			((Table) (f1)).drawTable();
		} else if (f1 instanceof Bed) {
			((Bed) (f1)).displayBed();
			((Bed) (f1)).drawBed();
		}

	}

	public static void bounesround(Furniture f1) {
		if (f1 instanceof Chair) {
			System.out.println("the chair has " + ((Chair) (f1)).getNumberOfLegs() + " legs.");
		} else if (f1 instanceof Table) {
			System.out.println("the table has " + ((Table) (f1)).getNumberOfSeats() + " seats.");
		} else if (f1 instanceof Bed) {
			if (((Bed) (f1)).getIsDouble() == true) {
				System.out.println("this is a double bed");
			} else if (((Bed) (f1)).getIsDouble() == false) {
				System.out.println("this is a single bed");
			}
		}
	}

	public static void main(String[] args) {

		Furniture[] f1 = new Furniture[20];
		for (int i = 0; i < f1.length; i++) {
			f1[i] = determineFurniture();
			display(f1[i]);
			bounesround(f1[i]);

		}
	}

}
