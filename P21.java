public class P21
{
	public static void main(String[] args)
	{
		int i,j,n=4,k=65;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)k);
				k++;
			}
			System.out.println("");
		}
	}
}