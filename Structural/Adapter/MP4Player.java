package com.prassannas.designpatterns.adapter;

public class MP4Player implements IAdvancedMediaPlayer {

	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	public void playMP4(String fileName) {
		System.out.println("MP4Player.playMP4()");
		System.out.println("Playing >> " + fileName );

	}

}
