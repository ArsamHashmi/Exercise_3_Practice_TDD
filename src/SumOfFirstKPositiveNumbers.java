public class SumOfFirstKPositiveNumbers {
    public static int sumOfFirstKPositiveNumbers(int[] array, int k) {
        if (k <= 0) return 0; // handle case where k is not positive
        int count = 0;
        int sum = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
                if (count == k) break;
            }
        }
        return sum;
    }
}
