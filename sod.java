public class sod {
    public static void main(String[] args)
    {
        int sum=0;
        int a=25413;
        int b=a,c=0;
        while(b>0)
        {
            c=b%10;
            sum=sum+c;
            b=b/10;
        }
        System.out.println("Sum of digits of "+a+" is: "+sum);
    }
}
