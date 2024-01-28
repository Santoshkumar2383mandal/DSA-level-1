import java.util.Scanner;

public class PythagoreousTripplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;

//       if(a*a==b*b+c*c)
//           count++;
//       if(b*b==a*a+c*c)
//           count++;
//       if(c*c==a*a+b*b)
//           count++;
//           if(count==1)
//               System.out.println("A valid side of triangle");
//
        int max=a;
        if(b>max)
            max=b;
        if(c>max)
          max=c;
        if(max==a)
        {
            boolean flag=(a*a==b*b+c*c);
            System.out.println(flag);
        }
        else if(max==b)
        {
            boolean flag=(b*b==a*a+c*c);
            System.out.println(flag);

        }
        else
        {
            boolean flag=(c*c==a*a+b*b);
            System.out.println(flag);
        }

    }
}
