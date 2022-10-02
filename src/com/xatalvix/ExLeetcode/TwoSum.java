package com.xatalvix.ExLeetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers={11, 15, 2, 7};
        int target=18;
        int[] request = (twoSumN1(numbers, target));

        System.out.println("twoSumN1");
        for (int t : request) {
            System.out.print(t + " ");
        }
        System.out.println();

        int[] request2 = (twoSumN2(numbers, target));
        System.out.println("twoSumN2");
        for (int g : request2) {
            System.out.print(g + " ");
        }
        System.out.println();

        System.out.println("twoSumN3");
        for(int b : twoSumN3(numbers , target))
            System.out.print(b + " ");
        System.out.println();
    }
    public static int[] twoSumN1(int[] nums, int target) {
        System.out.println("target: " + target);

        for (int i =0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        // No solution for defined input data
        throw new IllegalArgumentException("Нет решения для определенных входных данных");
    }

    public static int[] twoSumN2(int[] nums, int target) {
        System.out.println("target: " + target);

        Map<Integer, Integer> map =new HashMap<>();
        for (int i =0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for (int i =0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
                return new int [] {i, map.get(requiredNumber)};
            }
        }
        // No solution for defined input data
        throw new IllegalArgumentException("Нет решения для определенных входных данных");
    }
    static int[] twoSumN3(int[] nums , int target) {
        System.out.println("target: " + target);

        int left = 0 , right = nums.length - 1 , tempSum;
        while(left < right)
        {
            tempSum = nums[left] + nums[right];
            if(tempSum == target)
                return new int[]{left + 1 , right + 1};
            if(tempSum > target)
                right--;
            else
                left++;
        }
        return new int[]{-1 , -1};
    }
}

