package poo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Video 41
		Coche micoche1=new Coche();//Instanciar o crear un objeto
		//cuando instanciamos un objeto, lo que hace el programa es saltar al constructor
		//que compone a ese objeto.

		
		micoche1.establece_color(JOptionPane.showInputDialog("Introduce color"));//El metodo tiene un parametro String, lo que
		//nos obliga a que cuando lo llamamos, hay que si o si pasarle ese parametro
		
		System.out.println( micoche1.dime_color());
		
		micoche1.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println( micoche1.dime_asientos());
		
		micoche1.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println( micoche1.dime_climatizador());//Hasta aca video 32
		
		
		//Video 41
		Furgoneta mifurgoneta1=new Furgoneta(7,580);//El constructor de la variable furgoneta requiere de 2 parametros:plazas y cap de carga
		
		mifurgoneta1.establece_color("azul");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales()+" "+ micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales()+" "+ mifurgoneta1.dimeDatosFurgoneta());
		
		
		
		
		
		
		
		
		
		
		
	//	Coche Renault=new Coche();//INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		
	//	System.out.print(Renault.dime_largo());
		
		//System.out.println("Este coche tiene "+Renault.ruedas+" ruedas.");

	/*	Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("�Tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("�Tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio del coche es "+micoche.precio_coche());*/
		
	}

}
