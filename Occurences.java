import java.util.HashMap;
import java.util.ArrayList;
public class Occurences {



    public static void main(String[] args)
    {

        int[] num = {1,2,3,4,5,6,6,7,2,4,4,};



        kth(num,2);

    }

    public static void kth(int[] arr, int k)
    {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 0; i < arr.length; i++){
            if (numMap.containsKey(arr[i]))
                numMap.put(arr[i],numMap.get(arr[i]) + 1);
            else
                numMap.put(arr[i],1);

        }

        for (int i = 0; i < arr.length; i++){

            if (result.contains(arr[i]))
                continue;

            if (numMap.get(arr[i]) == k )
            {
                result.add(arr[i]);

            }
        }



        System.out.println(result);



    }
}
