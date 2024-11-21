
public class Goose extends Bird implements Flying, Carnivore {

	public Goose(String givenName) {
		setName(givenName);
		setAge(1);

	}

	public void fly() {
		flapWings(7);
		System.out.println(getName() + " flys now");
	}
	
	public void eat(CarnivoreEatable food) {
		System.out.println(getName() + " is eating " + food + ". Omnomnom!!");
	}
}
