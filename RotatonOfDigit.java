import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class RotatonOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//digit
        int k=sc.nextInt();//no of rotation
        int temp=n;
        int c=0;
        while(temp>0)
        {
            temp/=10;
            c++;
        }
        k=k%c;  // rotation should be 1 to k or k%c
        if(k<0)
        {
            k=k+c;
        }

        int rb=(n%(int)Math.pow(10,k)) *(int)Math.pow(10,c-k);  //group of digit  that should be rotate right side
        int lb=(n/(int)Math.pow(10,k)); // digit that shift right side
        int result=rb+lb;
        System.out.println(result);
    }
}
