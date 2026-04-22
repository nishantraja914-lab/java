class nishant
{
    public static void main(String[] args)
    {
        int size = 2;

        switch(size)
        {
            case 1:
                System.out.println("Extra small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Medium");
                break;
            case 4:
                System.out.println("Large");
                break;
            case 5:
                System.out.println("Extreme large");   
                break; 
            default:
                System.out.println("Invalid size");
                break;               
        }
    }
}