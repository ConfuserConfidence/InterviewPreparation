package com.example.newProject.coreJava;

public class PalindromeString {

    public static void main(String[] args){
        System.out.println(isPalindrome("Malayalam"));
    }

    private static boolean isPalindrome(String madam) {
        int left = 0;
        int right = madam.length()-1;
        while (left<right){
            if(madam.charAt(left)!= madam.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
