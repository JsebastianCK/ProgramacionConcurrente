package tp_dos.ejercicio_siete.test;

import tp_dos.ejercicio_siete.clases.*;

public class Test {
	public static void main(String[] args) {
		Actividad act = new Actividad();
		
		Hamster miguel = new Hamster("Miguel" , 50 ,50 ,50 ,act);
		Hamster jorge = new Hamster("Jorge" , 50 ,50 ,50 ,act);
		Hamster raul = new Hamster("Raul" , 50 ,50 ,50 ,act);
		Hamster roberto = new Hamster("Roberto" , 50 ,50 ,50 ,act);
		
		Thread t1 = new Thread(miguel);
		Thread t2 = new Thread(jorge);
		Thread t3 = new Thread(raul);
		Thread t4 = new Thread(roberto);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
