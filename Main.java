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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		// TESTS
		// testing person
		Person test = new Person("test",1.4,1000);
		
		// testing person set
		PersonSet test2 = new PersonSet();
		test2.add(test);
		test2.add(new Person("test",1.4,1000));
		test2.add(new Person("Gary",10,20));
		
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
		Path path = Paths.get("hr.txt");
		Scanner fileReader = null;
		
		try {
			fileReader = new Scanner(path);
		}
		catch (IOException e) {
			System.out.println("Cannot find hr.txt");
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
			Person temp = new Person(name,height,weight);
			System.out.println(temp);
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
