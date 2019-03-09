/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(n!=0)
		{
			//n=n/10
		n /=10;
		++count;
		}
		System.out.println(count);
	}
}
