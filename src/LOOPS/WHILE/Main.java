package LOOPS.WHILE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        int numero, resultado, contador;
        numero = sc.nextInt();

        contador = 1;
        while (contador <= 10) {
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }

        sc.close();
    }
}
