package exercicios;

import java.util.Scanner;

// Exercício 4: Converter graus Celsius para Fahrenheit (F = C * 1.8 + 32)
public class Exercicio04 {

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em °C: ");
        double c = sc.nextDouble();

        System.out.printf("%.1f °C = %.1f °F%n", c, converterCelsiusParaFahrenheit(c));
        sc.close();
    }
}
