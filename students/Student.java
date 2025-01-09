package students;

public class Student {
	private final int id;
	private String fullName;
	private String registeredCourse;
	private int schoolFee;

	private static int count = 0;

	public Student() {
		this.id = ++(Student.count);
	}

	// Create a parameterized constructor
	public Student(String fullName, String registeredCourse, int schoolFee) {
		this();
		this.fullName = fullName;
		this.registeredCourse = registeredCourse;
		this.schoolFee = schoolFee;

	}

	// Generate string Representation
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", registeredCourse=" + registeredCourse
				+
				", schoolFee=" + schoolFee + "]";
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}

	public int getSchoolFee() {
		return schoolFee;
	}

	public void setSchoolFee(int schoolFee) {
		this.schoolFee = schoolFee;
	}

}
