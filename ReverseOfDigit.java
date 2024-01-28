import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            int rem=0;
            if(n<0)
            {
                n=n*(-1);
                System.out.print("-");
            }
            if(n%10==0)
            {
                n=n/10;
            }
            else {
                rem = n % 10;
                System.out.print(rem);
                n = n / 10;
            }
            if(n<Integer.MIN_VALUE && n>Integer.MAX_VALUE)
            {
                System.out.println("lmknbv");
            }
            else
                System.out.println("max");
        }
    }
}
