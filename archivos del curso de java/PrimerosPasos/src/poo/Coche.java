package poo;

//Video 29, 30, 31, 32
public class Coche {
	
	//Atributos
	private int ruedas;//el modificador de acceso prrivate hace que no se pueda modificar
	//la variable ruedas desde otra clase que no sea la clase Coche
	//solo podremos acceder a ese valor desde la clase a la que pertenece
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	
	//Las caracteristicas de arriba, estan dentro del constructor. Son comunes a los
	//objetos que instanciemos del tipo coche. Las de abajo, seran las que diferencien
	//un objeto de otro.
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche() {//METODO CONSTRUCTOR - TIENE EL MISMO NOMBRE DE LA CLASE - MODIFICADOR PUBLIC PARA QUE SE PUEDA ACCEDER A ELLA DESDE CUALQUIER CLASE
		
	ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;//
		
	}
	
	//El modificador public significa que se puede acceder al getter desde cualquier clase
	public String dime_datos_generales() { //GETTER
		
		return "La plataforma del vehiculo tiene "+ ruedas + " ruedas. " + "Mide "+ largo/1000+
				" metros con un ancho de "+ancho+" cm y un peso de plataforma de "+peso_plataforma+" kg";
	}
	
	
	//El void significa que el metodo no devuelve ningun valor
	//el argumento o parametro que tiene dentro del parentesis es lo q se conoce como
	//paso de parametro. Basicamente indica que cuando llamemos al metodo estable_color
	//lo haremos pasandole un parametro. En este caso del tipo String
	public void establece_color(String color_coche) { //SETTER
		
		color=color_coche;//a la variable color, le estamos dando el valor de la variable del parametro
	}

	public String dime_color() {//Getter
		
		return "El color del coche es "+color;
	}
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		
		if(asientos_cuero.equalsIgnoreCase("si")) {//En este caso, como la variable asientos_cuero no lleva
			//el this, se sobreentiende que java esta haciendo referencia al valor del argumento
			this.asientos_cuero=true;//El operador this sirve para diferenciar la
			//variable de clase, o variable inicializada en la clase, con la variable
			//del argumento. El lado que lleva el this hace referencia a la variable de clase
			//En string no se usa el "==", eso es para booleanos, por eso el metodo equals.
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() {//GETTER
		
		if(asientos_cuero==true) {//En este caso, como el GETTER no lleva argumento,
			//java ya sabe que esta haciendo referencia a la variable de la clase asientos_cuero 
			
			return "El coche tiene asientos de cuero ";

			
		}else {//En un getter, como si o si debe devolver un return, en el caso del if siempre va a pedir un else
			//para asegurarse que devuelva un return en todos los casos (Video 31)
			
			return "El coche tiene asientos de serie ";
		}
	}
		
	public void configura_climatizador(String climatizador) {//SETTER Video 32
		
		if(climatizador.equalsIgnoreCase("si")) {//Los string no se comparan con ==
			//se debe usar un metodo string, que es el equals.
			this.climatizador=true;
					}
		else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {//GETTER
		if(climatizador) {//si obviamos que climatizador==true, se sobre entiende que el booleano esta consultando si es igual a true por defecto
			return "El coche incorpora climatizador";
		}else {
			return "el coche lleva aire acondicionado";
		}
		
			}
	
	public String dime_peso_coche() {//SETTER+GETTER Video 32
		int peso_carroceria=500;//Esta variable esta declarada dentro del metodo
		//por lo que solo se puede ver dentro de dicho metodo (ambito de una variable)
		
		peso_total=peso_plataforma+peso_carroceria;//Si la variable la declaro dentro de un metodo, solo la puedo usar dentro de el
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;//si tiene asientos de cuero se le agrega 50kg
		}
		if(climatizador==true) {
			peso_total=peso_total+20;//Idem q asientos de cuero pero con 20kg
		}
		
		return "E peso del coche es "+peso_total;
	}
	
	public int precio_coche() {//GETTER Video 32
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {//si tiene asientos de cuero aumenta el precio
			precio_final+=2000;
		}
		
		if(climatizador==true) {//si tiene climatizador aumenta el precio
			precio_final+=1500;
		}
		return precio_final;//devuelve un int tal cual indico el metodo
	}
	
}
