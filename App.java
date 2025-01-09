import basic.AdvCalculator;

// Creating a functional interface
// and then using lambda 

@FunctionalInterface
interface Single {
	int square(int number);
}

public class App {

	public static void main(String[] args) {
		// Bring in the Calculator class
		AdvCalculator genCalc = new AdvCalculator("Casio", "CS0384");
		int[] values = { 12, 3, 5, 18, 33, 57 };

		genCalc.add(values);

		// Check the SAM
		Single calculate = num -> num * num;

		// Handling Exceptions with try catch
		try {
			System.out.println(13 / 0);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("The Calculated thingy: " + calculate);

	}
}