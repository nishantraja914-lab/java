import java.util.Scanner;
class table {
    public static void main(String[] args)
    {
        int num;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s1.nextInt();
       for(int i=1;i<=10;i++)
       {
           System.out.println(num+"*"+i+"="+num*i);
       }
    }
}