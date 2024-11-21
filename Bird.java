
public class Bird {
	private String name;
	private int age;

	public void setAge(int newAge) {
		if (newAge > 0) {
			age = newAge;
		}
	}

	public void bogBog(int bogBog) {
		for (int i = 0; i < bogBog; i++) {
			System.out.println("Bog");
		}
	}

	public void nagNag(int nagNag) {
		for (int i = 0; i < nagNag; i++) {
			System.out.println("Nag");
		}
	}

	public void flapWings(int flapCount) {
		for (int i = 0; i < flapCount; i++) {
			System.out.println("Flap");
		}
	}

	public void sayName() {
		System.out.println("Hi, my name is: " + name);
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "[name: " + name + ",age:" + age + "]";
	}
}
