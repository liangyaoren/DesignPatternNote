package com.notejava.adapter;

/**
 * @author lyle 2018/6/21 14:36.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play MP4 : " + fileName);
    }
}
