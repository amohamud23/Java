import java.util.ArrayList;
import java.util.Collections;

public class smallest {

    public static void main(String[] args){

        int[] arr = {10,3,5,7,1};
        int min = arr[0];
        int[] arr2 = arr.clone();

        for (int i = 0; i < arr2.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }

        }
        System.out.print(Nthsmallest(arr,2));

    }

    public static int Nthsmallest(int[] arr, int n){

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            arrayList.add(arr[i]);
        }

        Collections.sort(arrayList);


        return arrayList.get(n-1);
    }
}
