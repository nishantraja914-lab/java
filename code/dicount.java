import java.util.Scanner;
class dicount
{
    public static void main(String [] args)
    {
        int age;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your age");
        age=s1.nextInt();

        int cost;
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter your cost");
        cost=s2.nextInt();

        if(cost>=100 && age>=60)
        {
           System.out.println("Eligible for discount");
        }
        else
        {
           System.out.println("not eligible for discount");
        }
    }
}