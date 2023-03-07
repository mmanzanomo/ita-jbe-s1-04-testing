package org.itacademy.n3exercici6;



public class SampleArray {
	
	private int[] enters = {2,6,4,7,3,4,5};
	
	
	public String getArrayException() {
		String output = "";
		// It must be throw an IndexOutOfBoundsException
		for (int i = 0; i <= enters.length; i++) {
			output += enters[i];
		}
		return output;
	}
	
	public int[] getEnters() {
		return enters;
	}
	
}
