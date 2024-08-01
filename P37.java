public class P37
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				if(i==2 && j==4 || i==2 && j==3 || i==3 && j==4)
				{
					System.out.print("& ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println("");
		}
	}
}