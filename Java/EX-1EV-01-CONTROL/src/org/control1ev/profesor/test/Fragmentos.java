package org.control1ev.profesor.test;

public class Fragmentos {

	public static void main(String[] args) {

		int x = 10;
		int i;
		for (i = 0; i < 20 && x > 7; i++) {
			if (i%2==0) {
				x--;
			}
		}
		System.out.println("x = " + x);
		System.out.println("i = " + i);
		
		
	}

}
