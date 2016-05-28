package cantidad_a_pagar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

	byte cantidad;
        float precio, total;
        BufferedReader a =  new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Introduzca la cantidad del producto que va a llevar: ");
        cantidad = Byte.parseByte (a.readLine());

        System.out.println("Introduzca el precio de una unidad que va a llevar: ");
        precio = Float.parseFloat (a.readLine());

        total = cantidad * precio;

        System.out.printf(" %.2f El total de la venta seria de: " , total);

    }
}
