
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
		System.out.println(spot + " " + list.size());
		
		if (spot == -1 || spot == list.size()) {
			list.add(person);
		}
		else {
			for (int i = list.size(); i > spot; i--) {
				Person temp = list.get(i-1);
				if (i == list.size()) {list.add(temp);}
				else {
					list.set(i,temp);
				}
			}
			
			list.set(spot,person);
		}
	}

	private int findSpot(String name) {
		if (list.size() == 0) {
			return -1;
		}
		
		int index = 0;
		
		while(index < list.size()) {
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
		
		return list.size();
		
	}


}