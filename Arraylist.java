import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(45);
        arr1.add(475);
        //System.out.println(arr1);
        for (int i=0;i<arr1.size();i++)
        {
            System.out.println(arr1.get(i));
        }


    }
}
