public class Lab21_Objects {

	public static void main(String[] args) {
		// DO NOT CREATE NEW VARIABLES
		
		Dummy[] dlist = new Dummy[11];
		int[] iarr = new int[11];
		double[] darr = new double[11];

		// DO NOT USE ANY CONSTANTS or new Variables
		 
		dlist[0] = new Dummy();
		
		dlist[1] = new Dummy(iarr[0]);
		
		// Fill-in 3-11 Constructor calls and assign them to dlist array indices 2-10
		
		dlist[0].display();
		
		dlist[1].display(iarr[0]);
	
		// Fill-in 3-11 display calls on the dlist objects
	}
}
