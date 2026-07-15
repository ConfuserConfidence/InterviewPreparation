package com.example.newProject.TimeBased;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TimestampMap {
    private String key;
    private int timeStamp;

    public TimestampMap(int timestamp, String key){
        this.key = key;
        this.timeStamp = timestamp;
    }
}
