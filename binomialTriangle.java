import java.util.Scanner;

public class binomialTriangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lno = sc.nextInt();
        for (int n = 0; n <= lno; n++) {
            for (int r = 0; r <= n; r++) {
                System.out.print(fact(n) / (fact(n - r) * fact(r)) +"\t");
            }
            System.out.println();
        }

    }

        public static int fact(int f)
        {
            int f1 = 1;

            if (f == 0)
                return 1;
            else {
                for (int i = 1; i <= f; i++) {
                    f1 = f1 * i;
                }
                return f1;
            }
        }

}


