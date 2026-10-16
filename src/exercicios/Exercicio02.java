package exercicios;

import java.util.Scanner;

// Exercício 2: Função que soma dois números
public class Exercicio02 {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + somar(n1, n2));
        sc.close();
    }
}
