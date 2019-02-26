package com.src.pkg;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "CapgeminieccCCc";
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
					
			}
		}
       System.out.println(count);
	}

}
