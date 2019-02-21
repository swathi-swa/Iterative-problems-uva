import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int c=0;
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(a[i]>=a[j])
						c++;		
				}
			}
			System.out.println(c);
		}
	}
}
