public class P4
{
	public static void main(String[] args)
	{
		int i,j,n=6;
		for(i=1;i<=n/2;i++)
		{
			for(j=1;j<=n;j++)
			{
				
				if(i==1 && j==n)
				{
					System.out.print("& ");
				}
				else if(i==2 && j==1)
				{
					
					System.out.print("# ");
				}
				else if(i==3 && j==n-2)
				{
					
					System.out.print("$ ");
				}
				else{
					System.out.print("@ ");
				}
			}

			System.out.println("");
		}
	}
}