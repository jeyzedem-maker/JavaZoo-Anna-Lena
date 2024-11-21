
public class Duck extends Bird implements Flying, Herbivore, CarnivoreEatable {

	private static String speciesDescription = "It walks like a Duck and quaks like a Duck";

	public Duck(String givenName) { // Das ist ein konstruktor
		setName(givenName);
		setAge(0);
	}

	public Duck(String givenName, int age) {
		setName(givenName);
		setAge(age);
	}

	public void sayName() { // gleich wie in Bird -> überschreibt das von Bird aber nur für Duck
		System.out.println("Hi, quak quak my name is: " + getName()); // kleines gelbes dreieck sagt, es überschreibt
																		// methode
	}

	public static void printSpeciesDescription() {
		System.out.println(speciesDescription);
	}

	public void runAround() {
		System.out.println(getName() + " is running around");
	}

	public void fly() {
		flapWings(4);
		System.out.println("I'm Flying");
	}
	
	public void eat(HerbivoreEatable food) {
		System.out.println(getName() + " is eating " + food + ". Omnomnom!!");
	}

	

}
