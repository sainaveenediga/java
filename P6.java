public class P6
{
	public static void main(String[] args)
	{
		int i,j,n=3;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				//if(i==1 && j==2 || j==1 && i==2 || i==2 && j==3 || i==3 && j==2)
				//{
				//	System.out.print("@ ");
				//}
				//else
				//{
					//System.out.print("* ");
				//}
				if(i==j || i==n && j==1 || j==n && i==1)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("@ ");
				}
			}

			System.out.println("");
		}
	}
}