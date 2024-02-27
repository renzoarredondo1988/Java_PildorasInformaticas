package poo;
import java.util.*;//Esto es para usar un atributo del tipo objeto en este caso Date (Video 33)
//y el GregorianCalendar (video34)

public class Uso_Empleado {//Video 33 en este caso hacemos todo dentro de un mismo fichero

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Video 35
		//Creamos 3 objetos empleado y subims el sueldo con el metodo
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre:"+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
		
				+"Fecha de Alta: "+empleado1.dameFechaContrato());
		
		System.out.println("Nombre:"+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
		
		+"Fecha de Alta: "+empleado2.dameFechaContrato());
		
		System.out.println("Nombre:"+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
		
		+"Fecha de Alta: "+empleado3.dameFechaContrato());*/
		
		//Aca hacemos el mismo codigo pero con arrays, mas corto y ordenado Video35
		
		//Creamos un objeto array 
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);//Para poder poner en un array
		//datos de distinto tipo (doble, entero, String) lo que hay q hacer es previamente una clase
		//q maneje esos tipos de datos, ya que java no permite mezclarlos en una arreglo (fuertemente tipado)
		
		
		
		//JEFATURA (Video 43)
				Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,25);//Video 43
				jefe_RRHH.estableceIncentivo(2570);
				
				
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[3]=new Empleado("Antonio Fernandez");//Video 39 Sobrecarga de constructores
		//En este caso llama al constructor que solo pide por parametro el nombre
		
		//-----------------------------------------------------------------------------------
		//Video 43
		
		
	    misEmpleados[4]=jefe_RRHH;//Polimorfismo en accion. Principio de sustitucion.

		misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);//mismo ejemplo que el anterior
		//el objeto misEmpleados[5] espera un objeto del tipo empleado, pero se puede poner 
		//directamente un objeto de la clase hija (Jefatura)
		
		//------------------------------------------------------------------------------------
	
		//Video 44
		//Transformamos misEmpleados[5] que es un objeto  que pertenece a la clase Empleado
		//a un objeto de la clase Jefatura. Es como cuando tenemos una variable double y la 
		//queremos hacer int. Ej
		//double num1=7.5;
		//int num2=(int) num1
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];//Casting o refundicion
		
		jefa_Finanzas.estableceIncentivo(55000);//Ahora si puedo usar metodo de la clase Jefatura
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a sus empleados"));//Video 50
		
		jefa_Finanzas.establece_bonus(500);
		
		System.out.println("El jefe "+jefa_Finanzas.dameNombre()+" tiene un bonus de "+jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de "+misEmpleados[3].establece_bonus(200));
		/*Empleado director_comercial=new Jefatura("Sandra",85000,2012,05,05);
		Comparable ejemplo=new Empleado("Elizabeth",95000,2012,03,02);
		
		if(director_comercial instanceof Empleado) {//Video 50
			
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("Implementa interfaz Comparable");
		}*/
		
		
		//Con un bucle for recorremos los arrays creados y le subimos el sueldo Video35
		
		/*for(int i=0;i<3;i++) {
		
		misEmpleados[i].subeSueldo(5);
	}
	

	//Con otro bucle for vemos la informacion
	for(int i=0;i<3;i++) {
		
		System.out.println("Nombre: "+ misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()+" Fecha de Alta: "
				+misEmpleados[i].dameFechaContrato());*/
		
		//subimos el sueldo con un bucle for mejorado (video35)
for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}

//Video 49 ordenar a todos los empleados por sueldo de menor a mayor
//Se hace con lo que se conoce como interfaz

Arrays.sort(misEmpleados);//Este metodo sort de la clase Arrays del tipo estatico nos obliga
//a implementar una interfaz (ver API JAVA clase Arrays metodo sort para objects). Lo tiene
//q implementar la clase que contiene a los objetos Empleados (interfaz Comparable)



//Idem con los datos generales
for(Empleado e: misEmpleados) {
	
	System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+e.dameSueldo()+" Fecha de Alta: "
			+e.dameFechaContrato()+" y el ID es "+Empleado.IdSiguiente);
}

		
		
	
	
		
		
		
		
		
		
		
		
		

	}

}
//Video 33
class Empleado implements Comparable,Trabajadores{//Cuando se programa todo dentro de un solo fichero o clase, solo la main
	//es la clase publica. Esta clase genera el objeto tipo empleado
	//Implementamos la interfaz Comparable para poder ordenar todos los empleados segun el sueldo (Video49)
	//no se pueden instanciar objetos pertenecientes a una interfaz
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {//El constructor recibe parametros
		//El constructor lo armamos en el video 34
		nombre=nom;//aca decimos q la variable nombre va a tomar el valor del parametro nom
		
		sueldo=sue;
		
		//usamos el objeto GregorianCalendar (ver api de java) que arma un objeto que es una fecha (el mes arranca Enero=0)
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato=calendario.getTime();//con el objeto calendario, a traves del metodo getTime(), almacenamos los datos de calendario
		
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	//Variables de clase (o variables de la clase). En POO es lo mismo si se declaran
	//antes o despues del constructor. (Video 33)
	private String nombre;
	
	private double sueldo;
	
	private int Id;
	
	public static int IdSiguiente;//La variable static significa que es una variable de la clase
	//es decir, es una variable que puede no es unica para un objeto en particular, sino que pertenece
	//a la clase per se.
	
	private Date altaContrato;//esta variable no es del tipo primitivo (int, double, boolean)
	//Si no que es del tipo objeto, como las String. En el claso de String, pertenece
	//al paquete por defecto de Java que es el paquete java.lang
	//la clase Date pertenece al paquete java.util . Seria una variable del tipo Date entonces
	
	
	//Video 39 - Sobrecarga de constructores
	//Usamos varios constructores cuando le queremos dar un estado inicial diferente a nuestros objetos
	//para que haya varios constructores, no pueden compartir la misma cantidad y orden de parametros
	public Empleado(String nom) {
		
		//nombre=nom; Esta seria la instruccion para que el parametro del argumento defina la variable nombre
		//Pero quedarian datos sin llenar porque los desconocemos(Video 39)
		this(nom, 30000, 2000,01,01);//Cuando ponemos el this dentro de un constructor, lo que hace
		//es establecer el valor a la variable segun parametro, y los otros datos los asigna al constructor
		//con el que coincida los parametros. En este caso hay un solo constructor mas. De esta forma
		//a todos los objetos que solo sepamos el nombre, se le asignara por defecto el sueldo y fecha de alta
		//Establecidos dentro del this, que ingresaran por defecto en la linea de codigo del otro constructor (video 39)
		//Si en una clase de java no hay constructor, solo metodos, se sobreentiende que el constructor es uno
		//por defecto vacio, con el mismo nombre que la clase
		Id=IdSiguiente;
		IdSiguiente++;
	
	}
	
	//Video 34
	public String dameNombre() {//getter
		return nombre;
	}
	
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
	
	
public int compareTo(Object miObjeto) {//Este metodo es obligacion implementarlo para una 
	//interfaz Compare (Video 49)
	
	Empleado otroEmpleado=(Empleado)miObjeto;//Refundicion, paso la variable Empleado a una variable
	//del tipo miObjeto
	
	if(this.sueldo<otroEmpleado.sueldo) {//El metodo compareTo devuelve 1 si es mayor, -1 si es menor, o 0 si es igual
		
		return -1;
	}
	if(this.sueldo>otroEmpleado.sueldo) {
		
		return 1;
	}
	return 0;
}//Video 49
	
}

	final class Jefatura extends Empleado implements Jefes{//Video 42 - Diseñamos una clase jefe que herede de la clase empleado
		//Para ello usamos la pregunta "... es un ... y saber si definimos bien la herencia
		//Ej. un jefe siempre es un empleado. un empleado no siempre es jefe
		//Si dejamos la clase sin constructor, java entiende que estamos llamando al constructor por defecto
		//de la clase padre
		//con el final hacemos que nadie pueda heredar de la clase Jefatura (video 44)
		//lo mismo pasa con los metodos. Si al metodo DameSueldo que esta en la clase Empleado y en la clase Jefatura
		//Le agregamos el final en la clase padre (Empleado) no se puede utilizar ese nombre para un metodo en Jefatura
		//Ej el metodo de la clase Calendar
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue,agno, mes, dia);//los dos constructores de la clase padre requieren de parametros
		//por eso estamos obligado a colocar parametros para que java sepa a cual llamar. Sino, habra error.
		
	}
	
	public String tomar_decisiones(String decision) {//Video 50. Implementamos la interfaz Jefes
		//Si implementa la interfaz Jefe si o si tiene que usar el metodo.
		
		return "Un miembro de la direccion ha tomado la decision de: "+ decision;
	}
	public double establece_bonus(double gratificacion) {//video 51. Al heredar la interfaz jefe de Empleados
		//nos vemos obligados a utilizar los metodos que hereda
		
		double prima=2000;//le damos un extra por ser jefe, a diferencia de lso empleados.
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
//Por convencion se colocan primero los metodos y luego las variables de clase
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {//El triangulo verde significa que se esta sobreescribiendo el
		//metodo dameSueldo() que ya esxiste en la clase Coche (Video 42)
		double sueldoJefe=super.dameSueldo();//utilizando super estamos haciendo que llame al 
		//dameSueldo de la clase padre y no al de la clase hija
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;//Le vamos a dar un incentivo a los jefes
	
	
	
	
	
}
	
	//Video 44
	
	/*class Director extends Jefatura{
		
		public Director (String nom, double sue, int agno, int mes, int dia) {
			
			super( nom,  sue, agno,  mes,  dia);
			
		}
	}*/ 
	//Hacemos una clase Director, pero como la clase Jefatura le agregamos final, corta la herencia
	//y no se pueden seguir haciendo clases que hereden de ella (da error)

