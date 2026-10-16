package exercicios;

import java.util.Scanner;

// Exercício 10: Calcular o IMC (IMC = peso / (altura * altura))
public class Exercicio10 {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura (m, ex: 1,75): ");
        double altura = sc.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.printf("Seu IMC é %.2f - %s%n", imc, classificarIMC(imc));
        sc.close();
    }
}
