/* 
4. Return values do not have to be used in java
*/

class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   public Citizen(String aName) {
      this(aName, 0, 0, 0);
   }

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }

   public void setSalary(int aSalary) {
      salary = aSalary;
   }

   public void salaryRise(int amount) {
      salary += amount;
   }

   public int netWorth() {
      return (savings - loan);
   }

   public String toString() {
      return "\nname: " + name + "\nsalary: " + salary + "\nsavings: " + savings + "\nloan: " + loan; 
   }
}

class CitizenTest {
    
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);

      e.salaryRise(10000);

      System.out.println("Ernie's salary is: " + e.getSalary());
      System.out.println("Ernie's net worth is: " + e.netWorth());
      System.out.println(e.toString());

      Citizen f = new Citizen("Fred");
      System.out.println(f.toString());      
   }
}