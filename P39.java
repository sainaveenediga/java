public class P39
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i==j || j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(i=1;i<=n-1;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				if(i==j || j==n-1)
				{					
					System.out.print("*");
					
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}