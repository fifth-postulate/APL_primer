package nl.fifth_postulate;

import java.util.Arrays;

public class Verbose2 {

    public static void main(String[] args) {
	    int[] data = {1, 2, 3, 4, 5, 6, 7};

        int sum =
                Arrays.stream(data)
                .map(n -> n*n)
                .sum();

        System.out.println(String.format("sum = %d", sum));
    }
}
