import java.util.Arrays;
import java.util.Scanner;

public class InverseOfA_number {
    public static void main(String[] args) {
  //      Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int size=sc.nextInt();
//
//        int arr[]=new int[size];
//        int c=0;
//        while(n>0)
//        {
//            int rem=n%10;
//            n=n/10;
//            c++;
//            arr[rem-1]=c;
//        }
//        for(int i=size-1;i>=0;i--)
//        {
//            System.out.print(arr[i]);
//        }
      //////////////////////
        //2nd way
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       // int size=sc.nextInt();
        int result=0,c=0;
        while(n>0)
        {
            int rem=n%10;
            c++;
            result+=c*(int)Math.pow(10,rem-1);
            n=n/10;
        }
        System.out.println(result);


    }
}
