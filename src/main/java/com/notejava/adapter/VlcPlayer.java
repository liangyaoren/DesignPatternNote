package com.notejava.adapter;

/**
 * @author lyle 2018/6/21 14:36.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
