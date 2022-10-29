// Super Class Pet
public abstract class Pet { 
    protected String name;
	protected double weight;
	
	public Pet(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

    public abstract String makeSound();
   
    public String getName() {
		return name;
    }

	public void setName (String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight (double weight) {
        this.weight = weight;
	}
}

