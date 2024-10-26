import java.util.Arrays;

public class StaffManager {
	public static void main(String[] args) {
		Staff[] list = new Staff[10];
		list[0] = new Staff("Nguyen A", 20, "male", "1/1/1999");
		list[1] = new Staff("Nguyen B", 22, "male", "1/2/1998");
		list[2] = new Staff("Nguyen C", 24, "male", "1/3/1997");
		list[3] = new Staff("Nguyen D", 26, "male", "1/4/2000");
		list[4] = new Staff("Nguyen E", 28, "female", "1/5/1998");
		list[5] = new Staff("Nguyen F", 32, "female", "1/6/2002");
		list[6] = new Staff("Nguyen G", 33, "female", "1/7/1999");
		list[7] = new Staff("Nguyen H", 35, "female", "1/8/2001");
		list[8] = new Staff("Nguyen I", 38, "female", "1/9/1997");
		list[9] = new Staff("Nguyen J", 25, "female", "1/10/1995");

		Arrays.sort(list);
		System.out.println("Staff list sorted by birthday:");
		for (Staff staff : list) {
			System.out.println(staff);
		}

		sortFemaleBeforeMale(list);
		System.out.println("\nStaff list sorted by gender then birthday:");
		for (Staff staff : list) {
			System.out.println(staff);
		}
	}

	public static void sortFemaleBeforeMale(Staff[] list) {
		Queue queueFemale = new Queue();
		Queue queueMale = new Queue();

		for (Staff staff : list) {
			if (staff.getGender().equals("female")) {
				queueFemale.enqueue(staff);
			} else {
				queueMale.enqueue(staff);
			}
		}

		int length = list.length;
		for (int i = 0; i < length; i++) {
			if (!queueFemale.isEmpty()) {
				list[i] = queueFemale.dequeue();
			} else {
				list[i] = queueMale.dequeue();
			}
		}
	}
}
