package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class longest_common_subsequence {
	
	static void lcs(String str1,String str2,int l1,int l2)
	{
		int l[][]=new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++)
		{
			for(int j=0;j<=l2;j++)
			{
				if(i==0||j==0)
					l[i][j]=0;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					l[i][j]=l[i-1][j-1]+1;
				else
					l[i][j]=Math.max(l[i][j-1],l[i-1][j]);
			}
		}
		System.out.println(l[l1][l2]);//longest length of substring
		
		//for printing subsequence
		int index=l[l1][l2];
		int temp=index;
		char[] c=new char[temp+1];
		c[index]='\0';
		
		int i=l1;
		int j=l2;
		while(i>0&&j>0)
		{
			if(str1.charAt(i-1)==str2.charAt(j-1))
			{
				c[index-1]=str1.charAt(i-1);
				i--;
				j--;
				index--;
			}
			else if(l[i-1][j]>l[i][j-1])
			{
				i--;
			}
			else
				j--;
		}
		String answer=new String(c);
		System.out.println(answer);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int l1=str1.length();
		int l2=str2.length();
		lcs(str1,str2,l1,l2);
		
	}

}
