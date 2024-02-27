//VIDEO 52 creamos temporizador

package poo;

import javax.swing.*;//necesitamos usar la clase timer para hacer un temporizador
//en programacion un temporizador es un programa que envia un mensaje o hace una accion
//pasado un cierto tiempo. Lo haremos con la clase timer del paq. javax swing

import java.awt.Toolkit;
import java.awt.event.*; //clase para poder importar evento
import java.util.*;//para usar el objeto tipo Date

import javax.swing.Timer; //tanto el paquete java.swing como el java.util tienen una clase Timer
//para que java distinga cual tiene que usar, y yo estar importando ambos paquetes completos,
//tengo que especificarle a Java la clase a usar

public class PruebaTemporizador {//Video52 Interfases

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente=new DameLaHora();//usa el constructor por defecto, aquel q no requiere parametros
		Timer mitemporizador=new Timer(5000,oyente);//Constructor de la clase Timer
		//Si vamos a la api de java vemos que lleva un int que es tiempo delay en milisegundos
		//y un objeto del tipo interfaz del tipo ActionListener
		//esto nos obliga a crear una clase que implemente la interfaz ActionListener
		//en otros lenguajes se hace similar, salvo que en lugar de usar el objeto "oyente"
		//directamente se hace una funcion. Esto es xq Java es 100% orientado a objetos
		
		mitemporizador.start();//metodo de la clase Timer que empieza a contar el timepo
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");//para que el programa siga andando
	}

}

class DameLaHora implements ActionListener{//hacemos la clase que implemente ActionListener
	
	public void actionPerformed(ActionEvent e) {//la interfaz ActionListener nos obliga a usar
		//todos los metodos que contiene. En este caso, solo contiene uno llamado actionPerformed
		//que recibe como parametro un evento.
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos "+ahora);
		
		Toolkit.getDefaultToolkit().beep();//metodo de la clase toolkit que hace un sonido 
		//cada vez que se ejecuta Video53
		
	}
}