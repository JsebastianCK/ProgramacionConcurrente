package tp_dos.ejercicio_cinco.test;

import tp_dos.ejercicio_cinco.clases.Auto;
import tp_dos.ejercicio_cinco.clases.Estacion;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		Estacion axion = new Estacion();
		Auto auto1 = new Auto("ABC123" , "106" , "Peugeot" , 1500 , 45 , axion);
		Auto auto2 = new Auto("DEF456" , "206" , "Peugeot" , 1500 , 45 , axion);
		Auto auto3 = new Auto("GHI789" , "19" , "Renault" , 1500 , 45 , axion);
		Auto auto4 = new Auto("JKL123" , "a3" , "Audi" , 1500 , 45 , axion);
		Auto auto5 = new Auto("MNO456" , "Toro" , "Fiat" , 1500 , 45 , axion);
		
		Thread t1 = new Thread(auto1);
		Thread t2 = new Thread(auto2);
		Thread t3 = new Thread(auto3);
		Thread t4 = new Thread(auto4);
		Thread t5 = new Thread(auto5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
