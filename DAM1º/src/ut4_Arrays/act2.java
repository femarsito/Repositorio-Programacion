package ut4_Arrays;

public class act2 {

//Crea un método que reciba un Array de Strings y muestre la String más larga.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"hola", "mundo", "java", "que tal estas"};
        System.out.println("El String mas largo es: " + encontrarMasLarga(array));
    }

    public static String encontrarMasLarga(String[] array) {
        String MasLarga = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > MasLarga.length()) {
                MasLarga = array[i];
            }
        }
        return MasLarga;
	}

}
