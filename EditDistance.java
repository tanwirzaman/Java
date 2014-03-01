package org.dynprog.practice;

public class EditDistance {

	
	public static int EditDistance(String str1,String str2)
	{
		int result=0;
		
		int rows=str2.length();
		int cols=str1.length();
		
		int E[][]=new int[rows][cols];
		
		for(int i=0;i<str1.length();i++)
			E[0][i]=i;
		for(int j=1;j<str2.length();j++)
			E[j][0]=j;
		for(int j=1;j<str2.length();j++)
		{
			for(int i=1;i<str1.length();i++)
			{
				int temp=Math.min(1+E[j][i-1],1+E[j-1][i]);
				if(str1.charAt(i)==str2.charAt(j))
				{
					E[j][i]=Math.min(temp, E[j-1][i-1]);
				}
				else
				{
					E[j][i]=Math.min(temp, 1+E[j-1][i-1]);
				}
					
			}
		}
		result=E[str2.length()-1][str1.length()-1];
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne="EXPONENTIAL";
		String strTwo="POLYNOMIAL";
		
		int editDistance=EditDistance(strOne, strTwo);
		System.out.println("Edit Distance :"+editDistance);
	}

}
