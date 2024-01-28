
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
//////////////////////////////////////   Work as infix to post fix
public class nsetr{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ngi = new int[n];
        for (int i = 0; i < ngi.length; i++) {
            ngi[i] = Integer.parseInt(br.readLine());
        }
        int[] a = solve(ngi);
        //////////////////////////////////////
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");  //print elements
            ////////////////////////////////////////
        }
    }
    /////////////////////////////////////////////////////////////////////
    public  static int[] solve(int[] arr)
    {
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        st.push(0);
        for (int i=1;i< arr.length;i++)
        {
            //In stack we only store ony position of array's index

            while(st.size()>0 && arr[i]<arr[st.peek()]) /// hare we are comparing array[i] with arr[stack peek element] but stack hold only aaray position
            {
                int pos=st.peek();
                nge[pos]=arr[i];

                st.pop();// pop element until you get a max element

            }
            st.push(i);


        }

        while (st.size()>0)
        {
            nge[st.peek()]=-1;
            st.pop();
        }
        return nge;
    }
    ///////////////////////////////////////////////////////////////////////
}
