package dynamic_programming;

import java.util.Scanner;

public class longest_increasing_subsequence {

	static int longest_increasing_subsequence(int a[],int n)
	{
		int max=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=1;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j]&&arr[i]<arr[j]+1)
				{
					arr[i]=arr[j]+1;
					if(max<arr[i])
						max=arr[i];
				}
			}
		}
		return max;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int ans=longest_increasing_subsequence(a,n);
		System.out.println(ans);

	}

}
