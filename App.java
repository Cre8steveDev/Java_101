import basic.AdvCalculator;

public class App {

	public static void main(String[] args) {
		// Bring in the Calculator class
		AdvCalculator genCalc = new AdvCalculator("Casio", "CS0384");
		int[] values = { 12, 3, 5, 18, 33, 57 };

		genCalc.add(values);
	}
}