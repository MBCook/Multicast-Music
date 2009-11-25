#include <windows.h>
#include <jni.h>
#include "com_multicast_music_InternalSpeaker.h"
#include <stdio.h>

/**
* JNI-Glue to make the internal pc speaker beep.
* @author Martin Mosisch
* E-Mail : MMosisch@web.de
*/

JNIEXPORT void JNICALL
	Java_com_multicast_1music_InternalSpeaker_beepPCSpeaker(JNIEnv *env, jobject obj, jint frequency ,jint duration)
{
	Beep(
		 frequency, // DWORD dwFreq frequency
		 duration   // DWORD duration
	);
}

/*
// Programmtest mit 5 Noten für cir. 5 Sekunden
int main()
{
	int i;
	for (i = 400; i < 1000; i+=100)
	{
		Beep(
			 i,    // DWORD dwFreq frequency
			 500   // DWORD duration
		);
	}
	return(0);
}
*/
