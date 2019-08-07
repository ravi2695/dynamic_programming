package dynamic_programming;

import java.util.Scanner;

public class longest_palindrme_in_string {

	static int longestPalindromeInString(String str)
	{
		int len=str.length();
		boolean[][] table=new boolean[len][len];
		//1.for one letter all are palindrome so to every i=j set value as true in table
		for(int i=0;i<len;i++)
			table[i][i]=true;
		//2.for two letter check for charAt(i)&&charAt(j) equality accordingly set value as true in table
		int maxLength=1;
		int start=0;
		for(int i=0;i<len-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				table[i][i+1]=true;
				maxLength=2;
				start=i;
			}
		}
		
		//3.for greater than two accordingly set value as true in table
		for(int k=3;k<=len;k++)
		{
			for(int i=0;i<len-k+1;i++)
			{
				int j=i+k-1;
				if(table[i+1][j-1]&&str.charAt(i)==str.charAt(j))
				{
					table[i][j]=true;
					if(k>maxLength)
					{
						maxLength=k;
						start=i;
					}
				}
			}
			
		}
		System.out.println(str.substring(start,start+maxLength));
		return maxLength;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int size=longestPalindromeInString(str);
		System.out.println(size);

	}

}
