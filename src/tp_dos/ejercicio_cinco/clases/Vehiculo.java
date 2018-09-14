package tp_dos.ejercicio_cinco.clases;

public class Vehiculo {
	private String patente,modelo,marca;
	private int kmFaltantesService;
	
	public Vehiculo(String patente, String modelo, String marca, int kmFaltantesService) {
		this.patente = patente;
		this.modelo = modelo;
		this.marca = marca;
		this.kmFaltantesService = kmFaltantesService;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKmFaltantesService() {
		return kmFaltantesService;
	}

	public void setKmFaltantesService(int kmFaltantesService) {
		this.kmFaltantesService = kmFaltantesService;
	}
	
	
	
}
