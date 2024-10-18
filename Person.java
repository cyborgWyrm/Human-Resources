

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
		return String.format("%-15s%-15s%s",name,Double.toString(height),Double.toString(weight));
	}
	
	// equals
	// overridden equals method, checks if two people are the same
	@Override
	public boolean equals(Object o) {
		if (o == null) {return false;}
		if (o == this) {return true;}
		if (!(o instanceof Person)) {return false;}
		
		Person p = (Person)o;
		if (this.name.equals(p.name) && this.height == p.height && this.weight == p.weight) {
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	// getters and setters
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}