/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception	
{
	Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			if(c=='a'||c=='e'||c=='i'||c=='0'||c=='u')               
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		
		}
	else
			{
				System.out.println("invalid");
			}
		
	}
}
