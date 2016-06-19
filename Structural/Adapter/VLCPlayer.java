package com.prassannas.designpatterns.adapter;

public class VLCPlayer implements IAdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("VLCPlayer.playVlc()");
		System.out.println("Playing >> " + fileName );	}

	public void playMP4(String fileName) {
		//No Implementation
	}

}
