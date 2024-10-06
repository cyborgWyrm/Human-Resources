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
		
		System.out.println();
		
		// testing person
		Person test = new Person("test",1.4,1000);
		System.out.println(test.toString());
		
		PersonSet test2 = new PersonSet();
		test2.add(test);
		test2.add(new Person("test",1.4,1000));
		test2.add(new Person("Gary",10,20));
		
		System.out.println(test2.get(0));
		System.out.println(test2.get(1));
		System.out.println(test2.get(2));
		
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
