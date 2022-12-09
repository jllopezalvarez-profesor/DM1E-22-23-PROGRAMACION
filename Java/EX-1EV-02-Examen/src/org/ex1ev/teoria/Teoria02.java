package org.ex1ev.teoria;

public class Teoria02 {

	public static void main(String[] args) {
		
		String s = "¡Qué importa como me llame! Se nos conoce por nuestros actos";
		String s2 = s.toUpperCase();
		s2 = s2.substring(s.indexOf("Se"));
		System.out.println(s2);
		

	}

}
