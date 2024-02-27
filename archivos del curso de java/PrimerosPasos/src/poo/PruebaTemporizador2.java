//Video53, vamos a crear un temporizador pero que contenga una clase interna (o Inner Class)
//las clases internas son una clase dentro de otra, que permite encapsular metodos para que no
//sean visibles desde otras clases, incluso dentro del mismo paquete, entre otras coas

package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer; //importamos las mismas clases que en PruebaTemporizador
import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj=new Reloj(3000,true);//creamos el objeto reloj con los parametros del constructor
		
		mireloj.EnMarcha();//entramos al metodo EnMarcha para que comience a temporizar
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {//constructor clase Reloj
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}
	
	public void EnMarcha(){//las mismas acciones de PruebaTemporizador las hacemos ahora, solo que dentro
		//de un metodo
		
		//CLASE INTERNA LOCAL VIDEO 54
		class DameLaHora2 implements ActionListener{//Clase interna local
			//permite simplificar codigo. Se usa cuando solo la clase la instanciamos una sola vez
			//puede acceder a los campos de clase a la que esta englobada
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3 seg "+ahora);
				
				if(sonido) {//sonido sin nada significa que es =tue o lo mismo if(sonido==tue), eso en booleans
			
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo,oyente);
		
		mitemporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
/*	private class DameLaHora2 implements ActionListener{//Clase interna, se encuentra dentro de las llaves de la clase Reloj
		//solo las clases internas pueden llevar el modificador private o por defecto
		
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora=new Date();
			
			System.out.println("Te pongo la hora cada 3 seg "+ahora);
			
			if(sonido) {//sonido sin nada significa que es =tue o lo mismo if(sonido==tue), eso en booleans
				//Vemos que sonido es un campo de ejemplar o variable que no pertenece a la
				//clase DameLaHora2, pero al ser esta clase una clase interna de la clase Reloj
				//a la que pertenece esa variable, puede acceder a los datos de ella sin necesidad de metodos
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}*/
	
}