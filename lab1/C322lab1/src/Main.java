import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{2, 7, 11, 15}, {3, 2, 4}, {3, 3}};
        int[] target = {9, 6, 6};
        for(int i=0; i<nums.length; i++){
            System.out.println("Problem 1: \ninput: nums = " + Arrays.toString(nums[i]) + " target = " + target[i] + "\noutput: " + Arrays.toString(prob1(nums[i], target[i])) );
        }

        int[] x = {121, -121, 10};
        for(int i=0; i<x.length; i++){
            System.out.println("Problem 2: \ninput: " + x[i] + "\noutput: " + prob2(x[i]));
        }

        String[][] strs = {{"flower", "flow", "flight"}, {"dog" , "racecar", "car"}};
        for(int i=0; i<strs.length; i++){
            System.out.println("Problem3: \ninput: " + Arrays.toString(strs[i]) + "\noutput: " + prob3(strs[i]));
        }
    }

    //problem 1
    public static int[] prob1(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    //problem 2
    public static boolean prob2(int x){
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }

    //problem 3
    public static String prob3(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}