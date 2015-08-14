package com.iostreams;

/*
 * FileReader - FileWriter - FileInputStream - FileOutputSteam
 * all these are unbuffered i/o
 * 
 * This means each read or write request is handled directly by the underlying 
 * OS.
 * This can make a program much less efficient, since each such request 
 * often triggers disk access, network activity, or some other operation that is 
 * relatively expensive
 * 
 * To reduce this kind of overhead, the Java platform implements buffered i/o
 * streams.
 * 
 * Buffered input streams read data from a memory area known as a buffer.
 * the native input API is called only when the buffer is empty.
 * Similarly, the buffered output streams write data to a buffer
 * and the native output API is called only when the buffer is full
 * 
 * we can pass an unbuffered stream to the constructor of a
 * buffered class
 *  in = new BufferedReader( new FileReader ...)
 *  out = new BufferedWriter(new FileWriter ...)
 *  in = new BufferedInputStream(new FileInputStream ...)
 *  out = new BufferedOutputStream( new FileOutputStream....)
 *  
 *  Flushing :
 *  It often makes sense to write out a buffer at critical points,
 *  without waiting for it to fill. This is known as flushing the buffer.
 *  
 *  you can manually use flush() method to flush or some 
 *  methods supports an optional autoflush using an optional
 *  constructor atgument.
 */

public class BufferedStreams {
	public static void main(String[] args) {
		
		
		
	}

}
