package firstWeekReview;

import java.util.Arrays;

public class TwoSum {

    /**
     * Problem: Two Sum
     * • Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * • You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * • You can return the answer in any order.
     * • No solution will return empty array.
     * Example:
     * Input: nums = [2, 7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */


    public static void main(String[] args) {

        int[] arr = {2,7,3,5,10};
        int[] arr2 = {4,7,2,11,10};
        System.out.println(Arrays.toString(twoSumIndex(arr2,9)));
    }

    //Bruteforce solution of Two Sum problem
    public static int[] twoSumIndex(int[] array, int targetValue){

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                if(i!=j){
                    if(array[i]+array[j]==targetValue){
                        return new int[]{i, j};
                    }
                }

            }
        }
        return new int[]{};
    }

}
