package exercicios;

import java.util.Scanner;

// Exercício 9: Calcular a potência (base ^ expoente)
public class Exercicio09 {

    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente (>= 0): ");
        int expoente = sc.nextInt();

        if (expoente < 0) {
            System.out.println("Use um expoente maior ou igual a zero.");
        } else {
            System.out.println(base + "^" + expoente + " = " + calcularPotencia(base, expoente));
        }
        sc.close();
    }
}
