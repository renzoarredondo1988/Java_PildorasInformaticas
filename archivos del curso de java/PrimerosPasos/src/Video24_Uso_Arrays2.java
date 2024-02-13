import javax.swing.*;
public class Video24_Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []paises=new String[8];
		
		for(int i=0;i<8;i++) {
			
		paises[i]=JOptionPane.showInputDialog("Introduce pais "+ (i+1));
		}
		
		/*paises[0]="Espa�a";
		paises[1]="Argentina";
		paises[2]="Suecia";
		paises[3]="Venezuela";
		paises[4]="Colombia";
		paises[5]="Peru";
		paises[6]="Colombia";
		paises[7]="Brasil";*/
		
		/*for(int i=0;i<paises.length;i++) {
			
			System.out.println("Pais "+ (i+1) +" "+ paises[i]);
		}*/
		for(String elemento:paises) {
			
			System.out.println("Pais: "+elemento);
		}

	}

}
