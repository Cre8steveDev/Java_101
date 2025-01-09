// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");

		// Scanner scn = null;

		// try {
		// // InputStreamReader in = new InputStreamReader(System.in);
		// // BufferedReader bf = new BufferedReader(in);

		// // String userInput = bf.readLine();
		// // System.out.println(userInput);

		// scn = new Scanner(System.in);
		// String num = scn.nextLine();

		// System.out.println("User Input: " + num);
		// scn.close();

		// } catch (NoSuchElementException e) {
		// System.out.println("An IO Exception occured: " + e);

		// } finally {
		// scn.close();
		// }

		// Using try-with-resources
		try (Scanner scn1 = new Scanner(System.in);) {
			String fullName = scn1.nextLine();
			System.out.println("The user entered: " + fullName);
		}
	}
}