/*
   James Dinh
   03/04/15
   Purpose: Practice the use of Generic types and classes
   Input: None
   Output: Largest element in an ArrayList of GenericMeasurable objects
*/
import java.util.ArrayList;

public class GenericTester {
  
  public static void main(String arg[]) { 
    // Create Geometric Objects arraylist and add values
    ArrayList<GenericMeasurable<GeometricObject>> myList = new ArrayList<GenericMeasurable<GeometricObject>>();
    
    GeometricObject c1 = new Circle(5);
    GeometricObject r1 = new Rectangle(3, 4);
    GeometricObject t1 = new Triangle(3, 4, 5);
    
    myList.add(c1);
    myList.add(r1);
    myList.add(t1);
    
    // Create MeasurableString arraylist and add values
    ArrayList<GenericMeasurable<MeasurableString>> stringList = new ArrayList<GenericMeasurable<MeasurableString>>();
    
    stringList.add(new MeasurableString("Hello"));
    stringList.add(new MeasurableString("World!"));
    stringList.add(new MeasurableString("Java"));
    
    // Sort both lists
    java.util.Collections.sort(myList);
    java.util.Collections.sort(stringList);
    
    // Call findMax on Geometric Objects list
    System.out.println("Largest value in list of Measurable geometric objects: \n" + GenericMeasurable.findMax(myList) + "\n");
    
    // Print out sorted Geometric Objects list
    for (GenericMeasurable<GeometricObject> e : myList)
      System.out.println(e + "\n");
    
    // Call findMax on MeasurableString list
    System.out.println("Largest value in list of Measurable strings: " + GenericMeasurable.findMax(stringList));
    
    // Print out sorted MeasurableString list
    for (GenericMeasurable<MeasurableString> s : stringList)
      System.out.println(s);
  }
}
