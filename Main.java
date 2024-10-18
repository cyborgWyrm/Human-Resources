/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
	Composition

Q2: Color and Red are related
by which, Inheritance or Composition?
	Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
	Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
	Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
	Composition

*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		// instantiate an ordered set and imperial set
		PersonOrderedSet orderSet = new PersonOrderedSet();
		PersonImperialSet imperialSet = new PersonImperialSet();
		
		// create file reader
		File file = new File(args[0]);
		Scanner fileReader = null;
		
		try {
			fileReader = new Scanner(file);
		}
		catch (IOException e) {
			System.out.println("Cannot find file");
			System.exit(1);
		}
		
		// read file 
		fileReader.nextLine();
		
		while (fileReader.hasNextLine()) {
			// read in values
			String name = fileReader.next();
			double height = fileReader.nextDouble();
			double weight = fileReader.nextDouble();
			
			// create persons in sets
			orderSet.add(new Person(name,height,weight));
			imperialSet.add(new Person(name,height,weight));
		}
		
		// prepare filewriter
		try
		{	
			// write imperial data to file
			FileWriter fileWriterImp = new FileWriter("hr_imperial_set_output.txt");
			fileWriterImp.write("Imperial Set Output\n" + imperialSet.toString());
			
			// write ordered data to file
			FileWriter fileWriterOrd = new FileWriter("hr_ordered_set_output.txt");
			fileWriterOrd.write("Ordered Set Output\n" + orderSet.toString());
			
			// close filereaders
			fileWriterImp.close();
			fileWriterOrd.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
		
		// print data on console
		System.out.println("Imperial Set");
		System.out.println(imperialSet.toString());
		System.out.println();
		
		System.out.println("Ordered Set");
		System.out.println(orderSet.toString());
		
	}
}
