package com.src.pkg;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Infosyss";
		int len=s.length();
		int count=0;
		char c='s';
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)==c)
				{
					count++;
				}
	}
       System.out.println(count);
       
       String string="The best of both worlds";
       int count1=0;
       int len1=string.length();
       for(int i=0;i<len1;i++)
       {
    	     if(string.charAt(i)!=' ')
    	     {
    	    	   count1++;
    	     }
       }
       System.out.println(count1);
	}

}
