/* 
8. It will give an error since both ownersDog and dogsFlea are private.
   When both properties are made public, it will print "I am a flea called Pop"
*/

class Flea {
   
   // Properties of the class...
   private String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

   public String getName() {
      return name;
   }
}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   //private Flea dogsFlea;
   public Flea dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   public String toString() {
      return "I am a dog called " + name + "\nI am " + age + " years old\nI have a Flea called " + dogsFlea.getName() + "\n";
   }

   public String getName() {
      return name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea pop =     new Flea("Pop");
      Flea squeek =  new Flea("Squeek");
      Flea zip =     new Flea("Zip");

      Dog rex =   new Dog("Rex", 1, pop);
      System.out.println(rex.toString());
      Dog jimbo = new Dog("Jimbo", 2, squeek);
      System.out.println(jimbo.toString());
      Dog fido =  new Dog("Fido", 3, zip);
      System.out.println(fido.toString());

      DogOwner angus =     new DogOwner("Angus", 50000, rex);
      System.out.println(angus.toString());
      DogOwner brian =     new DogOwner("Brian", 75000, jimbo);
      System.out.println(brian.toString());
      DogOwner charles =   new DogOwner("Charles", 100000, fido);     
      System.out.println(charles.toString());

      System.out.println(angus.ownersDog.dogsFlea.toString());
   }
}

class DogOwner {

   private String name;
   private int salary;
   //private Dog ownersDog;
   public Dog ownersDog;

   public DogOwner(String aName, int aSalary, Dog aDog) {
      name =      aName;
      salary =    aSalary;
      ownersDog = aDog;
   }

   public String toString() {
      return "I am a person called " + name + "\nI earn " + salary + " per year\nI have a Dog called " + ownersDog.getName() + "\n";
   }
}
