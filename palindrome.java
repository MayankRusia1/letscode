public class palindrome {
    public static void main(String[] args)
    {
        int a=121;
        int b=a,c=0,rem=0;
        while(b>0)
        {
            c=b%10;
            rem=rem*10+c;
            b=b/10;
        }
        if(rem==a)
        System.out.println(a+" is a palindrome number");
        else
        {
        System.out.println(a+" is NOT palindrome number");
    }}
}
