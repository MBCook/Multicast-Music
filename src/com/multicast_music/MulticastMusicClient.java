package com.multicast_music;
import java.net.MulticastSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Random;

import com.multicast_music.songs.DrMarioFever;

public class MulticastMusicClient {
	public static void main(String[] args) throws Exception {
		InternalSpeaker internalSpeaker = new InternalSpeaker();
		
		System.out.println("Waiting...");
		System.out.println("Close window to exit.");
		
		
		InetAddress group = InetAddress.getByName("228.5.6.7");
		MulticastSocket s = new MulticastSocket(6789);
		s.joinGroup(group);
		byte[] buf = new byte[1000];
		DatagramPacket recv= new DatagramPacket(buf, buf.length);
		s.receive(recv);
		s.leaveGroup(group);
		
		System.out.println("Go!");

		int i = new Random().nextInt(3);
		
		int[] parts = null;
		int[] lengths = null;
		
		if (i == 0) {
			parts = DrMarioFever.topPart;
			lengths = DrMarioFever.topLength;
		} else if (i == 1) {
			parts = DrMarioFever.middlePart;
			lengths = DrMarioFever.middleLength;
		} else {
			parts = DrMarioFever.lowPart;
			lengths = DrMarioFever.lowLength;
		}
		
		for (i = 0; i < parts.length; i++) {
			System.out.println(i);
			
			int note = parts[i];
			int length = lengths[i];
			
			if (length > 1) {
				i = i + length - 1;
			}
			
			if (note != -1) {
				internalSpeaker.play(note, length * DrMarioFever.MS_PER_16TH - 5);
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
