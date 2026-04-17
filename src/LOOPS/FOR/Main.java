package LOOPS.FOR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Digite um numero");
        numero = sc.nextInt();

        // contador = contador + 1
        // contador++           (errado)-> contador = contador++
        // contador += 1

        for (int contador = 1; contador <= 10; contador++){
            if (contador == 5) {
                continue;
            }
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }


        sc.close();

    }
}
