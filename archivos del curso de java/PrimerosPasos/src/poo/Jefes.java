package poo;

public interface Jefes extends Trabajadores{//Creamos nuestra propia interfaz (Video50)
	//Vemos q la interfas Jefe hereda de trabajadores, al igual que las clases
	
	public abstract String tomar_decisiones(String decision);//una interfaz solo puede tener metodos publicos y abstractos. Si no ponemos nada se sobreentiende por defecto
//En una interfaz los metodos solo se definen, no se desarrollan
}
