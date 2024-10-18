
public class PersonImperialSet extends PersonSet {
	
	// constructor
	public PersonImperialSet() {
		super();
	}
	
	@Override
	public void add(Person person) {
		// change weight and height to imperial 
		double metricWeight = person.getWeight();
		double metricHeight = person.getHeight();
		
		double newWeight = Math.round(metricWeight * 2.20462);
		double newHeight = Math.round(metricHeight * 0.393701);
		person.setWeight(newWeight);
		person.setHeight(newHeight);
		
		// add person
		super.add(person);
	}
	
	@Override
	public String toString() {
		// i just copied this code from personSet and changed the values...
		// it would probably be better form to somehow call super for this but
		// copying it is easier
		String toReturn = String.format("%-15s%-15s%s","Name","Height (in)","Weight (lbs)");
		
		// add each person with a new line
		for (int i = 0; i < list.size(); i++) {
			String person = "\n" + list.get(i).toString();
			toReturn = toReturn + person;
		}
		
		return toReturn;
		
	}
	
}