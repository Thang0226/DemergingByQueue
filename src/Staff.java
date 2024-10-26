public class Staff implements Comparable<Staff> {
	private String name;
	private int age;
	private String gender;
	private String birthday;

	public Staff(String name, int age, String gender, String birthday) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Staff{" +
				"name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", birthday='" + birthday + '\'' +
				'}';
	}

	@Override
	public int compareTo(Staff o) {
		String[] birthday1 = this.birthday.split("/");
		String[] birthday2 = o.birthday.split("/");
		if (Integer.parseInt(birthday1[2]) > Integer.parseInt(birthday2[2])) {
			return 1;
		} else if (Integer.parseInt(birthday1[2]) < Integer.parseInt(birthday2[2])) {
			return -1;
		} else {
			if (Integer.parseInt(birthday1[1]) > Integer.parseInt(birthday2[1])) {
				return 1;
			} else if (Integer.parseInt(birthday1[1]) < Integer.parseInt(birthday2[1])) {
				return -1;
			} else {
				return Integer.compare(Integer.parseInt(birthday1[0]), Integer.parseInt(birthday2[0]));
			}
		}
	}
}
