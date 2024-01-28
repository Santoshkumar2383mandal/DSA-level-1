import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max,min;
        max=min=arr[0];
        for(int i=0;i<size;i++)
        {
           if(arr[i]>max)
           {
               max=arr[i];
           }
           if(arr[i]<min)
           {
               min=arr[i];
           }
        }
        System.out.println(max-min);

    }
}
