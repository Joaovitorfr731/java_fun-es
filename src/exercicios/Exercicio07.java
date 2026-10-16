package exercicios;

import java.util.Scanner;

// Exercício 7: Determinar o maior de três números
public class Exercicio07 {

    public static int maiorNumero(int a, int b, int c) {
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();
        System.out.print("Terceiro número: ");
        int c = sc.nextInt();

        System.out.println("O maior número é " + maiorNumero(a, b, c));
        sc.close();
    }
}
