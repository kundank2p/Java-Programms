package StringProblems;

public class FindElement {
    private static int searchElement;

    public static void main (String [] args){
        int array [] ={12,3,5,6,8,3,7,14,2,6,9,8,4,2,2};
        int searchElement = 9;
        boolean status = false;
        for (int i = 0 ; i<array.length;i++)
        {
            if (array[i]==searchElement)
            {
                System.out.println("Element Found");
                status= true;
                break;
            }
        }
        if (!status) {
            System.out.println("Element Not Found");
        }
    }
}
