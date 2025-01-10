import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCollections {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<>();
		scores.add(13);
		System.out.println(scores);

		List<Integer> ratings = Arrays.asList(1, 23, 4, 5, 6, 7);
		System.out.println(ratings);

		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Stephen", "Tracy", "Justice", "Philip"));

		System.out.println(names);

		System.out.println(names.get(1));
		System.out.println(names.indexOf("Stephen"));

		int index = names.indexOf("Stephen");
		names.remove(index);

		System.out.println(names);
		System.out.println("================================");

		ArrayList<Staff> staff = new ArrayList<>();
		staff.add(new Staff("Stephen Omoregie", "Programming", false));
		staff.add(new Staff("John Doe", "Data Science", false));
		staff.add(new Staff("Emmanuel O.", "Coding", true));

		// Print all elements in the Array List
		System.out.println(staff);

	}
}

class Staff implements Comparable<Staff> {
	private String name;
	private String schoolClass;
	private Boolean isPartTime = true;
	private final int staffId;

	public static int count = 0;

	public Staff(String name, String schoolClass, Boolean isPartTime) {
		this.name = name;
		this.schoolClass = schoolClass;
		this.isPartTime = isPartTime;
		this.staffId = ++count;
	}

	public int compareTo(Staff other) {
		return this.staffId > other.staffId ? 1 : -1;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", schoolClass=" + schoolClass + ", isPartTime=" + isPartTime + ", staffId="
				+ staffId + "]";
	}

}
