public class BRTest {

	private int totalReturned = 0;
	private int calls = 0;
	private int successfulCalls = 0;	
	private int[] excepCounts = new int[5];

	public void callIt() {
		calls++;
		try {
			totalReturned += BadRandom.randVal();
			successfulCalls++;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			excepCounts[0]++;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			excepCounts[1]++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			excepCounts[2]++;
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
			excepCounts[3]++;
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
			excepCounts[4]++;
		}
	}

	public void resetCounts() {
		calls = 0;
		successfulCalls = 0;
		totalReturned = 0;
		for(int i=0; i<excepCounts.length; i++) {
			excepCounts[i] = 0;
		}
	}

	public void nRandInts(int n) {
		while(successfulCalls < n) {
			callIt();
		}
	}

	public void writeData() {
		System.out.println("Calls: " + calls);
		System.out.println("Successful calls: " + successfulCalls);
		System.out.println("Sum of values returned: " + totalReturned);
		System.out.println("Percentage ArithmeticExceptions: " + (((float) excepCounts[0] / calls) * 100));
		System.out.println("Percentage NullPointerExceptions: " + (((float) excepCounts[1] / calls) * 100));
		System.out.println("Percentage ArrayIndexOutOfBoundsExceptions: " + (((float) excepCounts[2] / calls) * 100));
		System.out.println("Percentage ClassCastException: " + (((float) excepCounts[3] / calls) * 100));
		System.out.println("Percentage NegativeArraySizeException: " + (((float) excepCounts[4] / calls) * 100));
		System.out.println("Percentage successful calls: " + (((float) successfulCalls / calls) * 100));
	}

	public static void main(String[] args) {
		BRTest me = new BRTest();
		me.resetCounts();
		me.nRandInts(30);
		me.writeData();
	}
}