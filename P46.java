public class P46 {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i==j) || (i==1) || (j==n))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
