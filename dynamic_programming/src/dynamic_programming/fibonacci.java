package dynamic_programming;
import java.util.Scanner;



class Fibo
{
	final int si=100;
	int a[]=new int[si+1];
	
	int fibo(int n)
	{
		if(a[n]==0)
		{
		if(n<=1)
			a[n]=n;
		else
			a[n]=fibo(n-1)+fibo(n-2);
		}
		return a[n];
	}
}
public class fibonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Fibo f=new Fibo();
		for(int i=0;i<=n;i++)
		System.out.println(f.fibo(i));
	}
}
