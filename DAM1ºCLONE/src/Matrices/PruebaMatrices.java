package Matrices;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class PruebaMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ARRAYS BIDIMENSIONALES
	// * Arrays.sort(nombres); *

    // *Función para rotar la matriz 90º->*
//    public static int[][] rotarMatriz(int[][] matriz) {
//        int n = matriz.length;
//        int[][] rotada = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                  rotada[j][n - 1 - i] = matriz[i][j]; 
//	270º-> = <-90º: rotada[n - 1 - j][i] = matriz[i][j];
//		      180º: rotada[n - 1 - i][n - 1 - j] = matriz[i][j];
//            }
//        }
//        return rotada;
//    } avion pasaje pasajero personal tripula vuelo

    // *Función para mostrar la matriz*
//    public static void mostrarMatriz(int[][] matriz) {
//        for (int[] fila : matriz) {
//            for (int elemento : fila) {
//                System.out.print(elemento + " ");
//            }
//            System.out.println();
//		}
	String [] listaPalabras = {"Tomate", "Coche", "PC", "Cascos", "Avion",
	"Burbuja", "Movil", "Palo", "Teclas", "Raton"};
	
	int contador = 0;
	for (String palabra : listaPalabras) {
		if (palabra.length() > 4) {
			contador++;
		}
	}
	String [] nuevaLista = new String [contador];
	int p = 0;
	for (int i = 0; i<listaPalabras.length; i++) {
		if (listaPalabras[i].length()>4) {
			nuevaLista[p++]=listaPalabras[i];
		}	
	}
	Arrays.sort(nuevaLista);
	for (String lista : nuevaLista) {
		System.out.print(lista + " ");
	}
	}
	}