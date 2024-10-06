import java.util.ArrayList;

public class PersonSet implements PersonList {
	
	ArrayList<Person> list = new ArrayList<Person>();
	
	public PersonSet() {}
	
	
	public void add(Person person) {
		if (!(list.contains(person))) {
			list.add(person);
		}
	}
	
	public Person get(int index) {
		return list.get(index);
	}
	
	
	
}