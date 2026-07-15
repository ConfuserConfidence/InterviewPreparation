package com.example.newProject.SlidingWindow;

public class MaxSumSubArray {
    public static int getMaxSumSubArray(int[] intArray, int subArrayLength){
        int sum = 0;
        int maxSum = 0;
        int leftPointer = 0;
        int rightPointer = subArrayLength;
        for (int i=0; i<subArrayLength; i++){
            sum = sum+intArray[i];
        }
        maxSum = sum;
        while(rightPointer<intArray.length){
            sum -= intArray[rightPointer];
            rightPointer++;

            sum += intArray[leftPointer];
            leftPointer++;

            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main (String[] args){
        int[] array = {3,5,2,6,2,3,6,3,7,8,3,6,3,6,4,5};
        System.out.println(getMaxSumSubArray(array,4));
    }
}
