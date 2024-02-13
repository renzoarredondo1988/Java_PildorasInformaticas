
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix={
				{3,31,2,4,6},
				{4,5,6,3,7},
				{1,3,4,22,11},
				{2,23,13,33,43}
		};
		
	/*	matrix[0][0]=3;
		matrix[0][1]=31;
		matrix[0][2]=2;
		matrix[0][3]=4;
		matrix[0][4]=6;
		
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[1][3]=3;
		matrix[1][4]=7;
		
		matrix[2][0]=1;
		matrix[2][1]=3;
		matrix[2][2]=4;
		matrix[2][3]=22;
		matrix[2][4]=11;
		
		matrix[3][0]=2;
		matrix[3][1]=23;
		matrix[3][2]=13;
		matrix[3][3]=33;
		matrix[3][4]=43;*/
							//anulo para probar el array de forma sencilla
		
		/*for(int i=0;i<4;i++) {
			System.out.println();//para que quede en forma de tabla
			
			for(int j=0;j<5;j++) {// hasta que no se resuelva el bucle de la j que esta dentro, no va a avanzar dentro del otro bucle
				
				System.out.print(matrix[i][j]+"  ");
			}*/ 
			//Vamos a anular para usar el for each mejorado
		
		
			for(int[]fila:matrix) {
				
				System.out.println();
				
				for(int z: fila) {
					
					System.out.print(z+" ");
				}
		}
	}

}
