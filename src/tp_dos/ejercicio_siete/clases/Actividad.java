package tp_dos.ejercicio_siete.clases;

import java.util.concurrent.Semaphore;

public class Actividad {
	
	//Semaforo para las actividades
	private Semaphore rueda = new Semaphore(1,true);
	private Semaphore comida = new Semaphore(1,true);
	private Semaphore hamaca = new Semaphore(1,true);
	
	public void hacer(Hamster hamster) {
		
		try {
			
			if(hamster.getHambre() >= 50) {
				comida.acquire();
				System.out.println(hamster.getNombre() + " esta comiendo.");
				Thread.sleep((long)(hamster.getHambre()*100));
				hamster.setHambre(10);
				hamster.setGanas(50);
				comida.release();
			}
			if(hamster.getGanas() >= 50) {
				rueda.acquire();
				System.out.println(hamster.getNombre() + " esta en la rueda.");
				Thread.sleep((long)(hamster.getGanas()*100));
				hamster.setGanas(10);
				hamster.setCansancio(50);
				rueda.release();
			}
			if(hamster.getCansancio() >= 50) {
				hamaca.acquire();
				System.out.println(hamster.getNombre() + " esta en la hamaca.");
				Thread.sleep((long)(hamster.getCansancio()*100));
				hamster.setCansancio(10);
				hamster.setHambre(50);
				hamaca.release();
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
