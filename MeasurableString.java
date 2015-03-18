/*
   James Dinh
   03/04/15
   Purpose: Practice the use of Generic types and classes
   Input: None
   Output: Largest element in an ArrayList of GenericMeasurable objects
*/
public class MeasurableString extends GenericMeasurable<MeasurableString> {
 
  // instance variables
  private String mString;
  
  // Default constructor
  public MeasurableString() {
    mString = "";
  }
  
  // Constructor to initialize a String
  public MeasurableString(String newString) {
    mString = newString;
  }
  
  @Override
  public String toString() {
    return mString;
  }
  
  // return logical numerical representation
  public int getMeasure() {
    return mString.length();
  }
  
}
