import java.util.ArrayList;

public class PersonSet implements PersonList {
	
	// used for storing all the people
	ArrayList<Person> list = new ArrayList<Person>();
	
	// constructor. Should I have anything in it??
	public PersonSet() {}
	
	// adds a person to personlist
	public void add(Person person) {
		if (!(list.contains(person))) {
			list.add(person);
		}
	}
	
	// reads a person from personlist
	public Person get(int index) {
		return list.get(index);
	}
	
	// toString
	public String toString() {
		String toReturn = String.format("%-15s%-15s%-15s","Name","Height (cm)","Weight (kg)");
		
		// add each person with a new line
		for (int i = 0; i < list.size(); i++) {
			String person = "\n" + list.get(i).toString();
			toReturn = toReturn + person;
		}
		
		return toReturn;
		
	}
	
	
	
}