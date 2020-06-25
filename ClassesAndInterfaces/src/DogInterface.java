/**
 * 
 */

/**
 * @author aakarsh.rajagopalan
 * A tutorial of a simple interface
 */
public interface DogInterface {
	
	//variable declaring species
	String species = "Canine";
	
	//Declaring instance methods that are public and abstract
	public String getName();
	
	public String getBreed();
	
	public String printToConsole();
}
