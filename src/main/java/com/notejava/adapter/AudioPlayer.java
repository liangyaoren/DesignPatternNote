package com.notejava.adapter;

/**
 * @author lyle 2018/6/21 14:35.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter = null;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equals(audioType)) {
            //内置播放mp3功能
        } else if ("vlc".equals(audioType) || "mp4".equals(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("not match audioType");
        }
    }
}
