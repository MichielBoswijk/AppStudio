/*
4. Since no curly braces were provided to indicate the scope of the if statement,
   the if statement only considered the line underneath it. anProp = 0 was out of this scope, and was thus
   executed at all times.
*/
public class Iffy {

  private int anIntProp = 42;

  public static void main(String[] args) {
    Iffy me = new Iffy();
    me.callSomeMethods();
  }

  public void callSomeMethods() {
    warnIfNegative(20);
    warnIfNegative(-20);
    anIntProp = -42;
    resetIfNegative();
    System.out.println(isInRange(5, 10, 1));
    System.out.println(isInRange(11, 10, 1));
    System.out.println(isInRange(5, 1, 10));            
  }


  /**
   * Print out a warning if the value is negative
   * otherwise don't do anything.
   */
  public void warnIfNegative(int theValue) {
      if(theValue < 0)
        System.out.println("Caution - negative value given (" + theValue + ")");
  }
  
  /**
   * Print out a warning if the value of anIntProp is negative
   * and also set the value to zero.
   * Otherwise don't do anything.
   */
  public void resetIfNegative() {
     if(anIntProp < 0) {
        System.out.println("Caution - negative value given (" + anIntProp + ")");
        anIntProp = 0;   
     }      
  }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */

  public boolean isInRange(int value, int upperBound, int lowerBound) {
    if (upperBound <= lowerBound)
      System.out.println("Warning: upper bound less than or equal to lower bound");
    if(lowerBound <= value && value <= upperBound)
      return true;
    else
      return false;
  }

  /* isInRange method without if statement */
  //public boolean isInRange(int value, int upperBound, int lowerBound) {
  //  return (lowerBound <= value && value <= upperBound);
  //}


   //public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
   //  what goes here?
   //}
}
