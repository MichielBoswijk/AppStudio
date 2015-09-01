/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader.

   1(c). It throws a java.lang.NumberFormatException
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
  
  public void readAge () throws IOException {
    
    boolean succes = false;

    while (succes == false){
      System.out.print("Input your age: ");
      try {
        age = Integer.parseInt(stdIn.readLine());
          if (age >= 0 && age <= 150) {
            succes = true;    
          } else {
            System.out.print("Lies! Try again.\n");
          }
      } catch(NumberFormatException e) {
        age = -1;
        System.out.println("Error: Please input your age as an integer.");
        System.out.println("Try again.");
      } catch (IOException e) {
        System.out.println("Error: Something happened which caused the program to terminate.");
        System.exit(1);
      }
    }
    
  }  

  public void printName () {
    System.out.println("Name: " + name);
  }

  public void printAge () {
    System.out.println("Age: " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.readAge();
    me.printName();
    me.printAge();
  }
}

  
  
