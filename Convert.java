public class Convert {
    public static void main(String[] args) {
        int n=4;
        int rem=0;
       int  count=0;
       double sum=0;
        while (n!=0)
        {

            rem=n%2;
            count++;
            System.out.print(rem);
            sum=sum+rem*Math.pow(2,32-(count));


            n=n/2;
        }
        System.out.println();
        System.out.println(sum);

    }
}
