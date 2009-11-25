package com.multicast_music;

public class TestMusic {
	public static void main(String[] args) throws Exception {
		InternalSpeaker internalSpeaker = new InternalSpeaker();
		
		for (int i = 0; i < DrMarioFever.topPart.length; i++) {
			System.out.println(i);
			
			int note = DrMarioFever.lowPart[i];
			int length = DrMarioFever.lowLength[i];
			
			if (length > 1) {
				i = i + length - 1;
			}
			
			if (note != -1) {
				if (length == -1)
					throw new Exception(note + "," + i);
				//internalSpeaker.play(note, length * DrMarioFever.MS_PER_16TH - 5);
			} else {
				try {
					Thread.sleep(DrMarioFever.MS_PER_16TH - 5);
				} catch (Exception e) {
					// Ignore
				}				
			}
			
			try {
				Thread.sleep(5);
			} catch (Exception e) {
				// Ignore
			}
		}
	}
}
