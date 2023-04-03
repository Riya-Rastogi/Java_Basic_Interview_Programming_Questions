import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if(n<0)
        {
            System.out.println("n cannot be a negative number");
        }
        if(n==0)
        {
            System.out.println(a);
        }
        else if(n==1)
        {
            System.out.println(b);
        }
        else{
            int c=0;
            for(int i=0;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
                
            }
            System.out.println(c);
        }
    }
}