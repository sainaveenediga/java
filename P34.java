public class P34
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		{
			for(i=1;i<=n;i++)
			{
				int k=65;
				for(j=1;j<=n-i+1;j++)
				{
					System.out.print((char)k);
					k++;
					
				}
				System.out.println("");
			}
		}
	}
}