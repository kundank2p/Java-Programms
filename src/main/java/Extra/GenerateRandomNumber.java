package Extra;// Java program to generate a random integer
// within this specific range

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
    public static double getRandomValue(double Min, double Max) {
// Get and return the random integer
// within Min and Max
        return ThreadLocalRandom
                .current()
                .nextDouble(Min, Max);
    }

    // Driver code
    public static void main(String[] args) {
        double Min = 1, Max = 2;
        System.out.println("Random value between "
                + Min + " and " + Max + ": "
                + getRandomValue(Min, Max));
    }
}
