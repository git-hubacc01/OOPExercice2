//Subclass Cat of SuperClass Pet
public class Cat extends Pet {

	private String fur;

	public Cat (String name, double weight, String fur) { 

		super(name, weight);
		this.fur = fur;
    }

	public String makeSound() {
		return "Meow! Meow!";
	}

	public String getfur() {
		return fur;
	}

	public void setFur(String fur) { 
	    this.fur = fur;
    } 
}
