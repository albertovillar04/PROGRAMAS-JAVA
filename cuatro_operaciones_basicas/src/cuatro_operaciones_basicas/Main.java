package cuatro_operaciones_basicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        int n1, n2, suma, resta, mult, modular;
        float divi;
        BufferedReader a = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Introduzca dos numeros enteros: " );
        n1 = Integer.parseInt(a.readLine());
        n2 = Integer.parseInt(a.readLine());

        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        divi = (float) n1 / (float) n2;
        modular = n1 % n2;

        System.out.println(" Los numeros introducidos fueron " + n1 + " y " + n2);
        System.out.println("La suma es de " + suma + " y la resta es de " + resta);
        System.out.println("La multiplicacion fue de " + mult + ", La division es de "+ divi + " y el resto de "+ modular);


    }
}
