package descuento_de_quince_porciento;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        double compra, descuento, total;
        BufferedReader a = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Introduzca el total de su compra: ");
        compra = Double.parseDouble (a.readLine());

        descuento = (compra * 0.15);
        total = compra - descuento;
        System.out.printf(" El descuento es de: %.2f" , descuento);
        System.out.printf("  y el total a pagar es de: %.2f" , total);
    }
}
