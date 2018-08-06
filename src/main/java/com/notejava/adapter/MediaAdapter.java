package com.notejava.adapter;

/**
 * @author lyle 2018/6/21 14:34.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equals(audioType)) {
            advancedMusicPlayer = new VlcPlayer();
        } else if ("mp4".equals(audioType)) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equals(audioType)) {
            advancedMusicPlayer.playVlc(fileName);
        } else if ("mp4".equals(audioType)) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
