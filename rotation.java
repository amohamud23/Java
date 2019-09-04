public class rotation {

    public static void main(String args[]){

        int[] arr = {1, 2, 3, 4, 5};
        int temp=0;
        int n = 2; //The number of times it is rotated.
        for (int j = 0; j < n; j++) {
            int begin = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                temp = arr[i];
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = begin;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
