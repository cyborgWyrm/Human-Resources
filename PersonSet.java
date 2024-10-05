

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
	
	@Override
	private boolean equals(Object o) {
		if (o == null) {return false;}
		if (o == this) {return true;}
		if (!o.instanceOf(Person)) {return false;}
		
		Person p = (Person)o;
		if (this.name == o.name && this.height == o.height && his.weight == o.weight) {
			return true;
		}
		
		return false;
		
	}
	
	
	
}