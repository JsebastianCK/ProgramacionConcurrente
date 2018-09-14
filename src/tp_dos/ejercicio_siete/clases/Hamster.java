package tp_dos.ejercicio_siete.clases;

public class Hamster implements Runnable{
	private int cansancio,hambre,ganas;
	private String nombre;
	private Actividad actividad;
	
	public Hamster(String nombre, int ganas, int hambre, int cansancio, Actividad actividad) {
		this.cansancio = cansancio;
		this.hambre = hambre;
		this.ganas = ganas;
		this.nombre = nombre;
		this.actividad = actividad;
	}
	
	public void run() {
		
		while(true) {
			System.out.println(this.getInfo());
			this.actividad.hacer(this);
		}
		
	}
	
	
	//SETTERS Y GETTERS
	private String getInfo() {
		return this.getNombre() + ":\n" +
				"Hambre: " + this.getHambre() +
				"Ganas: " + this.getGanas() +
				"Cansancio: " + this.getCansancio();
	}

	public int getCansancio() {
		return cansancio;
	}

	public void setCansancio(int cansancio) {
		this.cansancio = cansancio;
	}

	public int getHambre() {
		return hambre;
	}

	public void setHambre(int hambre) {
		this.hambre = hambre;
	}

	public int getGanas() {
		return ganas;
	}

	public void setGanas(int ganas) {
		this.ganas = ganas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
