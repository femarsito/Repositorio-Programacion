 package Matrices;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] matriz = { 
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
};
for (int [] fila : matriz) { //Recorre cada fila
	for (int elemento : fila) { //Recorre cada elemento de la fila
		System.out.print(elemento + " "); //Imprime los elementos de la fila
	}
	System.out.println(); //Salto de linea al terminar la fila
}

	}

}
