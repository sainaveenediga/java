public class P41
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				if(i==1 ||j==n || i==j)
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
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1 || i==n || i==j)
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
	}
}