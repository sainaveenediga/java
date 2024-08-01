public class P43
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}

	}
}