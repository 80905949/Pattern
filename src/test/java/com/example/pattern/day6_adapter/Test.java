package com.example.pattern.day6_adapter;

import com.example.pattern.day6_adapter.impl.Mp3Player;

public class Test {
    public static void main(String[] args) {
        Mp3Player audioPlayer = new Mp3Player();

        audioPlayer.play("mp3","sing.mp3");
        audioPlayer.play("mp4","movies.mp4");
        audioPlayer.play("mp5","xx.mp5");
    }
}
