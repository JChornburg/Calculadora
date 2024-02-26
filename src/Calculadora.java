import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero1 = teclado.nextDouble();
        char operador = teclado.next().charAt(0);
        double numero2 = teclado.nextDouble();

        if (operador == '+') {
            double resultado = numero1 + numero2;
            System.out.println("= " + resultado);
        }

        else if (operador == '-') {
            double resultado = numero1 - numero2;
            System.out.println("= " + resultado);
        }

        else if (operador == '*') {
            double resultado = numero1 * numero2;
            System.out.println("= " + resultado);
        }

        else if (operador == '/') {
            double resultado = numero1 / numero2;
            System.out.println("= " + resultado);
        }

        else {
            System.out.println("Operador não identificado");
        }
        teclado.close();
    }
}