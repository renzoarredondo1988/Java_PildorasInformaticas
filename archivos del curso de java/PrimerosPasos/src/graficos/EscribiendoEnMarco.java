//Video 58 

//hay que entender que la parte grafica de las ventanas funciona con "laminas" equivalente a las 
//capas del autocad.

package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto miMarco=new MarcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {//constructor que crea una ventana segun las caracteristicas de los metodos
		
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Primer texto");
		
		Lamina miLamina=new Lamina();//instanciamos a la clase Lamina para traernos sus metodos
		
		add(miLamina);//agregamos a la lamina para cuando llame al costructor de la clase principal
	}
}

class Lamina extends JPanel{//la clase JPanel tiene 4 constructores. Al no poner ninguno, estaremos
	//usando el que se encuentra por defecto. La clase JPanel responde a una herencia de otras clases
	//Y hereda muchisimos metodos
	
	public void paintComponent(Graphics g) {//sobre escribimos el metodo de la clase que hereda
		//el metodo paintComponent para darle los valores que nosotros querramos
		//vemos que devuelve un objeto del tipo Graphics con nombre g
		
		super.paintComponent(g);//para que el metodo paintComponent haga lo que tiene que hacer
		//o sea, para lo que fue programado en su momento, hay que invocarlo.
		
		g.drawString("Estamos aprendiendo String",100, 100);//el 100 y 100 significa que 
		//el texto estara a 100px del borde del marco en las x y en las y
		
		
	}
	
	
	
}