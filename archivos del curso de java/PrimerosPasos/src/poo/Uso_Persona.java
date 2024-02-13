package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {//Video 46

	//Nos robamos la clase Empleado de Uso_Empleado,
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona [] lasPersonas=new Persona [2];//Es un array llamado "lasPersonas", con 2 lugares
		//y del tipo persona. El tipo significa que es un objeto del tipo Persona, por lo que 
		//cada posicion del Array tendra dentro de su elemento un objeto del tipo Persona, es decir
		//un objeto con las caracteristicas de su constructor
		
		lasPersonas[0] = new Empleado2("Luis Conde",50000,2009,02,25);//en la primera posicion
		//llenamos la posicion con un objeto Empleado2, que es del tipo persona porque hereda
		//de dicha clase
		
		lasPersonas[1] = new Alumno("Ana Lopez","Programacion");//Aca el objeto es del tipo Alumno
		//q a su vez es del tipo Persona, porque hereda de dicha clase
		
		
		for(Persona p: lasPersonas) {
			System.out.println(p.dameNombre()+", "+p.dameDescripcion());
		}
	}
		
	}

//---------------------------------------------------------------------------------------
//Clase abstracta Persona (Video 46)
		abstract class Persona{//tiene que ser clase abstracta porque tiene un metodo abstracto
			//El metodo abstracto es un metodo que sera diferente para una clase hija con respecto a otra
			//clase hija. Esas clases estan obligadas a sobreescribir al metodo abstracto
			
			public Persona (String nom) {
				nombre=nom;
			}
			
		public String dameNombre(){
			
			return nombre;
		}
		
		public abstract String dameDescripcion();//El metodo abstracto tiene que tener una clase abstracta
			//El metodo abstracto tiene que tener la sintaxis que se escribe.
			
		
		
			private String nombre;
		}
		
//----------------------------------------------------------------------------------------	
		
		class Empleado2 extends Persona{//Hereda de Persona, Empleado2
			
			public Empleado2(String nom, double sue, int agno, int mes, int dia) {//El constructor recibe parametros
				
				super(nom);//llamamos al constructor de la clase padre
				sueldo=sue;
				
				
				GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
				
				altaContrato=calendario.getTime();//con el objeto calendario, a traves del metodo getTime(), almacenamos los datos de calendario
				IdSiguiente++;
				Id=IdSiguiente;
				
				
			}
		
			private String nombre;
			
			private double sueldo;
			
			private Date altaContrato;
			
			private int Id;
			
			public static int IdSiguiente;
		
			
			
			
			public double dameSueldo() {//getter
				return sueldo;
			}
			
			public Date dameFechaContrato() {//getter
				return altaContrato;
			}
			
			public void subeSueldo(double porcentaje) {//Setter
				double aumento=sueldo*porcentaje/100;
				sueldo+=aumento;
			}
			
			public String dameDescripcion() {
				
				return "Este empleado tiene un ID igual a "+Id+" con un sueldo igual a "+sueldo;
			}
			

			
		}

		//--------------------------------------------------------------------------------
		
		class Alumno extends Persona {
			
			public Alumno(String nom, String car) {
				
				super(nom);
				carrera=car;
			}
			
			
		public String dameDescripcion() {
			
			return "Este alumno esta estudiando la carreda de "+carrera;
		}
		private String carrera;
		}

	


