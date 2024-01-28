import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintEachDigit_ofA_number {
    public static void main(String[] args) {
        //List<Integer> digit=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp>0)
        {
            int i=n%10;
            //count++;
            //digit.add(i);
            temp=temp/10;
            count++;
        }
        ////////// other method
        int div=(int)Math.pow(10,count-1);
        //while(n>0) --> unable to print zero digit
        // while(n>=0)--> Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	              at PrintEachDigit_ofA_number.main(PrintEachDigit_ofA_number.java:25)
        //while(div>=0)  ---->Exception in thread "main" java.lang.ArithmeticException: / by zero
          //            at PrintEachDigit_ofA_number.main(PrintEachDigit_ofA_number.java:25)

        while(div>0) // while (div!=0)
        {
            int i=n/div;
            System.out.println(i);
            n=n%div;
            div=div/10;
        }
        /////////////////////////////
//        Collections.reverse(digit);
//        //System.out.println(digit);
//        for(int x1:digit){
//            System.out.println(x1);
    }

}

