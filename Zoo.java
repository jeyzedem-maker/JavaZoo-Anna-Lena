
public class Zoo {
	private Bird[] allBirds;

	public Zoo() {
		allBirds = new Bird[35];

		allBirds[0] = new Duck("Entericho");
		allBirds[1] = new Duck("Berta", 4);

		allBirds[2] = new Goose("Hans");
		allBirds[3] = new Goose("Gurundel");

		allBirds[4] = new Chicken("Chaqueline");
		allBirds[5] = new Chicken("Carlos");

	}

	public static void main(String[] args) {
		Zoo myZoo = new Zoo();
		myZoo.letAllDucksRun();

		Duck.printSpeciesDescription();

		myZoo.listAllAnimals();

		// Duck berta = new Duck("Berta", 4); //4 kommt vom konstruktor bei duck

		myZoo.allBirds[0].flapWings(10);
		myZoo.allBirds[1].sayName();
		myZoo.allBirds[0] = new Duck("Entericho");
		myZoo.allBirds[1].sayName();
		System.out.println("Julian fühlt sich ganz schön rich und hat so viel Geld:" + myZoo.allBirds[1].getAge());

		myZoo.allBirds[2].nagNag(5);
		myZoo.allBirds[2].sayName();

		myZoo.allBirds[4].bogBog(3);
		myZoo.allBirds[4].sayName();
		myZoo.allBirds[2].setAge(6);
		System.out.println("Ich bin " + myZoo.allBirds[0].getAge());

		myZoo.allBirds[3].nagNag(5);
		myZoo.allBirds[3].sayName();

		myZoo.allBirds[5].bogBog(3);
		myZoo.allBirds[5].sayName();

		System.out.println("---------------Listing all animals----------------");
		myZoo.listAllAnimals();
		System.out.println(myZoo.allBirds[1]);
		System.out.println("---------------Birds fly----------------");
		myZoo.letAllBirdsFly();

		System.out.println("---------------Feed all animals----------------");
		myZoo.feedAllAnimals();

	}

	public void listAllAnimals() {
		System.out.println("Hier sind alle Tiere, die im Zoo leben:");
		for (int i = 0; i < allBirds.length; i++) {
			if (allBirds[i] != null) {
				allBirds[i].sayName();
			}
		}
	}

	public void letAllBirdsFly() {
		for (int i = 0; i < allBirds.length; i++) {
			if (allBirds[i] instanceof Flying) {
				Flying flyingCreature = (Flying) allBirds[i];
				flyingCreature.fly();
			}
		}

	}

	public void letAllDucksRun() {
		for (int i = 0; i < allBirds.length; i++) {
			if (allBirds[i] instanceof Duck duck) {
				duck.runAround();

			}
		}
	}

	public void feedAllAnimals() {
		for (int i = 0; i < allBirds.length; i++) {
			if (allBirds[i] instanceof Herbivore) {
				Herbivore animalToFeed = (Herbivore) allBirds[i];
				animalToFeed.eat(new Grass());
			}else if (allBirds[i] instanceof Carnivore) {
				Carnivore animalToFeed = (Carnivore) allBirds[i];
				animalToFeed.eat(new Duck("Duck", 55));
			}
		}
	}
	
	

}
