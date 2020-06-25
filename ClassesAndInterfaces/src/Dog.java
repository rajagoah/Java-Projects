/**
 * 
 */

/**
 * @author aakarsh.rajagopalan
 * This exercise to practice the creation of classes
 *
 */
public class Dog implements DogInterface{
	
	//Instance variables
	String name;
	String breed;
	
	//Constructor to initialize the variables
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	//method 1
	public String getName() {
		return name;
	}
	
	//method 2
	public String getBreed() {
		return breed;
	}
	
	//method 3 to print to console
	public String printToConsole() {
		return ("hi! My name is "+this.getName()+" and I am a "+this.breed+". I'm a "+this.species);
	}
	public static void main(String[] args) {

		//creating a instance of Dog class
		Dog Ram = new Dog("Ram","Lab");
		
		//using the print to screen function
		System.out.println(Ram.printToConsole());
		
	}

}
