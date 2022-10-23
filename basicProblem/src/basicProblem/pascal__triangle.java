package basicProblem;
//Print Pascal's Triangle in Java
import java.util.*;
class pass {

	// Pascal function
	public static void main(String[] args)
	{
		Scanner h= new Scanner(System.in);
		int n=h.nextInt();
	
		for (int line = 1; line <= n; line++) {
			for (int j = 0; j <= n - line; j++) {

				// for left spacing
				System.out.print(" ");
			}

			// used to represent C(line, i)
			int C = 1;
			for (int i = 1; i <= line; i++) {

				// The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}
}
	
//nCr+1 =nCr*(n-r)/r+1;