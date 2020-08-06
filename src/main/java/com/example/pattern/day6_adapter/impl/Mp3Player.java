package com.example.pattern.day6_adapter.impl;

import com.example.pattern.day6_adapter.Player;
import com.example.pattern.day6_adapter.VideoAdapter;

public class Mp3Player implements Player {
    //适配器
    VideoAdapter adapter;
    @Override
    public void play(String type, String file) {
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("Play mp3 " + file);
        }
        if (type.equalsIgnoreCase("mp4")){
            adapter = new VideoAdapter("mp4");
            adapter.play(type,file);
        }
        if (type.equalsIgnoreCase("mp5")){
            adapter = new VideoAdapter("mp5");
            adapter.play(type,file);
        }
    }
}
