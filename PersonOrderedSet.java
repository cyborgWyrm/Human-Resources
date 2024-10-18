
public class PersonOrderedSet extends PersonSet {
	
	// constructor
	public PersonOrderedSet() {
		super();
	}
	
	@Override
	public void add(Person person) {
		// if person is not already in the list
		if (!list.contains(person)) {
			// add person in the correct spot
			place(person);
		}
	}
	
	// put the person in the correct spot, shifting the subsequent values
	private void place(Person person) {
		// find the spot the person should go in
		int spot = findSpot(person.getName());
		
		// if the spot is the end of the list
		if (spot == list.size()) {
			// just add the person
			list.add(person);
		}
		else {
			// run through the list backwards until spot
			for (int i = list.size(); i > spot; i--) {
				// shift the list forward by one
				Person temp = list.get(i-1);
				if (i == list.size()) {
					list.add(temp);
				}
				else {
					list.set(i,temp);
				}
			}
			
			// put person in the spot it should go
			list.set(spot,person);
		}
	}
	
	// find the spot in the list a person should go in
	private int findSpot(String name) {
		
		int index = 0;
		
		// go through the list
		while(index < list.size()) {
			Person otherPerson = list.get(index);
			String name2 = otherPerson.getName();
			if (name.compareTo(name2) < 0) {
				// if the new name is previous alphebetically than the next one, return this spot
				return index;
			}
			else if (name.compareTo(name2) > 0) {
				// in the new name is after the next one alphebetically, keep searching
				index++;
			}
			else {
				//error?
				// no, it shouldn't error for this. This happens if the names are the same
				// ill just put it right after 
				index++;
			}
		}
		
		// return the end of the list if the new name is the last alphebetically
		return list.size();
		
	}


}