import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of inputs");
        int t = sc.nextInt();

        for(int i=0;i<t;i++) {
            int n=sc.nextInt();
            int flag=0;
            if (n == 1)
                System.out.println("Digit " + n + " is not a prime number");
            else if (n == 2)
                System.out.println("Digit " + n + " a prime number");
            else {
                for ( i = 2; i < Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        flag++;
                        break;
                    }
                }
                if (flag == 1)
                    System.out.println("Digit " + n + " is not a prime number");
                else
                    System.out.println("digit " + n + " is a prime number");
            }
        }
    }
}

