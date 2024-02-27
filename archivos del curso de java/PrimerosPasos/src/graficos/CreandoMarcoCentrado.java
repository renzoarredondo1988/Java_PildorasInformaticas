//Video 57
package graficos;

import java.awt.Toolkit;

import javax.swing.*;

import java.awt.*;

//con lo visto en el video anterior haremos un marco o ventana que quede centrado

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();//este metodo devuelve un objeto del tipo
		//Toolkit, por eso hay q declararlo
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Marco centrado");
		
		Image miIcono=mipantalla.getImage("src/graficos/icono.jpg");//pegue una foto mia ahi
		//el gallego recomienda pegar las imagenes en donde la clase que corresponda
		//la ubicacion es la ubicacion relativa
		
		setIconImage(miIcono);
		
	}
	
}
