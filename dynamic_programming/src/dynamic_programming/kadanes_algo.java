package dynamic_programming;

import java.util.Scanner;

public class kadanes_algo {

	static void kadane(int a[])	//longest sum subsequences
	{
		int max_so_far=a[0];
		int max_ending_here=0;
		int start=0,end=0,s=0;
		for(int i=0;i<a.length;i++)
		{
			max_ending_here+=a[i];
			if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
				start=s;
				end=i;
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
				s=i+1;
			}
		}
		System.out.println(max_so_far);
		System.out.println("start and end indexes are: "+start+" "+end);
		for(int i=start;i<=end;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		kadane(a);
	}

}
