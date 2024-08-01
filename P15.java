public class P15
{
	public static void main(String[] args)
	{
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || i==n ||j==1 || j==n)
				
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println("");
		}
	}
}