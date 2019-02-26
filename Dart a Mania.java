import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s="";
		for(int i=0;i<70;i++)
			s+="*";
		HashSet<Integer> b=new HashSet<Integer>();
		for(int i=0;i<=20;i++)
		{
			b.add(i);
			b.add(2*i);
			b.add(3*i);
		}
		b.add(50);
		List<Integer> a=new ArrayList<Integer>(b);
		while(true)
		{
			int n=sc.nextInt();
			if(n<=0)
			   break;
			int c=0;int p=0;
			for(int i=0;i<a.size();i++)
			{
				for(int j=0;j<a.size();j++)
				{
					for(int k=0;k<a.size();k++)
					{
						if(a.get(i)+a.get(j)+a.get(k)==n)
						{
						  p++;
						if(j>=i&&k>=j)
						  c++;
						}
					}
				}
			}
			if(p==0)
				System.out.println("THE SCORE OF "+n+" CANNOT BE MADE WITH THREE DARTS.");
			else
				{
					System.out.println("NUMBER OF COMBINATIONS THAT SCORES "+n+" IS "+c+".");
					System.out.println("NUMBER OF PERMUTATIONS THAT SCORES "+n+" IS "+p+".");
				}
		    System.out.println(s);
		}
		System.out.println("END OF OUTPUT");
	}
}
