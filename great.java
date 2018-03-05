/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner s=new Scanner(System.in);
        System.out.println("enter number 1");
        int c=s.nextInt();
        int b=s.nextInt();
        int a=s.nextInt();
        if(a>b && a>c)
            {
                System.out.println(a);
            }
          else if(b>a && b>c)
            {
                System.out.println(b);  
            }
          else if(c>a && c>b)
                {
                    System.out.println(c);   
                }
          else {
              System.out.println("no.of.elements are grea2 ter");
          }
	}
}
