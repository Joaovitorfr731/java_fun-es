package exercicios;

import java.util.Scanner;

// Exercício 6: Verificar se um número é par
public class Exercicio06 {

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (verificarPar(n)) {
            System.out.println(n + " é PAR (true)");
        } else {
            System.out.println(n + " é ÍMPAR (false)");
        }
        sc.close();
    }
}
