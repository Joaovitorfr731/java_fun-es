package exercicios;

import java.util.Scanner;

// Exercício 5: Calcular a média de três notas
public class Exercicio05 {

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double media = calcularMedia(n1, n2, n3);
        System.out.printf("Média do aluno: %.2f%n", media);
        sc.close();
    }
}
