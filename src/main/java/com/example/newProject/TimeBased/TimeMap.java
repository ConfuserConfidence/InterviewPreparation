package com.example.newProject.TimeBased;

import java.util.*;

public class TimeMap {
    private Map<String, ArrayList<TimestampMap>> entriesByKey;
    public TimeMap(){
        entriesByKey = new HashMap<>();
    }

    public void set(String key, String value, int timestamp){
        if (!entriesByKey.containsKey(key)) {
            entriesByKey.put(key, new ArrayList<>());
        }
        ArrayList<TimestampMap> timestampValues = entriesByKey.get(key);
        timestampValues.add(new TimestampMap(timestamp,value));
    }
    public String get(String key, int timestamp){
        if(!entriesByKey.containsKey(key))return "";
        ArrayList<TimestampMap> timestampMap = entriesByKey.get(key);
        return getExactTimestampValue(timestampMap,timestamp);
    }

    private String getExactTimestampValue(ArrayList<TimestampMap> timestampMap, int timestamp) {
        int left = 0;
        int right = timestampMap.size()-1;
        int matchIndex = -1;
        while(left<=right){
            int mid = left+(right-left);
            TimestampMap value = timestampMap.get(mid);
            if(value.getTimeStamp()<= timestamp){
                matchIndex = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        if(matchIndex==-1){
            return "";
        }
        return timestampMap.get(matchIndex).getKey();
    }
}
