import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n=sc.nextInt();
			if(n==0)
			  break;
			int m=sc.nextInt();
			int[] a=new int[n];
			int[] b=new int[m];
			for(int i=0;i<n;i++)
			    a[i]=sc.nextInt();
			for(int j=0;j<m;j++)
			    b[j]=sc.nextInt();
			double[] c=new double[n*m];
			int k=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					c[k]=b[j]*1.0/a[i];
					k++;
				}
			}
			Arrays.sort(c);
			double val =-1;
			for (int i=0;i<c.length-1;i++) 
			{
				val=Math.max(val,c[i+1]/c[i]);
			}
			System.out.printf("%.2f\n",val);
		}
	}
}
