import java.util.*;
public class FrequencyOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        if(n==0 && d==0)
        {
            System.out.println("1");
        }
        if(n<0)
        {
            n=-n;
        }
        int counter=0;
        while(n!=0)
        {
            int digit=n%10;
            if(digit==d)
            {
                counter++;
            }
            n=n/10;
        }
        System.out.println(counter);
    }
}
