import java.util.*;
public class CountDigitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println(1);
        }
        if(n<0)
        {
            n=-n;
        }
        int res=0;
        while(n!=0)
        {
            n=n/10;
            res++;
        }
        System.out.println(res);
    }
}
