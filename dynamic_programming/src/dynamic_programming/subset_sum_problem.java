package dynamic_programming;

import java.util.Scanner;

public class subset_sum_problem {

	static boolean isSubset(int a[],int sum,int n)
	{
		boolean[][] table=new boolean[n][sum+1];
		for(int i=0;i<n;i++)
			table[i][0]=true;
		if(a[0]<=sum)
		{
			int index=a[0];
			table[0][index]=true;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<sum+1;j++)
			{
				if(j<a[i])
					table[i][j]=table[i-1][j];
				else if(table[i-1][j]==true)
					table[i][j]=true;
				else
				{
					int val=j-a[i];
					table[i][j]=table[i-1][val];
				}
			}
		}
		
		//checking weather it is giving correct output in matrix representation or not

//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<sum+1;j++)
//			{
//				System.out.print(table[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		return table[n-1][sum];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int sum=s.nextInt();
		if(isSubset(a,sum,n))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
