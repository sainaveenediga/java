public class P36
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			int k=69;
			for(j=n;j>=i;j--)
			{
				
				System.out.print((char)k);
				k--;
			}
			System.out.println("");
		}
	}
}