class Person {

   // Properties of the class...
   public String name;
   public int    age;
   private int   height;
    
   // Constructor of the class... (commented for ex.10)
   /* 
   public Person(String aName, int anAge, int aHeight) {
      name = aName;
      age  = anAge;
      height = aHeight;
   }
   */

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and my height is " + height + " cm");
      System.out.println();
      commentAboutAge();
   }

   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }

   public void growOlder() {
      age += 1;
   }

   public void growOlderBy(int years) {
      age += years;
   }

   public void giveKnightHood() {
      name = "Sir " + name;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      //Person ls = new Person("Luke Skywalker", 34, 170);
      //Person wp = new Person("Winston Peters", 48, 175);
      Person ls = new Person();
      Person wp = new Person();

      //ls.growOlder();
      ls.growOlderBy(10);
      ls.talk();
      //ls.commentAboutAge();
      wp.giveKnightHood();
      wp.growOlder();
      wp.talk();
      //wp.commentAboutAge();

      //Print age (and name) directly from main method
      System.out.println(ls.name + "'s age is " + ls.age);
   }

}
