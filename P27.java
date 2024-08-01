public class P27
{
	public static void main(String[] args)
	{
		int i,j,n=5,k=2;
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(k);
					k=k+2;
				}
				System.out.println("");
			}
		}
	}
}