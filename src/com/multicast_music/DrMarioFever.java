package com.multicast_music;

public class DrMarioFever {
	private static final int B0 = 31;
	private static final int E1 = 41;
	private static final int C2 = 65;
	private static final int D2 = 74;
	private static final int D2s = 78;
	private static final int E2 = 83;
	private static final int F2 = 87;
	private static final int F2s = 93;
	private static final int G2 = 98;
	private static final int G2s = 104;
	private static final int A2 = 110;
	private static final int A2s = 117;
	private static final int B2 = 123;
	private static final int C3 = 131;
	private static final int C3s = 139;
	private static final int D3 = 147;
	private static final int D3s = 156;
	private static final int E3 = 165;
	private static final int F3 = 175;
	private static final int F3s = 185;
	private static final int G3 = 196;
	private static final int A3 = 220;
	private static final int A3s = 233;
	private static final int B3 = 247;
	private static final int C4 = 262;		// Middle C
	private static final int D4 = 294;
	private static final int D4s = 311;
	private static final int E4 = 330;
	private static final int F4 = 350;
	private static final int F4s = 370;
	private static final int G4 = 392;
	private static final int A4 = 440;
	private static final int A4s = 466;
	private static final int B4 = 494;
	private static final int C5 = 523;
	private static final int D5 = 587;
	private static final int D5s = 622;
	private static final int E5 = 660;
	private static final int F5 = 699;
	private static final int G5 = 784;
	private static final int A5 = 880;
	private static final int A5s = 932;
	private static final int B5 = 988;
	
	private static final int NONE = -1;
	
	private static final int BPM = 300;
	private static final int MS_PER_BEAT = 60000 / BPM;
	public static final int MS_PER_16TH = MS_PER_BEAT / 4;
	
	// All normalized to 16th notes, NONE for rests
	// One measure per line
	
	public static final int topPart[] = {
			G2, G2, G2, G2, A2s, A2s, B2, B2, C3, C3, B2, B2, A2s, A2s, A2, A2,				// 1
			G2, G2, G2, G2, A2s, A2s, B2, B2, C3, C3, B2, B2, A2s, A2s, A2, A2,
			A5s, A5s, B5, B5, A5s, A5s, B5, B5, A5, A5, G5, G5, G5, G5, A5, A5,
			A5s, A5s, B5, B5, A5, A5, G5, G5, G5, G5, G5, G5, NONE, NONE, NONE, NONE,
			A5s, A5s, B5, B5, A5s, A5s, B5, B5, A5, A5, G5, G5, G5, G5, A5, A5,				// 5
			B2, B2, B2, NONE, C3, C3, C3, NONE, C3s, C3s, C3s, NONE, D3, D3, D3, NONE,
			A5s, A5s, B5, B5, A5s, A5s, B5, B5, A5, A5, G5, G5, G5, G5, A5, A5,
			A5s, A5s, B5, B5, A5, A5, G5, G5, G5, G5, G5, G5, NONE, NONE, NONE, NONE,
			A5s, A5s, B5, B5, A5s, A5s, B5, B5, A5, A5, G5, G5, G5, G5, A5, A5,				// 9
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			D5s, D5s, E5, E5, D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, A4, A4,
			D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, C5, C5, NONE, NONE, NONE, NONE,
			D5s, D5s, E5, E5, D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, A4, A4,				// 13
			F4s, F4s, A4, A4,B4, B4, D5, D5, C5, C5, C5, C5, B4, B4, B4, B4,
			D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, NONE, NONE, F2, F2, F2, F2,
			D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, NONE, NONE, F2s, F2s, F2s, F2s,
			D5s, D5s, E5, E5, D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, A4, A4,				// 17
			C5, C5, C5, C5, D5, D5, D5, D5, C5, C5, C5, C5, C2, C2, C2, C2,
			C4, C4, G3, G3, C4, C4, D5, D5, C5, C5, G3, G3, G4, G4, G3, G3,
			C4, C4, G3, G3, C4, C4, D5, D5, C5, C5, G3, G3, G4, G4, G3, G3,
			C4, C4, G3, G3, C4, C4, D5, D5, C5, C5, G3, G3, G4, G4, G3, G3,					// 21
			F4, F4, F3, F3, C4, C4, D4, D4, C4, C4, F3, F3, B3, B3, F3, F3,
			F4, F4, F3, F3, C4, C4, D4, D4, C4, C4, F3, F3, G4, G4, G3, G3,
			F4, F4, F3, F3, C4, C4, D4, D4, C4, C4, F3, F3, G4, G4, G3, G3,
			F4, F4, F3, F3, C4, C4, D4, D4, C4, C4, F3, F3, G4, G4, G3, G3,					// 25
			F4, F4, F3, F3, C4, C4, D4, D4, C4, C4, F3, F3, B3, B3, F3, F3,
			D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, NONE, NONE, F2, F2, F2, F2,
			D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, NONE, NONE, F2s, F2s, F2s, F2s,
			D5s, D5s, E5, E5, D5s, D5s, E5, E5, D5, D5, C5, C5, C5, C5, A4, A4,				// 29
			C5, C5, C5, C5, D5, D5, D5, D5, C5, C5, C5, C5, C2, C2, C2, C2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,				// 33
			D3s, D3s, D3, D3, C3s, C3s, C3, C3, B2, B2, A2s, A2s, A2, A2, G2s, G2s,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,				// 37
			D3s, D3s, D3, D3, C3s, C3s, C3, C3, B2, B2, A2s, A2s, A2, A2, G2s, G2s,
			G2, G2, F2s, F2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			G2, G2, F2s, F2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			G2, G2, F2s, F2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			G2s, G2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE
	};
	
	// One measure per line, length of note in 16ths
	// Nones are rests, or that time segment taken up by previous note
	
	public static final int topLength[] = {
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 1
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 5
			1, 1, 1, NONE, 1, 1, 1, NONE, 1, 1, 1, NONE, 1, 1, 1, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 9
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 13
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 17
			4, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,									// 21
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,									// 25
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 29
			4, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 33
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 37
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE
	};
	
	public static final int middlePart[] = {
			G2, G2, G2, G2, A2s, A2s, B2, B2, C3, C3, B2, B2, A2s, A2s, A2, A2,				// 1
			G2, G2, G2, G2, A2s, A2s, B2, B2, C3, C3, B2, B2, A2s, A2s, A2, A2,
			G4, G4, G4, G4, A4s, A4s, B4, B4, E4, E4, D4s, D4s, D4s, D4s, E4, E4,
			G4, G4, G4, G4, A4s, A4s, B4, B4, E4, E4, E4, E4, NONE, NONE, NONE, NONE,
			G4, G4, G4, G4, A4s, A4s, B4, B4, E4, E4, D4s, D4s, D4s, D4s, D4s, D4s,			// 5
			G2, G2, G2, NONE, A2, A2, A2, NONE, A2s, A2s, A2s, NONE, B2, B2, B2, NONE,
			G4, G4, G4, G4, A4s, A4s, B4, B4, E4, E4, D4s, D4s, D4s, D4s, E4, E4,
			G4, G4, G4, G4, A4s, A4s, B4, B4, E4, E4, E4, E4, NONE, NONE, NONE, NONE,
			G4, G4, G4, G4, A4s, A4s, B4, B4, E4, E4, E4, E4, E4, E4, E4, E4,				// 9
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			C3, C3, C3, C3, D3s, D3s, E3, E3, F2, F2, F2, NONE, G2s, G2s, A2, A2,
			C3, C3, C3, C3, D3s, D3s, E3, E3, F2, F2, G2s, NONE, A2, A2, C3s, C3s,
			C3, C3, C3, C3, D3s, D3s, E3, E3, F2, F2, F2, NONE, G2s, G2s, A2, A2,			// 13
			A3, A3, A4, A4, B4, B4, F4s, F4s, G4, G4, G4, G4, F4, F4, F4, F4,
			G3, G3, C4, C4, B3, B3, A3s, A3s, A3, A3, NONE, NONE, F3, F3, F3, F3,
			G3, G3, C4, C4, B3, B3, A3s, A3s, A3, A3, NONE, NONE, F2s, F2s, F2s, F2s,
			G3, G3, G3, G3, G3, G3, G3, G3, F3, F3, F3, F3, F3, F3, F3, F3,					// 17
			G3, G3, G3, NONE, G3, G3, G3, NONE, E3, E3, E3, E3, C3, C3, C3, C3,
			E3, E3, E3, E3, E3, E3, E3, E3, B3, B3, B3, B3, G3, G3, G3, G3,
			C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3,
			C4, C4, C4, C4, C4, C4, C4, C4, B3, B3, B3, B3, C4, C4, C4, C4,					// 21
			D3, D3, D3, D3, D3, D3, D3, D3, G2, G2, G2, G2, G2, G2, G2, G2,
			E3, E3, E3, E3, E3, E3, E3, E3, B3, B3, B3, B3, G3, G3, G3, G3,
			C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3, C3,
			F2, F2, F2, F2, F3, F3, F2, F2, E2, E2, E2, E2, F2, F2, E2, E2,					// 25
			D3, D3, D3, D3, D3, D3, D3, D3, G2, G2, G2, G2, G2, G2, G2, G2,
			G3, G3, C4, C4, B3, B3, A3s, A3s, A3, A3, NONE, NONE, F3, F3, F3, F3,
			G3, G3, C4, C4, B3, B3, A3s, A3s, A3, A3, NONE, NONE, F2s, F2s, F2s, F2s,
			G3, G3, G3, G3, G3, G3, G3, G3, F3, F3, F3, F3, F3, F3, F3, F3,					// 29
			G3, G3, G3, NONE, G3, G3, G3, NONE, E3, E3, E3, E3, C3, C3, C3, C3,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,				// 33
			D3s, D3s, D3, D3, C3s, C3s, C3, C3, B2, B2, A2s, A2s, A2, A2, G2s, G2s,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,
			C2, C2, C2, C2, D2s, D2s, E2, E2, F2, F2, F2, F2, F2s, F2s, G2, G2,				// 37
			D3s, D3s, D3, D3, C3s, C3s, C3, C3, B2, B2, A2s, A2s, A2, A2, G2s, G2s,
			G2, G2, F2s, F2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			G2, G2, F2s, F2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			G2, G2, F2s, F2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			G2s, G2s, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE
	};
	
	public static final int middleLength[] = {
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 1
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 5
			1, 1, 1, NONE, 1, 1, 1, NONE, 1, 1, 1, NONE, 1, 1, 1, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 9
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 13
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 17
			1, 1, 1, NONE, 1, 1, 1, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			8, NONE, NONE, NONE, NONE, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			16, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			8, NONE, NONE, NONE, NONE, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			16, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			8, NONE, NONE, NONE, NONE, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			16, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			8, NONE, NONE, NONE, NONE, NONE, NONE, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			16, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 29
			1, 1, 1, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 33
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 37
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE
	};
	
	public static final int lowPart[] = {
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			D4, D4, E4, E4, D4, D4, E4, E4, C4, C4, C4, C4, D4s, D4s, C4, C4,
			D4, D4, E4, E4, D4, D4, D4, D4, C4, C4, C4, C4, NONE, NONE, NONE, NONE,
			D4, D4, E4, E4, D4, D4, E4, E4, C4, C4, C4, C4, D4s, D4s, D4s, D4s,				// 5
			B0, B0, B0, NONE, B0, B0, B0, NONE, B0, B0, B0, NONE, B0, B0, B0, NONE,
			D4, D4, E4, E4, D4, D4, E4, E4, C4, C4, C4, C4, D4s, D4s, C4, C4,
			D4, D4, E4, E4, D4, D4, D4, D4, C4, C4, C4, C4, NONE, NONE, NONE, NONE,
			D4, D4, E4, E4, D4, D4, E4, E4, C4, C4, C4, C4, D4s, D4s, NONE, NONE,			// 9
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			D3, D3, D3, D3, F3s, F3s, A3, A3, G3, G3, G3, NONE, G3, G3, G3, G3,
			C2, C2, C2, NONE, D2s, D2s, E2, E2, F2, F2, NONE, NONE, E1, E1, E1, E1,
			C2, C2, C2, NONE, D2s, D2s, E2, E2, F2, F2, NONE, NONE, NONE, NONE, NONE, NONE,
			E3, E3, E3, NONE, E3, E3, E3, E3, NONE, D3, D3, D3, D3, D3, D3, D3,				// 17
			F3, F3, F3, F3, F3, F3, F3, F3, C3, C3, NONE, NONE, NONE, NONE, NONE, NONE,
			C3, C3, C3, C3, G3, G3, C3, C3, B2, B2, B2, B2, G3, G3, B2, B2,
			C3, C3, C3, C3, G3, G3, C3, C3, B2, B2, B2, B2, G3, G3, B2, B2,
			F2, F2, F2, F2, F3, F3, F2, F2, E2, E2, E2, E2, F2, F2, E2, E2,					// 21
			D3, D3, D3, D3, D3, D3, D3, D3, G2, G2, G2, G2, G2, G2, G2, G2,
			C3, C3, C3, C3, G3, G3, C3, C3, B2, B2, B2, B2, G3, G3, B2, B2,
			A2, A2, A2, A2, G3, G3, A2, A2, G2, G2, G2, G2, G3, G3, G2, G2,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			C2, C2, C2, NONE, D2s, D2s, E2, E2, F2, F2, NONE, NONE, E1, E1, E1, E1,
			C2, C2, C2, NONE, D2s, D2s, E2, E2, F2, F2, NONE, NONE, NONE, NONE, NONE, NONE,
			E3, E3, E3, NONE, E3, E3, E3, E3, NONE, D3, D3, D3, D3, D3, D3, D3,				// 29
			F3, F3, F3, F3, F3, F3, F3, F3, C3, C3, NONE, NONE, C3, C3, C3, C3,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE
	};
	
	public static final int lowLength[] = {
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 5
			1, 1, 1, NONE, 1, 1, 1, NONE, 1, 1, 1, NONE, 1, 1, 1, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 4, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 9
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 1, 1, 1, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 1, 1, 1, NONE, 2, NONE, 2, NONE,
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 1, 1, 1, NONE, 2, NONE, 2, NONE,			// 13
			2, NONE, 2, NONE, 2, NONE, 2, NONE, 1, 1, 1, NONE, 2, NONE, 2, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 17
			4, NONE, NONE, NONE, 4, NONE, NONE, NONE, 2, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,				// 21
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,				// 25
			2, NONE, 2, NONE, 2, NONE, 1, 1, 2, NONE, 2, NONE, 2, NONE, 1, 1,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 2, NONE, 2, NONE, 2, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			1, 1, 1, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE, 2, NONE,			// 29
			4, NONE, NONE, NONE, 4, NONE, NONE, NONE, 2, NONE, NONE, NONE, 4, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE,
			NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE
	};
	
	public static void main(String[] args) throws Exception {
		System.out.println(topPart.length);
		System.out.println(topLength.length);
		System.out.println(middlePart.length);
		System.out.println(middleLength.length);
		System.out.println(lowPart.length);
		System.out.println(lowLength.length);
	}
}
