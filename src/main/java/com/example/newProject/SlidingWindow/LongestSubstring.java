package com.example.newProject.SlidingWindow;

import java.util.Arrays;

public class LongestSubstring {

    private static int longestSubString(String s){
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while(right < n){
            if(hash[s.charAt(right)]!=-1){
                if(hash[s.charAt(right)]>=1){
                    left = hash[s.charAt(right)]+1;
                }
            }
            int length = right-left;
            maxLength=Math.max(length,maxLength);
            hash[s.charAt(right)]=right;
            right++;
        }
        return maxLength;


    }
    public static void main(String[] args){
        System.out.println(longestSubString("saikumolartulugu"));
    }
}
