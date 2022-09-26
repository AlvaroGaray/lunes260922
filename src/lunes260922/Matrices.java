package lunes260922;
import java.util.*;
public class Matrices {

	public static void main(String[] args) {

		Scanner es= new Scanner(System.in);

		//Declaraciones de Matrices
		//int [][] MatrizA=new int [2][2];  2 filas y 2 columnas

		System.out.print("Ingrese el tamaño de la MatrizA, Filas: ");
		int filasA=es.nextInt();
		System.out.print("Ingrese el tamaño de la MatrizA, Columnas: ");
		int columnasA=es.nextInt();

		System.out.print("Ingrese el tamaño de la MatrizB, Filas: ");
		int filasB=es.nextInt();
		System.out.print("Ingrese el tamaño de la MatrizB, Columnas: ");
		int columnasB=es.nextInt();

		if((filasA==filasB)&& (columnasA==columnasB)) {

			int [][] MatrizA=new int [filasA][columnasA];
			int [][] MatrizB=new int [filasB][columnasB];
			int filasuma=filasB;
			int columnasuma=columnasB;
			int [][] suma=new int [filasB][columnasB]; 


			System.out.println("Datos de la MatrizA");
			for(int i=0; i<filasA;i++) {			
				for(int j=0; j<columnasA;j++) {	

					System.out.print("Dato ("+i +"," + j + " ) = ");
					MatrizA[i][j]=es.nextInt();
				}
			}

			System.out.println("Datos de la MatrizB");
			for(int i=0; i<filasB;i++) {			
				for(int j=0; j<columnasB;j++) {	

					System.out.print("Dato ("+i +"," + j + " ) = ");
					MatrizA[i][j]=es.nextInt();
				}
			}
			
			//Sumar lo elementos de las matrices

			System.out.println("Datos de la Suma de las Matrices");
			for(int i=0; i<filasuma;i++) {			
				for(int j=0; j<columnasuma;j++) {	

					suma[i][j]=MatrizA[i][j]+MatrizB[i][j];
				}
			}
			
			//Mostrar datos de la MAtriz A
			System.out.println("Datos de la MatrizA");
			for(int i=0; i<filasA;i++) {			
				for(int j=0; j<columnasA;j++) {	

				System.out.println(MatrizA[i][j]+ " ");
					
				}
				System.out.println();
			}
			
			//Mostrar datos de la MAtriz B
			System.out.println("Datos de la MatrizB");
			for(int i=0; i<filasB;i++) {			
				for(int j=0; j<columnasB;j++) {	

				System.out.println(MatrizB[i][j]+ " ");
					
				}
				System.out.println();
			}
			
			//Mostrar datos de la MAtriz suma
			System.out.println("Datos de la Suma");
			for(int i=0; i<filasuma;i++) {			
				for(int j=0; j<columnasuma;j++) {	

				System.out.println(suma[i][j]+ " ");
					
				}
				System.out.println();
			}
			
		}else {
			System.out.println("Las Matrices no son Compatibles.");
		}


	}




}


