package tp_dos.ejercicio_cinco.clases;

import java.util.concurrent.Semaphore;

public class Estacion {
	//Semaforo de un permiso con true para respetar el orden del pedido.
	private Semaphore semaforo = new Semaphore(1,true);

	public void cargarCombustible(Auto auto) {
		//Simula la carga de combustible del auto
		try {
			
			semaforo.acquire();
			System.out.println("El auto " + auto.getPatente() + " esta cargando combustible.");
			auto.setCombustible(45);
			Thread.sleep(2500);
			System.out.println("El auto " + auto.getPatente() + " ya dejo de cargar combustible.");
			semaforo.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
