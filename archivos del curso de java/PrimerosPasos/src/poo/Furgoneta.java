package poo;

public class Furgoneta extends Coche {//Con la palabra reservada extends, indicamos que la clase
	//Furgoneta (hija o subclase) hereda de la clase Coche (padre o superclase). Es decir, comparte todas las caracteristicas
	//y metodos de la clase Coche (reutilizacion de codigo), pero a su vez tendra sus caracteristicas
	//y metodos propidas (Video 40). En Java no se puede heredar mas de una clase (herencia multiple)
	
	
	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {//Constructor con caracteristicas 
		//nuevas a las clase coche
		
		super();//llamar al constructor de la clase padre o superclase con el objetivo de darle un estado inciial
		//a la clase furgoneta. Basicamente esta "copiando" las caracteristicas del constructor de la clase padre
		
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
		
	}
	
	public String dimeDatosFurgoneta() {
		
		return " La capacidad de carga es: "+ capacidad_carga + " y las plazas son: " + plazas_extra;
	}
	
	

}
