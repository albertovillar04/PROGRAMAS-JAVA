package tanto_por_ciento;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//programa que sacara el 10% de un  entero  introducido por teclado

public class Main {

    public static void main(String[] args) throws Exception {
	int num;
        double porciento;
        BufferedReader a= new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Introduzca un numero ENTERO: ");
        num = Integer.parseInt(a.readLine());
        porciento = num * 0.10;
        System.out.print("El 10% de su numero introducido es: %.2f " , porciento);


    }
}
