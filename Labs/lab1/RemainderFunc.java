import java.util.Scanner;

public class RemainderFunc {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );

    System.out.print("Please enter the max number: ");
    int max_number = input.nextInt();

    System.out.print("Please enter the divisor: ");
    int divisor = input.nextInt();

    for (int i = 1; i <= max_number; ++i)
      System.out.println("Num: " + i + " % " + divisor + " = " + (i % 2));
	}
  
}
