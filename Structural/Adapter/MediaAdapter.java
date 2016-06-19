package com.prassannas.designpatterns.adapter;

public class MediaAdapter implements IMediaPlayer{
	
	String audioType =null;
	IAdvancedMediaPlayer advancedMediaPlayer = null;

	public MediaAdapter(String audioType) {
		this.audioType = audioType;
		if(audioType.equals("vlc")){
			advancedMediaPlayer = new VLCPlayer();
		}
		else if(audioType.equals("mp4")){
			advancedMediaPlayer = new MP4Player();
		}
	}

	public void play(String audioType, String fileName) {
		if(audioType.equals("vlc")){
		advancedMediaPlayer.playVlc(fileName);
		}
		else if(audioType.equals("mp4")){
			advancedMediaPlayer.playMP4(fileName);
		}
	}
	

}
