//VIDEO 48
//Tipos enumerados - Clase enum
//La clase enum es una clase que nos permite crear objetos del tipo enumerados
//Lo que nos permite es q una determinada variable solo pueda tomar valores predeterminados
//Un tipo enumerado es una varaible objeto del tipo enum en el que solo se pueden almacenar
//un determinado tipo de valores

//enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};//Instancia de clase enum
import java.util.*;


enum Talla{
	
	MINI("S"),MEDIANO("S"),GRANDE("L"),MUY_GRANDE("XL");
	
	private Talla(String abreviatura) { //Constructor de enum, se hace fuera del main
		//El constructor de la clase enum no permite la creacion de objetos, por eso lleva un private
		this.abreviatura=abreviatura;
	}
	
	public String dimeAbreviatura() {
		
		return abreviatura;
	}
	
	private String abreviatura;
}

public class Video48_Uso_Tallas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Escribe una talla MINI,MEDIANO,GRANDE,MUY_GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);//Metodo de la clase enum
		
		System.out.println("Talla = "+la_talla.dimeAbreviatura());
		
		
		
	/*	Talla s=Talla.MINI;
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;*/
	}

}
