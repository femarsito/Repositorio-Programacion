package ut2_practica2;

import java.util.Scanner;

public class act8 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Escribe su tipo de membresía (A, B, o C): ");
        String tipoMembresia = leer.nextLine().toUpperCase();
        
        System.out.print("Indique el monto de su compra: ");
        double cantidadCompra = leer.nextDouble();
        
        double descuento = 0;
        
        switch (tipoMembresia) {
            case "A":
                descuento = 0.30; 
                break;
            case "B":
                descuento = 0.20; 
                break;
            case "C":
                descuento = 0.10; 
                break;
            default:

                System.out.println("Tipo de membresía inválido.");
                leer.close(); 
                return; 
        }
        

        double cantidadDescuento = cantidadCompra * descuento;
        double montoFinal = cantidadCompra - cantidadDescuento;
        

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Cantidad de descuento: $" + cantidadDescuento);
        System.out.println("Monto final a pagar: $" + montoFinal);

        leer.close();
    }
}