import java.util.Scanner;

public class FrequencyOfA_Number {

    public int frequecu(int digit,int sd) {
        int count = 0;
        while (digit > 0) {
            int rem = digit % 10;
            if (rem == sd) {
                count++;
            }
            digit /= 10;
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int sd=sc.nextInt();
        FrequencyOfA_Number fn=new FrequencyOfA_Number();
        System.out.println(fn.frequecu(digit,sd));


    }


 }


