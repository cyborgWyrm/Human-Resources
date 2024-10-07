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
	
	
	
}