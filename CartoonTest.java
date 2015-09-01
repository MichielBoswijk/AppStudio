/*
7. So it counts for all CartoonCharacters created and not for a single object.
   The program will also give an error since main is a static context (must reference static variables)
*/

class FredFlintstone {

   // Properties of the class...
   static String name            = "Fred Flintstone";
   static String favouriteColour = "blue";
   static int    favouriteNumber = 42;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class WilmaFlintstone {

   // Properties of the class...
   static String name            = "Wilma Flintstone";
   static String favouriteColour = "red";
   static int    favouriteNumber = 63;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class BarneyRubble {

   // Properties of the class...
   static String name            = "Barney Rubble";
   static String favouriteColour = "yellow";
   static int    favouriteNumber = 2;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class CartoonTest { 

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      //FredFlintstone.displayMe();
      //System.out.print(BarneyRubble.favouriteColour);

      CartoonCharacter fred =    new CartoonCharacter("Fred Flintstone", "blue", 42);
      CartoonCharacter wilma =   new CartoonCharacter("Wilma Flinstone", "red", 63);
      CartoonCharacter barney =  new CartoonCharacter("Barney Rubble", "yellow", 2);

      fred.displayMe();
      System.out.println();
      wilma.displayMe();
      System.out.println();
      barney.displayMe();
      System.out.println();

      System.out.println("Barney's favourite color: " + barney.favouriteColour);
      System.out.println("Character count: " + CartoonCharacter.count);
      System.out.println(Math.PI);
   }
}

