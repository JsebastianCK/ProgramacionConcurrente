package tp_dos.ejercicio_cinco.clases;

public class Auto extends Vehiculo implements Runnable{
	
	private int combustible,cantKm;
	private Estacion estacion;
	
	public Auto(String patente, String modelo, String marca, int kmFaltantesService,int combustible,Estacion estacion){
		super(patente,modelo,marca,kmFaltantesService);
		this.combustible = combustible;
		this.estacion = estacion;
	}
	
	public void run(){
		//Va a andar todo el rato
		while(true) {
			this.andar((int)(Math.random()*250 + 200));
		}
	}
	
	public void andar(int km) {
		//Simula el recorrido del auto.
		
		this.cantKm += km;
		this.combustible -= km/10;
		
		try {
			//Duerme porque esta andando re piola
			Thread.sleep((long)(km*10));
			
			System.out.println("El auto " + this.getPatente() + " anduvo " + km + "km y le queda " + this.getCombustible() + "lts de combustible.");
			
			if(this.combustible <= 25) {
				//Combustible bajo entonces hay que ir a cargar.
				this.estacion.cargarCombustible(this);
			}
			
			if(this.cantKm >= this.getKmFaltantesService()) {
				System.out.println("Al auto " + this.getPatente() + " le toca service.");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	
	
	
}
