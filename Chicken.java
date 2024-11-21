
public class Chicken extends Bird implements Herbivore {

	public Chicken(String givenName) {
		setName(givenName);
		setAge(1);
	}

	public void eat(HerbivoreEatable food) {
		System.out.println(getName() + " is eating " + food + ". Omnomnom!!");
	}

}
