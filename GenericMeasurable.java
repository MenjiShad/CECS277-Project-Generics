/*
   James Dinh
   03/04/15
   Purpose: Practice the use of Generic types and classes
   Input: None
   Output: Largest element in an ArrayList of Measurable objects
*/
import java.util.ArrayList;

public abstract class GenericMeasurable<T> implements Comparable<GenericMeasurable<T>> {
  
  // Gets some numerical representation/measurement of a generic object
  public abstract int getMeasure();
  
  // Finds the largest element in an ArrayList of Measurable objects
  public static <T extends GenericMeasurable> T findMax(ArrayList<T> list) {
    T largest = list.get(0);
    
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i).compareTo(largest) > 0)
        largest = list.get(i);
    }
    return largest;
  }
  
  // From the Comparable interface
  public int compareTo(GenericMeasurable obj) {
    return getMeasure() - obj.getMeasure();
  }
}
