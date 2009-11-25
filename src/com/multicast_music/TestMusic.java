package com.multicast_music;

public class TestMusic {
	public static void main(String[] args) throws Exception {
		InternalSpeaker internalSpeaker = new InternalSpeaker();
		
		internalSpeaker.play(440, 1000);
	}
}
