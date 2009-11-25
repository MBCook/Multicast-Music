package com.multicast_music;
import java.net.MulticastSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class MulticastMusicServer {
	public static void main(String[] args) throws Exception {
		String msg = "Hello";
		InetAddress group = InetAddress.getByName("228.5.6.7");
		MulticastSocket s = new MulticastSocket(6789);
		s.joinGroup(group);
		DatagramPacket hi = new DatagramPacket(msg.getBytes(), msg.length(), group, 6789);
		s.send(hi);
		s.leaveGroup(group);
	}
}
