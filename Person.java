

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
		return String.format("%-10s%10s%10s",name,Double.toString(height),Double.toString(weight));
	}
	
	// equals
	// overridden equals method, checks if two people are the same
	@Override
	public boolean equals(Object o) {
		if (o == null) {return false;}
		if (o == this) {return true;}
		if (!(o instanceof Person)) {return false;}
		
		Person p = (Person)o;
		if (this.name == p.name && this.height == p.height && this.weight == p.weight) {
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	// getters and setters
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
}