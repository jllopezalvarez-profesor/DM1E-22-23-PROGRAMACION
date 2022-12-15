package es.iesclaradelrey.dm1e2223.ut06.ejemplos.ejemplos01simples;

public class Programa {

	public static void main(String[] args) {
	
		
		
		Televisor televisor1 = new Televisor("Televisor 1", 4, 20, true);
		System.out.println(televisor1);
		if( televisor1.isEncendida()) {
			System.out.println("Está encendida");
		}else {
			System.out.println("Está apagada");
		}

		Televisor televisor2 = new Televisor("Televisor 2", 10, 40, false);
		System.out.println(televisor2);
		
		if( televisor2.isEncendida()) {
			System.out.println("Está encendida");
		}else {
			System.out.println("Está apagada");
		}
		
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen();
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen();
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen(10);
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen(10);
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen(10);
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen(10);
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen(10);
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen(10);
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen();
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		televisor2.subirVolumen();
		System.out.println("El volumen del televisor es " + televisor2.getVolumen());
		
		
		Televisor tvA = new Televisor("TV A", true);
		

		
//		System.out.println(televisor1.getNombre());
//		System.out.println(televisor1.getNombre().length());
//
//		televisor1.encender();
//
//		if (televisor1.isEncendida()) {
//			System.out.println("Está encendida");
//		} else {
//			System.out.println("Está apagada");
//		}
//
//		Televisor televisor2 = new Televisor();
//		Televisor televisor4 = televisor2;
//		Televisor televisor5 = televisor4;
//		System.out.println("El TV 2 está en el canal " + televisor2.getCanal());
//		televisor5.setCanal(100);
//		System.out.println("El TV 2 está en el canal " + televisor2.getCanal());
//		televisor4.setCanal(30);
//		System.out.println("El TV 2 está en el canal " + televisor2.getCanal());
//		televisor2.setCanal(10);
//		System.out.println("El TV 2 está en el canal " + televisor2.getCanal());
//
//		String s1 = new String("Hola");
//		String s2 = s1;
//
////		televisor2 = null;
////		System.out.println("El TV 2 está en el canal "+ televisor2.getCanal());
//		System.out.println(televisor2);
//
//		Televisor televisor3 = televisor1;
//		System.out.println(televisor3);
//		
	}

}
