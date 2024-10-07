package Animals.realAnimals;

import Animals.Model.Animals;
import Animals.abstractanimals.Fish;
import Animals.eatingcategory.Predator;

public class Bream extends Fish implements Predator {

	public Bream(String species) {
		super(species);
	}

	@Override
	public String huntFor(Animals an) {
		return "hunting for " + an.WhoAmI();
	}

}
