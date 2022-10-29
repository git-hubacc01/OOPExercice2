// Main class
public class mainProgram {

public static void main(String[] args) {

    Pet pet;

    Dog dog = new Dog("Brownie", 10, "German Sheperd");
        pet = dog;
	System.out.println(pet.makeSound()+" "+" My name is " + pet.getName());
   
	Cat cat = new Cat("Kitty", 5, "White");
	    pet = cat;
    System.out.println(pet.makeSound()+" "+" My name is " + pet.getName());
    }
}
