package graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.geom.*;

//Video 59

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos() {
		
		setTitle("Prueba con dibujos");
		
		setSize(400,400);
		
		LaminaConFiguras miLamina=new LaminaConFiguras();
		
		add(miLamina);
		
		
	}
	
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {//dentro de la clase Graphics hay varios metodos
		//para dibujar figuras (ver API)
		//La clase Graphics es una clase bastante vieja de JAVA, por lo que es limitada
		//luego de la misma viene otra mejorada que se llama Geom (Java 2D) totalmente orientada a objeto
		//que permite modificar grosores, girar objetos, etc
		super.paintComponent(g);
		
		/*g.drawRect(50,50, 200, 200);//los primeros dos valores dan el vertice izquierdo, los otros dos ancho y alto del rectangulo
	
		g.drawLine(100,100,200,200);//Video59 */
		
		Graphics2D g2=(Graphics2D) g;//Refundicion. Pasamos un objeto del tipo g a un objeto del tipo Graphics2D
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,250);//Principio  de sustitucion
		//la clase Rectangle2D nos obliga a instanciar objeto. Son clases que obligan si o si a instanciar
		//objetos
		//la clase Rectangle2D hereda de Rectangle2D.Double podemos hacerlo como cuando teniamos
		//la clase Empleado = new Persona...
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroX=rectangulo.getCenterX();
		
		double CentroY=rectangulo.getCenterY();
		
		double radio=125;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroX, CentroY, CentroX+radio, CentroY+radio);
		
		g2.draw(circulo);
	
	}
	
	
}