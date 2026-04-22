import java.util.Scanner;
class Evenoad
{
    public static void main(String [] args)
    {
        int age;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your age");
        age=s1.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not Eligible for vote");
        }
    }
}