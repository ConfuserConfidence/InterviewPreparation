package com.example.newProject.SlidingWindow;

public class SlidingWindow {

    public static double findOUtMaxAverageInContinuousList(int[] nums, int k){
        int sum=0;
        int maxSum = 0;
        for (int i=0; i<k; i++){
            sum += nums[i];
        }
        maxSum = sum;
        int startIndex = 0;
        int endIndex = k;
        while (endIndex < nums.length){
            sum -=  nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum/k;
    }
    public static void main(String args[]){
        int[] numbers = {1,4,5,6,3,4,1,4,6};
        int k=2;
        System.out.println(findOUtMaxAverageInContinuousList(numbers,k));
    }
}
