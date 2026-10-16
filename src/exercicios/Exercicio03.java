package exercicios;

import java.util.Scanner;

// Exercício 3: Função para calcular o dobro de um número
public class Exercicio03 {

    public static int dobrar(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.println("O dobro de " + n + " é " + dobrar(n));
        sc.close();
    }
}
