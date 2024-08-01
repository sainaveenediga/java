public class P8
{
	public static void main(String[] args)
	{
		int i,j,n=3;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{

				if(j%2==0)
				{
					
					System.out.print("# ");
				}
				else{
					System.out.print("$ ");
				}
			}

			System.out.println("");
		}
	}
}