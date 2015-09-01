/*
(b).  a.fly() will not work since an Animal doesn't have that method.
      b.numberOfKills will not work since a Bird doesn't have that property.
      b.attack() will not work since a Bird doesn't have that method.
      e.numberOfKill will not work since numberOfKills can only be references from within the Eagle context (it's private).

(c). Printed: 
      4
      false
      Hello
      2
      true
      true
      Hello
      2
      true
      Hello

(d). It inherits the property from the Bird class.

(e). At runtime the a variable is not yet a Bird object but an Animal object (which has no fly() method.

(f). b = a, since an Animal can't be converted into a Bird (not all Animals are Birds)
*/
class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      //a.fly();

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      //System.out.println(b.numberOfKills);
      b.talk();
      //b.attack(); 

      Eagle e = new Eagle();
      //System.out.println(e.numberOfKills);
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();

      a = b;
      a.talk();
      a.fly();

      b = a;
      b.talk();
      b.fly();
   }
}
