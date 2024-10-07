package Animals.abstractanimals;

import Animals.habitatcategory.Terrestrial;
import Animals.Model.Animals;
import Animals.eatingcategory.Predator;

public abstract class Dog implements Predator, Terrestrial{
	Integer sleepingHours;
	
	protected Dog(Integer sleepingHours)
	{
		setSleepingHours(sleepingHours);
	}
	
	public Integer getSleepingHours() {
		return sleepingHours;
	}
	public void setSleepingHours(Integer sleepingHours) {
		this.sleepingHours = sleepingHours;
	}
	public abstract String Bark();
	@Override
	public String eat(String food) {
		return "Dog: i eat " + food;
	}
	@Override
	public String huntFor(Animals an) {
		return "Since i am a good boy, i am playing (not hunting) with " + an.WhoAmI();
	}
	
	@Override
	public String WhoAmI() {
		return "I am a Dog";
	}
	
	@Override
	public String sleep() {
		return "Sleeping peacefully " + sleepingHours + " hours";
	}
}
