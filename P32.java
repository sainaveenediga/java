public class P32
{
	public static void main(String[] args)
	{
		int i,j,n=5,k=65;
		{
			for(i=1;i<=n;i++)
			{
				for(j=n;j>=i;j--)
				{
					System.out.print((char)k);
				}
				k++;
				System.out.println("");
			}
		}
	}
}