import java.util.Scanner;

public class FindGCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
            int num1=n1;
            int num2=n2;
            while(num1 % num2 != 0) {
             int  rem = num1 % num2;
                num1 = num2;// first line
                num2 = rem;/// second line

            }
            int gcd=num2;
        System.out.println("gcd =  "+num2);
            int lcm=(n1*n2)/gcd;
        System.out.println(lcm);

    }
}
