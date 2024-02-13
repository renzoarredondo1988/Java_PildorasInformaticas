import javax.swing.*;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu nombre (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);//lo que estamos diciendo es que repita el bucle do while mientras el JOptionpane noo sea ni M ni F.El IgnoreCase es para que no distinga entre mayuscula y minuscula
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));//el metodo showInputDialog lo que hace es tratar todo como un texto, asi sea un numero.
		
		int pesoideal=0;
				
				if (genero.equalsIgnoreCase("H")) {
					pesoideal=altura-110;
				}
				else if(genero.equalsIgnoreCase("M")) {
					pesoideal=altura-120;
				}
				System.out.println("Tu peso ideal es "+pesoideal);
	}

}
