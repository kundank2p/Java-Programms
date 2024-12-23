public class PrintDuplicateElementsArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8,2,3,4,5,2,4,5,3,5,6,4,6, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.print(arr[j]);
            }
        }




    }
}
