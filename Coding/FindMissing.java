package Coding;

public class FindMissing {
    public static void main(String[] args) {
        int[] series = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        missingNumber(series);
    }

    public static void missingNumber(int[] nums) {
        int n = nums.length + 1;
        int total = n * (n + 1) / 2;

        int val = 0;
        for (int num : nums) {
            val += num;
        }
        System.out.println(total - val);
    }
}
