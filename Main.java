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
		PersonOrderedSet orderSet = new PersonOrderedSet();
		PersonImperialSet imperialSet = new PersonImperialSet();
		
		/*
		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the 
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		String name = fileReader.next();
		double height = fileReader.nextDouble();
		double weight = fileReader.nextDouble();
		*/
		
		// create file reader
		File file = new File("hr.txt");
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
			
			// create a person and print
			Person person = new Person(name,height,weight);
			orderSet.add(person);
			imperialSet.add(person);
		}
		
		
		
		/*try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}*/
	}
}
