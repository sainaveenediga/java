public class P5
{
	public static void main(String[] args)
	{
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{

				if(i==1 && j==3 || i==3 && j==2)
				{
					
					System.out.print("$ ");
				}
				else{
					System.out.print("* ");
				}
			}

			System.out.println("");
		}
	}
}