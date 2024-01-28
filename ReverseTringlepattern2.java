import java.util.Scanner;

public class ReverseTringlepattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=n;
        int sp=0;
        for(int i=1;i<=n;i++)
        {
            for (int j=0;j<=sp;j++)
            {
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++)
            {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }
    }
}
