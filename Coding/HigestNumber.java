package Coding;

public class HigestNumber {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 19, 8, 25, 3, 16, 12 };
        
        int max = 0;

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        System.out.println("Higest Value : " + max);
    }
}
