
public class PersonImperialSet extends PersonSet {
	
	// constructor
	public PersonImperialSet() {
		super();
	}
	
	@Override
	public void add(Person person) {
		double metricWeight = person.getWeight();
		double metricHeight = person.getHeight();
		
		person.setWeight(metricWeight * 2.20462);
		person.setHeight(metricHeight * 0.393701);
		
		super.add(person);
	}
	
	@Override
	public String toString() {
		// i just copied this code from personSet and changed the values...
		// it would probably be better form to somehow call super for this but
		// copying it is easier
		String toReturn = String.format("%-10s%10s%10s","Name","Height (in)","Weight (lbs)");
		
		// add each person with a new line after
		for (int i = 0; i < list.size(); i++) {
			String person = list.get(i).toString() + "\n";
			toReturn = toReturn + person;
		}
		
		return toReturn;
		
	}
	
}