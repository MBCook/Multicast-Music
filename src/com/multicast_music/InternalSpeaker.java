package com.multicast_music;

import java.awt.Toolkit;

/*
 * Created on 27.03.2004
 *
 */
/**
 * English
 * =======
 * InternalSpeaker is an interactive class to make the internal pc-speaker
 * sound by using a C++-DLL. Therefore it is according to a Windows os.
 * This class is called a JNI Glue 
 * (JNI = Java Native Interface).
 * 
 * By this JNI-Glue class is the Beep()-method from the Windows-SDK-API
 * started.
 * 
 * German
 * ======
 * InternalSpeaker ist eine Interaktionsklasse zum Ansprechen 
 * des internen PC-Lautsprechers mittels einer C++-DLL und ist
 * daher Windows plattformabhängig.
 * Diese Klasse ist ein sog. JNI Glue
 * (JNI = Java Native Interface).
 *  
 * Über diese JNI-Glue Klasse wird in der DLL die Beep()-Methode
 * der Windows-SDK-API aufgerufen.
 * 
 * @author Martin Mosisch
 */
public class InternalSpeaker
{
    /**
     * English
     * =======
     * Constructor without any parameters
     * 
     * German
     * ======
     * Parameterloser Konstruktor
     * ohne weitere Initialisierungen
     */
    public InternalSpeaker()
    {}

    
    //English: Load JNI Glue C++ DLL: beep.dll 
    //German: Laden JNI Glue C++ DLL: beep.dll
	static
	{
		System.loadLibrary("beep");
	}

    // JNI Glue Methode C++
	private static native void beepPCSpeaker(int frequency, int duration);
    
    
    
   /**
    * English
    * =======
    * Method for playing one note or simply sound
    * @param frequency - frequency in hz
    * @param duration  - duration  in milliseconds
    * 
    * German
    * ======
    * Methode zur erzeugung eines Tons
    * @param frequency - Frequenz
    * @param duration  - Dauer in Millisekunden
    * 
    * Frequency Table
    * ===================
    * C	    130.81	9121	
    * C#	138.59	8609	
	* D	    146.83	8126	
	* D#	155.56	7670	
	* E	    164.81	7239	
	* F	    174.61	6833	
	* F#	185.00	6449	
	* G	    196.00	6087	
	* G#	207.65	5746	
	* A	    220.00	5423	
	* A#	233.08	5119	
	* B	    246.94	4831	
	* Middle C	261.63	4560	
	* C#	277.18	4304	
	* D	    293.66	4063	
	* D#	311.13	3834	
	* E	    329.63	3619	
	* F	    349.23	3416	
	* F#	369.99	3224	
	* G	    391.00	3043	
	* G#	415.30	2873	
	* A	    440.00	2711	
	* A#	466.16	2559	
	* B	    493.88	2415	
	* C	    523.25	2280	
	* C#	554.37	2152	
	* D	    587.33	2031	
	* D#	622.25	1917	
	* E	    659.26	1809	
	* F	    698.46	1715	
	* F#	739.99	1612	
	* G	    783.99	1521	
	* G#	830.61	1436	
	* A	    880.00	1355	
	* A#	923.33	1292	
	* B	    987.77	1207	
	* C	    1046.50	1140
    */
	public synchronized void play(int frequency, int duration)
	{
		 InternalSpeaker.beepPCSpeaker( frequency , duration);
		 
		 // anhalten des aktuellen Prozesses
		 try
		 {
			 Thread.sleep(duration);
		 }
		 catch(InterruptedException interruptedexception)
		 { // not used
		 }
		 // reinitialisieren des JNI GLUE 
		 InternalSpeaker.beepPCSpeaker(0 , 0);
	}
	
	/**
	 * English
	 * =======
	 * plays a auditive beep note.
	 * Defaults:
	 * - frequency : 400 hz
	 * - duration  : 100 ms
	 * 
	 * German
	 * ======
	 * Abspielen eines auditiven Beeptons.
	 * Vorgaben:
	 * - Frequenz : 400 hz
	 * - Dauer    : 100 ms
	 */
	public void beep()
	{
		play(440, 100);
	}

	/**
	 * English
	 * =======
	 * plays a auditive click
	 * Defaults:
	 * - frequency : 200 hz
	 * - duration  :  25 ms
	 * 
	 * German
	 * ======
	 * Methode eines auditiven Clicks
	 * Vorgaben/Defaults:
	 * - Frequenz : 200 hz
	 * - Dauer    :  25 ms
	 *
	 */
	public void click()
	{
		play(200, 25);
	}
	
   /**
    * English
    * =======
    * creates a note by the soundcard output-line.
    * 
    * German
    * ======
    * Erzeugt einen Ton über den Audio-Ausgang der
    * Soundcard.
    *
    */
   public void makeBeep()
   {
	   Toolkit.getDefaultToolkit().beep();

	   // angebliches workaround
	   //System.out.print("\07");
	   //System.out.flush();
   }
}