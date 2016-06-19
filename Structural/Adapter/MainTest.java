package com.prassannas.designpatterns.adapter;

public class MainTest {
	
	public static void main(String[] args) {
		System.out.println("MainTest.main()");
		IMediaPlayer mediaPlayer = new MediaPlayer();
		mediaPlayer.play("mp3", "One.mp3");
		mediaPlayer.play("vlc", "two.vlc");
		mediaPlayer.play("mp4", "Three.mp4");
		mediaPlayer.play("avi", "Kabali.avi");
	}

}
