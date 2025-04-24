package Arrays;

import java.util.Arrays;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {


        int[] arr = {4, 6, 1, 2, 3, 1, 7};

        int smallest = arr[0];
        int secondSmallest = arr[1];

        for (int i = 2; i<arr.length; i++){
            if (arr[i]< smallest){
                secondSmallest= smallest;
                smallest= arr[i];
            }
            else {
                if (arr[i]>smallest && arr[i] <secondSmallest)
                {
                    secondSmallest= arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("smallest  "+smallest);
        System.out.println("second smallest  "+secondSmallest);
    }



}

