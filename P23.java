public class P23
{
	public static void main(String[] args)
	{
		int i,j,n=4;
		for(i=1;i<=n+1;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("0");	
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println("");
		}
	}
}