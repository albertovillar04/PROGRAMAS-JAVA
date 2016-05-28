package comisiones_de_venta;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        double v1, v2, v3, salario, comision, total;
        BufferedReader a = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Introduzca su salario base: ");
        salario = Double.parseDouble(a.readLine());
        System.out.println("Introduzca su venta #1: ");
        v1 = Double.parseDouble(a.readLine());
        System.out.println("Introduzca venta #2: ");
        v2 = Double.parseDouble(a.readLine());
        System.out.println("Introduzca venta #3: ");
        v3 = Double.parseDouble(a.readLine());

        comision = ((v1+v2+v3)*0.10);
        total = comision + salario;

        System.out.println("Su salario base es: " + salario + " su venta #1 " +
                "fue de " + v1 + " , su venta #2 fue de " + v2 + " y su venta #3 fue de " + v3);
        System.out.println("Su comision es de: " + comision + " , su saldo total sera de " + total);

    }
}
