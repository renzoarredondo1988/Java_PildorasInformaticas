package graficos;

import java.awt.Frame;

import javax.swing.*;//Video 55

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);//metodo para que aparezca la ventana
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//con este metodo le decimos que
		//cuando se cierre la ventana nuestro programa tiene q acabar. Es importante decirle al programa
		//q hacer con las ventanas (video 55) si no ponemos este metodo, cuando cerremos la ventana
		//el programa seguira ejecutandose.

	}

}

class miMarco extends JFrame{//al heredar de JFrame puedo utilizar todos los metodos dentro de ella
	
	public miMarco() {//Constructor
		
		//setSize(500,300);//le damos tamaño a nuestro marco o ventana (o frame en ingles)
		//por defecto, todas las ventanas tienen un tamaño 0 de alto y 0 de ancho.
		//el tamaño de pixeles depende de la resolucion de la pantalla
		
		//video 56
		//setLocation(500,300);//metodo para ubicar la ventana en una coordenada especifica (ver API)
		//El 0,0 es en la esquina izqu superior de la pantalla x positivo a la derecha y positivo hacia abajo
		//y los otros dos parametros son ancho y alto, en este caso un cuadrado
		setBounds(500,300,550,250);
		
		//setResizable(false);//con ese metodo no permite que se pueda modificar con el mouse el tamaño de la ventana
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);//la ventana o marco se abre a pantlla completa
		//si vamos a la API vemos que MAXIMIZED_BOTH es una variable de clase, estatica, de la clase Frame,
		//y que es un valor int, igual a 6, podriamos poner 6 q es lo mismo
		
		setTitle("Mi ventana");
		
		
		
	}
}