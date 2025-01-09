package basic;

class Calculator {
	private final String name;
	private final String model;

	public Calculator() {
		name = "Generic Calculator";
		model = "GX001";
	}

	public Calculator(final String name, final String model) {
		this.name = name;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Calculator [name=" + name + ", model=" + model + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public void add(int[] nums) {
		System.out.println("Add in the Super Class");
		int sum = 0;

		for (int num : nums) {
			sum += num;
		}

		System.out.println("Sum: " + sum);
	}

}

public class AdvCalculator extends Calculator {
	public AdvCalculator(String name, String model) {
		super(name, model);
	}
 
	@Override
	public void add(int[] numbers) {
		System.out.println("Add in the Sub Class");
		int sum = 0;

		for (int num : numbers)
			sum += num;

		System.out.println("Sum: " + sum);
	}

}