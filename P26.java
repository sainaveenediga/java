public class P26
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3)
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
}