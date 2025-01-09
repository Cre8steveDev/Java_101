import students.Student;

public class MyArrays {
	public static void main(String[] args) {
		Student[] students = new Student[10];

		Student std1 = new Student("Omoregie Stephen", "Java Programming I", 250000);
		Student std2 = new Student("John Doe", "Web Programming with Python", 150000);
		Student std3 = new Student("Felix Navidad", "Java Programming II", 250000);
		Student std4 = new Student("Doen Moen", "Graphic Design", 80000);
		Student std5 = new Student("Tracy Okogun", "Digital Marketing", 150000);

		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = std4;
		students[4] = std5;

		// Loop Through the array of students and print
		// Using an enhanced loop
		for (Student std : students) {
			if (std == null)
				continue;

			System.out.println("Student No." + std.getId() + ":");
			System.out.println("Full Name: \t\t" + std.getFullName());
			System.out.println("Registered Course: \t" + std.getRegisteredCourse());
			System.out.println("School Fees: \t\t" + std.getSchoolFee());

			System.out.println();

		}

		// Program execution completed
		System.out.println("Program completed.");

	}
}
