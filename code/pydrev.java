class pydrev
{
    public static void main(String[]args)
    {
        int i,j,space;
        space=3;
        for(i=4;i>=1;i--)
        {
            for(j=space;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }

}