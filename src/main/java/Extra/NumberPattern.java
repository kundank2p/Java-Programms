package Extra;

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            int num = getStartingNumber(i); // Function to get the starting number for row i
            int diff = i - 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num -diff;
                diff--;
            }
            System.out.println();
        }
    }

    // This function returns the first number of each row
    private static int getStartingNumber(int row) {
        if (row == 1) return 1;

        int start = 1;
        for (int i = 2; i <= row; i++) {
            start = start + (i - 1);
        }
        return start;
    }
}
