package basicProblem;
import java.util.*;

public class prime {
public static void main(String[]args)
{
	System.out.println("Enter number");
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	int i=2,temp=0;
	while(i<=n/2)
	{
		if(n%i==0) 
		{
			temp=1;
			break;
		}
		i++;
	}
	if (temp==0)
	{
		System.out.println("Number is a prime");
	}
	else {
		System.out.println ("Number is not a prime");
	}
}
}
