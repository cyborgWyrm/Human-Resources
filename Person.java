

// stores HR info for a single person
public class Person {
	
	// instance variables
	private String name;
	private double height;
	private double weight;
	
	// constructor
	public Person(String name,double height,double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return String.format("%s%10s%10s",name,Double.toString(height),Double.toString(weight));
	}
	
}