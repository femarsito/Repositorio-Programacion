package Matrices;

public class EjerciciosPreparación {
//	Ejercicio 1: Rota la matriz cuadrada
//	Tienes una matriz cuadrada de 3x3 que necesita ser rotada 90 grados hacia la derecha.
//	Escribe un programa que realice esta rotación. Utiliza funciones para modularizar el código.
//	Pasos a seguir:
//	 Define una matriz inicial de 3x3.
//	 Muestra la matriz original.
//	 Utiliza la función rotaMatrix para rotar la matriz 90 grados hacia la derecha.
//	o La posición [i][j] de la matriz original se coloca en [j][n - 1 - i] en la matriz
//	rotada.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Definir la matriz inicial de 3x3
		int [][] matriz = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		// Mostrar la matriz original
		System.out.println("Matriz sin rotar 90º:");
		mostrarMatriz(matriz);		
		System.out.println();
		// Rotar la matriz 90 grados hacia la derecha
		int[][] matrizRotada = rotaMatriz(matriz);
		System.out.println("Matriz rotada 90º:");
		// Mostrar la matriz rotada
		mostrarMatriz(matrizRotada); 
	}
	// Función para rotar la matriz 90 grados hacia la derecha
	public static int[][] rotaMatriz(int[][] matriz) {
		int n = matriz.length;
		int[][] matrizRotada = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizRotada[j][n - 1 - i] = matriz[i][j];
			}
		}
		return matrizRotada;
	}
	// Función para mostrar la matriz 
	public static int [][] mostrarMatriz(int[][] matriz){
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		return matriz;
		
	}
}