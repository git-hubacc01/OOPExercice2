// Subclass Dog of Super Class Pet
public class Dog extends Pet{ // 

	private String breed;

	public Dog (String name, double weight, String breed) {

		super(name, weight);
		this.breed = breed;
    }

	public String makeSound() { 
		return "Arf! Arf!";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed (String breed) { 
	    this.breed = breed;
	}
}
