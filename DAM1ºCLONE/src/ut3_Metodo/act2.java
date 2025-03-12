package ut3_Metodo;

public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 4;
int solucion = cubo(a);
System.out.println("El resultado es " + solucion );
	}
static int cubo(int lado) {
	int resultado= lado*lado*lado;
	return resultado;
}
}
