package exercicios;

import java.util.Scanner;

// Exercício 8: Calcular o fatorial de um número
public class Exercicio08 {

    // long para aguentar números maiores (até 20!)
    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            System.out.println(n + "! = " + calcularFatorial(n));
        }
        sc.close();
    }
}
