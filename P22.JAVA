public class P22
{
	public static void main(String[] args)
	{
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i+1;j++)
			{
				if(j%2==0)
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