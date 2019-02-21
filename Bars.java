import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int l=in.nextInt();
			int n=in.nextInt();
			int a[]=new int[1004];
			a[0]=1;
			for(int i=0;i<n;i++)
			{
				int b=in.nextInt();
				for(int j=l-b;j>=0;j--)
				{
					if(a[j]==1)
						a[j+b]=1;
				}
			}
			if(a[l]==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
