package com.example.newProject.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingChars {

    public static String getSubStringWithOurRepeatingChars(String input){
        char[] chars = input.toCharArray();
        List nonRepeatedList = new ArrayList();
        String longestOverall = "";
        String longestTillNow = "";
        for(int i=0; i<chars.length; i++){
            if(nonRepeatedList.contains(chars[i])) {
                longestTillNow = "";
                nonRepeatedList.clear();
            }
            longestTillNow += chars[i];
            nonRepeatedList.add(chars[i]);

            if(longestTillNow.length()>longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }
        return longestOverall;
    }
    public static void main (String[] args){
        System.out.println(getSubStringWithOurRepeatingChars("iuyishfksjhdfoiuweoiruowieru"));
    }
}
