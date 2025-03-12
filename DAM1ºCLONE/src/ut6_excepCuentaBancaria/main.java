package ut6_excepCuentaBancaria;
import java.util.Scanner;
/**
 * @author ferma
 */
public class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Cantidad a depositar: ");
            double cantidadDeposito = scanner.nextDouble();
            cuenta.depositar(cantidadDeposito);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al depositar: " + e.getMessage());
        }

        try {
            System.out.print("Cantidad a retirar: ");
            double cantidadRetiro = scanner.nextDouble();
            cuenta.retirar(cantidadRetiro);
        } catch (IllegalArgumentException e) {
            System.out.println("Error de retirada: " + e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
        scanner.close();
    }
}
