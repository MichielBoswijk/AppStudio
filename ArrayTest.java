class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];
      double[] nums = new double[10];

      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // sets the values of the nums array
      for (int i=0; i<10; i++) {
         nums[i] = 1.0 + (0.1 * i);
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      for (int i=0; i<10; i++) {
         System.out.println(nums[i]);
      }

      ArrayPrint.printArray(nums);
      printArray(nums);

      // insert your code for the nums array here:

   }

   public void printArray(double[] anArray) {
         for (int i=0; i<anArray.length; i++) {
            System.out.println(anArray[i]);
         }
      }
}
