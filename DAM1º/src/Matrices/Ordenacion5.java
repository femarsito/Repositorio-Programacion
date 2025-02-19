package Matrices;

public class Ordenacion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] calificaciones = new int [3][];
calificaciones [0] = new int [] {6, 8, 3, 7, 9, 2, 4};
calificaciones [1] = new int [] {9, 1, 3, 5};
calificaciones [2] = new int [] {3, 6, 7, 2, 4};

System.out.println("Calificaciones por materia");
for (int [] fila : calificaciones ) {
	for (int elemento : fila) {
		System.out.print(elemento + "  ");
	}
	System.out.println();
}

for (int i = 0 ; i < calificaciones.length ; i++) {
	System.out.println("El promedio de las notas es de: " + promedio(calificaciones[i]));

}
int califAlta = calificaciones[0][0];
int califBaja = calificaciones[0][0];
for (int fila = 0 ; fila < calificaciones.length ; fila++) {
	for (int columna = 0 ; columna < calificaciones[fila].length; columna++) {
		if (califAlta < calificaciones[fila][columna]) {
			califAlta = calificaciones[fila][columna];
		}
		if (califBaja > calificaciones[fila][columna]) {
			califBaja = calificaciones[fila][columna];
		}
		}
}
System.out.println("La calificacion más alta es:" + califAlta);
System.out.println("La calificacion más baja es:" + califBaja);

	}
public static double promedio (int [] calificaciones) { //metodo para promedio
	double suma = 0;
	for (int calificacion : calificaciones) {
		suma += calificacion;
	}
	return suma / calificaciones.length;
}
}
