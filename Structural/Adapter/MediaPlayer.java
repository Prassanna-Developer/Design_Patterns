package com.prassannas.designpatterns.adapter;

public class MediaPlayer implements IMediaPlayer {

	MediaAdapter mediaAdapter = null;

	public void play(String audioType, String fileName) {
		mediaAdapter = new MediaAdapter(audioType);
		if (audioType.equals("mp3")) {
			System.out.println("Playing Using MP3 Format");
		} else if ((audioType.equals("mp4")) || (audioType.equals("vlc"))) {
			mediaAdapter.play(audioType, fileName);
		}
		else{
			System.out.println("Unsupported Format!!!");
		}
	}

}
