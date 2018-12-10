package nl.fifth_postulate;

public class Verbose1 {

    public static void main(String[] args) {
	    int[] data = {1, 2, 3, 4, 5, 6, 7};
        int length = data.length;

        int sum = 0;
	    for (int index = 0; index < length; index++) {
	        int n = data[index];
	        n *= n;
	        sum += n;
        }

        System.out.println(String.format("sum = %d", sum));
    }
}
