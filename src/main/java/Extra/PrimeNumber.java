package Extra;

public class PrimeNumber {

    public static void main(String[] args) {
        isPrimeNumber(29);
        isPrimeNumber(33);

    }

    private static void isPrimeNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2)
            System.out.println(+n + " is   a prime number");
        else
            System.out.println(+n + " is not  a prime number");
    }

}

