package primerprograma;


import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws Exception{
  double n1,n2,n3;
        double prom;
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca una nota: ");
        n1= Double.parseDouble(a.readLine ());
        System.out.println("Introduzca una nota: ");
        n2= Double.parseDouble(a.readLine ());
        System.out.println("Introduzca una nota: ");
        n3= Double.parseDouble(a.readLine ());

        prom=(n1+n2+n3)/3;

        System.out.println("El promedio es: " + prom);

    }
}
