import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=1;k<=t;k++)
        {
            int n=sc.nextInt();
            int A[]=new int[n];
            for(int i=0;i<A.length;i++)
            {
                A[i]=sc.nextInt();
            }
            int min=A[0];
            for(int i=0;i<A.length;i++)
            {
                if(A[i]<min)
                {
                    min=A[i];

                }
            }
            Arrays.sort(A);
            int result=0;
            boolean flag = false;
            for(int i=1;i<=min;i++)
            {
                for(int j=0;j<A.length;j++)
                {
                    if(A[j]%i !=0)
                    {
                        flag = true;
                    }
                }
                if(flag){
                    flag = false;
                    continue;
                }
                result=i;

            }
            System.out.println(result);
        }
    }
}