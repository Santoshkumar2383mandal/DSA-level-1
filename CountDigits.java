import java.sql.SQLOutput;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int N=sc.nextInt();
        int count=0;
         while(N>0)
         {
             N=N/10;
             count++;
         }
        System.out.println("No of digit ="+count);
    }

}
