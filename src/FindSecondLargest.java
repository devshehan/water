public class FindSecondLargest {

    public static int findSecondLargest(int[] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax) {
                secondMax = j;
            }
        }
        return secondMax;
    }
}
