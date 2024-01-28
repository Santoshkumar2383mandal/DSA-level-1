import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int min=0;
        int max=0;
        for (int i=0;i<n;i++)
        {
            //System.out.println("enter");
            int num=sc.nextInt();
            if(i==0)
            {
                min=max=i;
            }



                max=max(max,num);


                min=min(min,num);
        }
        System.out.println(max-min);
    }
    public static int min(int a,int b)
    {
        return a<b?a:b;
    }
    public static int max(int a,int b)
    {
        return a>b?a:b;
    }



}
