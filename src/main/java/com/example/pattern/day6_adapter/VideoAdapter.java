package com.example.pattern.day6_adapter;

import com.example.pattern.day6_adapter.impl.Mp5Player;
import com.example.pattern.day6_adapter.impl.Mp4Player;

public class VideoAdapter implements Player{
    Media media;

    public VideoAdapter(String type) {
        if(type.equalsIgnoreCase("mp4")){
            media = new Mp4Player();
        }
        if(type.equalsIgnoreCase("mp5")){
            media = new Mp5Player();
        }
    }

    @Override
    public void play(String type,String file) {
        media.play(file);
    }
    //接口类就是事物的本质，或者说是原材料。比如所有的木雕都是使用的木材
    //继承类就是父子关系，父亲有的，儿子都有。
    //抽象类就是已经有范围，但是还可以继续定制化
    //OOA OOD OOP
    //思想=数据+逻辑
    //程序=数据+逻辑
}
