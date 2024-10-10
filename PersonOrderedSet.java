
public class PersonOrderedSet extends PersonSet {
	
	// constructor
	public PersonOrderedSet() {
		super();
	}
	
	@Override
	public void add(Person person) {
		if (!list.contains(person)) {
			place(person);
		}
	}
	
	private void place(Person person) {
		int spot = findSpot(person.getName());
		
		for (int i = list.size(); i > spot; i--) {
			Person temp = list.get(i-1);
			list.set(i,temp);
		}
		
		list.set(spot,person);
	}

	private int findSpot(String name) {
		int index = 0;
		
		while(true) {
			Person otherPerson = list.get(index);
			String name2 = otherPerson.getName();
			if (name.compareTo(name2) < 0) {
				return index;
			}
			else if (name.compareTo(name2) > 0) {
				index++;
			}
			else {
				//error?
			}
		}
		
	}


}